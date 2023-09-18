package com.taxjar;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.taxjar.net.Endpoints;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class TaxjarMock extends Taxjar {
    public TaxjarMock(final String apiToken, Interceptor interceptor) {
        this(apiToken, null, interceptor);
    }

    public TaxjarMock(final String apiToken, Map<String, Object> params, Interceptor interceptor) {
        super(apiToken, params);

        if (params != null) {
            for (Map.Entry<String, Object> param : params.entrySet()) {
                try {
                    getClass().getDeclaredField(param.getKey()).set(this, param.getValue());
                } catch (NoSuchFieldException | IllegalAccessException ex) {
                    // No-op
                }
            }
        }

        final OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request.Builder requestBuilder = chain.request().newBuilder()
                                .addHeader("Authorization", "Bearer " + apiToken)
                                .addHeader("User-Agent", getUserAgent());

                        if (headers != null) {
                            for (Map.Entry<String, String> header : headers.entrySet()) {
                                requestBuilder.addHeader(header.getKey(), header.getValue());
                            }
                        }

                        return chain.proceed(requestBuilder.build());
                    }
                }).addInterceptor(interceptor)
                .connectTimeout(this.timeout, TimeUnit.MILLISECONDS)
                .writeTimeout(this.timeout, TimeUnit.MILLISECONDS)
                .readTimeout(this.timeout, TimeUnit.MILLISECONDS)
                .build();

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        objectMapper.configure(DeserializationFeature.EAGER_DESERIALIZER_FETCH, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        objectMapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
        objectMapper.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
        objectMapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(this.apiUrl + "/" + API_VERSION + "/")
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .client(client)
                .build();

        apiService = retrofit.create(Endpoints.class);
    }
}
