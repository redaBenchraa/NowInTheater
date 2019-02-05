package com.example.nowintheather.API;
import com.example.nowintheather.Models.MovieTheater;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieShowTimeApi {

    @GET("cine.json")
    Call<MovieTheater> getMovies();

}
