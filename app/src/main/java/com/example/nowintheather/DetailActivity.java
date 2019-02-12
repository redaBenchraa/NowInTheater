package com.example.nowintheather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRatingBar;
import butterknife.BindView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.nowintheather.Models.Movie;
import com.example.nowintheather.Models.MovieShowTime;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class DetailActivity extends AppCompatActivity {
    TextView title;

    TextView description;

    YouTubePlayerView youTubePlayerView;

    AppCompatRatingBar audianceRating;

    AppCompatRatingBar pressRating;

    String videoId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }
        setContentView(R.layout.activity_detail);
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        audianceRating = findViewById(R.id.audianceRating);
        pressRating = findViewById(R.id.pressRating);

        Intent intent = getIntent();
        MovieShowTime movie = (MovieShowTime) intent.getSerializableExtra("movie");
        String titleString = "";
        title.setText(movie.getOnShow().getMovie().getTitle());
        float pressRatingFloat = 0.0f;
        float userRatingFloat = 0.0f;
        if(movie != null && movie.getOnShow() != null && movie.getOnShow().getMovie() != null){
            if(movie.getOnShow().getMovie().getStatistics() != null){
                try{
                    pressRatingFloat = Float.parseFloat(movie.getOnShow().getMovie().getStatistics().getPressRating());
                }catch (Exception e){

                }
                try{
                    userRatingFloat = Float.parseFloat(movie.getOnShow().getMovie().getStatistics().getUserRating());
                }catch (Exception e){

                }
            }
            titleString = movie.getOnShow().getMovie().getTitle();
            if(movie.getOnShow().getMovie().getTrailer() != null && movie.getOnShow().getMovie().getTrailer().getHref() != null && movie.getOnShow().getMovie().getTrailer().getHref().split("=").length == 2){
                videoId = movie.getOnShow().getMovie().getTrailer().getHref().split("=")[1];
            }
        }
        pressRating.setRating(pressRatingFloat);
        audianceRating.setRating(userRatingFloat);
        youTubePlayerView = findViewById(R.id.youtube_player_view);
        initYouTubePlayerView();
    }
    private void initYouTubePlayerView() {
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                YouTubePlayerUtils.loadOrCueVideo(youTubePlayer, getLifecycle(), videoId,0f);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() ==  android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
