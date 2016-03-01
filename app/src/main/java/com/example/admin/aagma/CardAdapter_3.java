package com.example.admin.aagma;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class CardAdapter_3 extends RecyclerView.Adapter<CardAdapter_3.ViewHolder>{

   List<Movie> mItems;

   public CardAdapter_3() {
       super();
       mItems = new ArrayList<Movie>();
       Movie movie = new Movie();
       movie.setName("Paper Presentation");
       movie.setThumbnail(R.drawable.paper);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Bug The Bug");
       movie.setThumbnail(R.drawable.bug);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Code Race");
       movie.setThumbnail(R.drawable.code);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Fastest Hand First");
       movie.setThumbnail(R.drawable.hand);
       mItems.add(movie);

       movie = new Movie();
       movie.setName("Virtual Job Fair");
       movie.setThumbnail(R.drawable.job);
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
