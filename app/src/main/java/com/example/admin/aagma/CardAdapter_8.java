package com.example.admin.aagma;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class CardAdapter_8 extends RecyclerView.Adapter<CardAdapter_8.ViewHolder>{

   List<Movie> mItems;

   public CardAdapter_8() {
       super();
       mItems = new ArrayList<Movie>();
       Movie movie = new Movie();
       movie.setName("Sarva sresta (Young Manager)");
       movie.setThumbnail(R.drawable.manager);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Koutilya (Business Quiz)");
       movie.setThumbnail(R.drawable.quiz);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Pragnya (Paper Presentation)");
       movie.setThumbnail(R.drawable.paper);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Dhraveena (Mock Stock Market)");
       movie.setThumbnail(R.drawable.market);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Make In India (Business Start Up Plan)");
       movie.setThumbnail(R.drawable.startup);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Srujana (Best Out Of Waste)");
       movie.setThumbnail(R.drawable.waste);
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
