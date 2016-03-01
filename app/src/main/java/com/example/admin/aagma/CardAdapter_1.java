package com.example.admin.aagma;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class CardAdapter_1 extends RecyclerView.Adapter<CardAdapter_1.ViewHolder>{

    List<Movie> mItems;

    public CardAdapter_1() {
        super();
        mItems = new ArrayList<Movie>();
        Movie movie = new Movie();
        movie.setName("Paper Presentation");
        movie.setThumbnail(R.drawable.paper);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Poster Presentation");
        movie.setThumbnail(R.drawable.poster);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Project Presentation");
        movie.setThumbnail(R.drawable.project);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Technical Quiz");
        movie.setThumbnail(R.drawable.quiz);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Circuit Trix");
        movie.setThumbnail(R.drawable.circuit);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Puzzle");
        movie.setThumbnail(R.drawable.puzzle);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Textathon");
        movie.setThumbnail(R.drawable.text);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Innovatia");
        movie.setThumbnail(R.drawable.innovation);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Quick Electrika");
        movie.setThumbnail(R.drawable.electrical);
        mItems.add(movie);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_card_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Movie movie = mItems.get(i);
        viewHolder.tvMovie.setText(movie.getName());
        viewHolder.imgThumbnail.setImageResource(movie.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvMovie;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvMovie = (TextView)itemView.findViewById(R.id.tv_movie);
        }
    }
}









