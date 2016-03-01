package com.example.admin.aagma;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class CardAdapter_2 extends RecyclerView.Adapter<CardAdapter_2.ViewHolder>{

   List<Movie> mItems;

   public CardAdapter_2() {
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
       movie.setName("Technical Quiz");
       movie.setThumbnail(R.drawable.quiz);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Matlab Mania");
       movie.setThumbnail(R.drawable.matlab);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Ram n Rom");
       movie.setThumbnail(R.drawable.ram);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Circuitrix");
       movie.setThumbnail(R.drawable.circuit);
       mItems.add(movie);


       movie = new Movie();
       movie.setName("Dumbshell Electronics");
       movie.setThumbnail(R.drawable.electronics);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Robo Soccer");
       movie.setThumbnail(R.drawable.robo);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("F-1 Race");
       movie.setThumbnail(R.drawable.f1);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("All Terrain");
       movie.setThumbnail(R.drawable.tire);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Brain Blogger");
       movie.setThumbnail(R.drawable.brain);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Memory Matrix");
       movie.setThumbnail(R.drawable.memory);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Technical Treasure Hunt");
       movie.setThumbnail(R.drawable.treasure);
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
