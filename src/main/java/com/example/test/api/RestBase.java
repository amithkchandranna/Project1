package com.example.test.api;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class RestBase {
    private static final String BASE_URL = "https://data.sfgov.org/";
    private static Retrofit sClient;

    protected Retrofit getInstance() {
        if (sClient == null) {
            sClient = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return sClient;
    }
}
