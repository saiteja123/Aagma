package com.example.admin.aagma;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class CardAdapter_7 extends RecyclerView.Adapter<CardAdapter_7.ViewHolder>{

   List<Movie> mItems;

   public CardAdapter_7() {
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
       movie.setName("Pharma Quiz");
       movie.setThumbnail(R.drawable.quiz);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Debate");
       movie.setThumbnail(R.drawable.debate);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Filmy Quiz");
       movie.setThumbnail(R.drawable.film);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Slow Cycling");
       movie.setThumbnail(R.drawable.cycling);
       mItems.add(movie);


       movie = new Movie();
       movie.setName("Tug Of War");
       movie.setThumbnail(R.drawable.tug);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Arm Wrestling");
       movie.setThumbnail(R.drawable.arm);
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
