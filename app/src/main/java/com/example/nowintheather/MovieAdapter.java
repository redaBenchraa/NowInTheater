package com.example.nowintheather;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nowintheather.Models.Genre;
import com.example.nowintheather.Models.MovieShowTime;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<MovieShowTime> movies = new ArrayList<>();
    private Context mContext;
    private OnMovieClickedListener listener;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public MyViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    public MovieAdapter(Context context, List<MovieShowTime> movies, OnMovieClickedListener listener) {
        mContext = context;
        this.movies = movies;
        this.listener = listener;
    }

    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        MovieViewHolder viewHolder = new MovieViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MovieViewHolder holder, final int position) {
        holder.cell.setOnClickListener(v -> listener.onMovieClicked(movies.get(position)));
        holder.bindMovie(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


    public class MovieViewHolder extends RecyclerView.ViewHolder {
        View cell;
        TextView title;
        TextView rating;
        TextView description;
        ImageView poster;
        private Context mContext;

        public MovieViewHolder  (View itemView) {
            super(itemView);
            mContext = itemView.getContext();
            cell = itemView.findViewById(R.id.cell);
            title = itemView.findViewById(R.id.title);
            rating = itemView.findViewById(R.id.rating);
            description = itemView.findViewById(R.id.description);
            poster = itemView.findViewById(R.id.poster);
        }

        public void bindMovie(MovieShowTime movieShowTime) {
            StringBuilder genre = new StringBuilder();
            String releaseDate = movieShowTime.getOnShow().getMovie().getRelease().getReleaseDate();
            for (Genre item: movieShowTime.getOnShow().getMovie().getGenre()) {
                genre.append(item.getName());
                genre.append(" ");
            }
            title.setText(movieShowTime.getOnShow().getMovie().getTitle());
            rating.setText(genre);
            description.setText(releaseDate);
            Picasso.get().load(movieShowTime.getOnShow().getMovie().getPoster().getHref()).into(poster);

        }
    }
    public interface OnMovieClickedListener {
        void onMovieClicked(MovieShowTime movie);
    }
}