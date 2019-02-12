package com.example.nowintheather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;
import butterknife.BindView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.nowintheather.Models.MovieShowTime;

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.title)
    TextView title;

    @BindView(R.id.description)
    TextView description;

    @BindView(R.id.video)
    VideoView video;

    @BindView(R.id.audianceRating)
    AppCompatRatingBar audianceRating;

    @BindView(R.id.pressRating)
    AppCompatRatingBar pressRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        MovieShowTime movie = (MovieShowTime) intent.getSerializableExtra("movie");
        title.setText(movie.getOnShow().getMovie().getTitle());
        title.setText(movie.getOnShow().getMovie().getTitle());
        pressRating.setRating(Float.parseFloat(movie.getOnShow().getMovie().getStatistics().getPressRating()));
        audianceRating.setRating(Float.parseFloat(movie.getOnShow().getMovie().getStatistics().getUserRating()));
        video.setVideoPath(movie.getOnShow().getMovie().getTrailer().getHref());
    }
}
