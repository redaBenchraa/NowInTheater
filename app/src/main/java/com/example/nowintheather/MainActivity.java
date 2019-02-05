package com.example.nowintheather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.nowintheather.API.ApiHelper;
import com.example.nowintheather.Models.MovieShowTime;
import com.example.nowintheather.Models.MovieTheater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MovieAdapter.OnMovieClickedListener {

    static String TAG = MainActivity.class.getName();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    final LinearLayoutManager llm = new LinearLayoutManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        llm.setOrientation(RecyclerView.VERTICAL);
        mAdapter = new MovieAdapter(getApplicationContext(), new ArrayList<MovieShowTime>(), this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(llm);

        MainActivity activity = this;


        ApiHelper.getInstance().getMoviesApi().getMovies().enqueue(new Callback<MovieTheater>() {
            @Override
            public void onResponse(Call<MovieTheater> call, Response<MovieTheater> response) {
                Log.v(TAG, "Success");
                mAdapter = new MovieAdapter(getApplicationContext(), Arrays.asList(response.body().getMovieShowtimes()), activity);
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<MovieTheater> call, Throwable t) {
                Log.e(TAG, "Error");

            }
        });
    }

    @Override
    public void onMovieClicked(MovieShowTime movie) {
        Log.v(TAG, movie.getOnShow().getMovie().getTitle());
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("movie", movie);
        startActivity(intent);

    }
}
