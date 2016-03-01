package com.example.admin.aagma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class file extends Intro  {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    String s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_recycler_view);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        Intent in = getIntent();
        String i = in.getStringExtra("name");
        if (i != null) {
            switch (i) {
                case "cse":
                    mAdapter = new CardAdapter();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "ece":
                    mAdapter = new CardAdapter_2();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "eee":
                    mAdapter = new CardAdapter_1();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "it":
                    mAdapter = new CardAdapter_3();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "civ":
                    mAdapter = new CardAdapter_4();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "mec":
                    mAdapter = new CardAdapter_5();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "che":
                    mAdapter = new CardAdapter_6();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "pharm":
                    mAdapter = new CardAdapter_7();
                    mRecyclerView.setAdapter(mAdapter);
                    break;
                case "mba":
                    mAdapter = new CardAdapter_8();
                    mRecyclerView.setAdapter(mAdapter);
                    break;


            }


        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





}










