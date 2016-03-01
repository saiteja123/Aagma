package com.example.admin.aagma;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

 class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder>{


     View  itemView;

     CardView card;
     String s[]={"Paper Presentation","Poster Presentation","Code Quiz"};



     List<Movie> mItems;

    public CardAdapter() {
        super();
        mItems = new ArrayList<Movie>();

        Movie movie = new Movie();
        movie.setName(s[0]);
        movie.setThumbnail(R.drawable.paper);
        mItems.add(movie);


        movie = new Movie();
        movie.setName(s[1]);
        movie.setThumbnail(R.drawable.poster);
        mItems.add(movie);

        movie = new Movie();
        movie.setName(s[2]);
        movie.setThumbnail(R.drawable.code);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Webpage design");
        movie.setThumbnail(R.drawable.web);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Technical Hangman");
        movie.setThumbnail(R.drawable.hangman);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Sports");
        movie.setThumbnail(R.drawable.sports);
        mItems.add(movie);


        movie = new Movie();
        movie.setName("Virtual Typing");
        movie.setThumbnail(R.drawable.typing);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Art in mac");
        movie.setThumbnail(R.drawable.mac);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Banner Design");
        movie.setThumbnail(R.drawable.banner);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Tecno Buzz");
        movie.setThumbnail(R.drawable.technology);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Logic Quiz");
        movie.setThumbnail(R.drawable.quiz);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Creative Spot");
        movie.setThumbnail(R.drawable.innovation);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Memorais");
        movie.setThumbnail(R.drawable.memory);
        mItems.add(movie);


        movie = new Movie();
        movie.setName("Jumbled Code");
        movie.setThumbnail(R.drawable.jumbled);
        mItems.add(movie);

        movie = new Movie();
        movie.setName("Lan Gaming");
        movie.setThumbnail(R.drawable.gaming);
        mItems.add(movie);


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {


      itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_card_item, viewGroup, false);

          viewGroup.getContext();




        return new ViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        Movie movie = mItems.get(position);
        viewHolder.tvMovie.setText(movie.getName());
        viewHolder.imgThumbnail.setImageResource(movie.getThumbnail());





    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }




     static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        int position;
         String s[]={"Paper Presentation","Poster Presentation","Code Quiz"};
        public ImageView imgThumbnail;
        public TextView tvMovie;

        public ViewHolder(final View itemView) {
            super(itemView);

            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            tvMovie = (TextView) itemView.findViewById(R.id.tv_movie);
             CardView card=(CardView)itemView.findViewById(R.id.card);
             card.setOnClickListener(this);





        }
         @Override
         public void onClick(View v) {
             position=getAdapterPosition();
             Context context;
             Intent intent;
             switch (position) {


                 case 0:context = itemView.getContext();
                     intent = new Intent(context, Fragment_1.class);
                     intent.putExtra("event", s[0]);
                     context.startActivity(intent);
                     break;
                 case 1:context = itemView.getContext();
                     intent = new Intent(context, Fragment_1.class);
                     intent.putExtra("event", s[1]);
                     context.startActivity(intent);
                     break;
                 case 2:context = itemView.getContext();
                     intent = new Intent(context, Fragment_1.class);
                     intent.putExtra("event", s[2]);
                     context.startActivity(intent);
                     break;

             }
         }




    }
}
