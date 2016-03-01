package com.example.admin.aagma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ADMIN on 2/21/2016.
 */
public class Fragment_1 extends file {
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_1);
        Intent in1=getIntent();
         s=in1.getStringExtra("event");


    }

    public void rules(View view) {

        Intent in = new Intent(getApplicationContext(), Rules.class);
        in.putExtra("event",s);
        startActivity(in);
    }
}
