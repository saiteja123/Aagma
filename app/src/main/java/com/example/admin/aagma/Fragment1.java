package com.example.admin.aagma;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ADMIN on 2/3/2016.
 */
public class Fragment1 extends Fragment {
    View view;
    TextView t1,t2;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.frag1, container, false);

        initTypeface();





        return view;


    }

    private void initTypeface() {
        t1=(TextView)view.findViewById(R.id.textView);
        t2=(TextView)view.findViewById(R.id.textView1);
        String tp="About AAGAMA";
        t2.setText(tp);
        String t= "To be abreast of recent developments and to provide a common platform to the budding technocrats from all over the country, to have knowledge share and to explore new horizons in the concerned Engineering, Pharamceutical and Management streams, Anurag Group of Institutions is going to conduct AAGAMA 2K16 on 18th and 19th March, 2016.\n" +
                "In the present scenario professional education like engineering is demanding overall development from the students. Student is expected to acquire thorough technical knowledge along with other supportive skills. With this back drop technical papers are invited from all the corners of the country. All the papers will be peer reviewed.\n" +
                "Many events like Tech Quiz, Poster presentation, Project presentation, Robotrix, Circruitrix, Velocity, Invasion, Compound ";
        t1.setText(t);



        Typeface aquafina=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AguafinaScript-Regular.ttf");
        t1.setTypeface(aquafina);
        t2.setTypeface(aquafina);

    }



}
