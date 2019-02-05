package com.example.nowintheather.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelper {
    static String BASE_URL = "http://etudiants.openium.fr/pam/";

    private MovieShowTimeApi moviesApi;

    public MovieShowTimeApi getMoviesApi() {
        return moviesApi;
    }

    private ApiHelper() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        moviesApi = retrofit.create(MovieShowTimeApi.class);
    }

    private static volatile ApiHelper instance;


    public static synchronized ApiHelper getInstance() {
        if (instance == null) {
            instance = new ApiHelper();
        }
        return instance;
    }
}