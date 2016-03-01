package com.example.admin.aagma;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Intro extends MainActivity {

    ImageButton cse,ece,eee,it,civ,mec,che,pharm,mba;
    TextView t1;
    TabLayout tablayout;
    ViewPager viewpager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewpager = (ViewPager) findViewById(R.id.viewpager);
        viewpager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));


        tablayout = (TabLayout) findViewById(R.id.tablayout);
        tablayout.setupWithViewPager(viewpager);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }
        });


    }


    public void cse(View view) {
onResume();
        cse = (ImageButton) findViewById(R.id.imageButton);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "cse");
        startActivity(in1);


    }

    public void ece(View view) {
onResume();
        ece = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "ece");
        startActivity(in1);
    }


    public void eee(View view) {
onResume();
        eee = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "eee");
        startActivity(in1);
    }



    public void it(View view) {
onResume();
        it = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "it");
        startActivity(in1);
    }


    public void civ(View view) {
onResume();
        civ = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "civ");
        startActivity(in1);
    }


    public void mec(View view) {
onResume();
        mec = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "mec");
        startActivity(in1);
    }


    public void che(View view) {
onResume();
        che = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "che");
        startActivity(in1);
    }


    public void pharm(View view) {
onResume();
        pharm = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "pharm");
        startActivity(in1);
    }


    public void mba(View view) {
onResume();
        mba = (ImageButton) findViewById(R.id.imageButton3);
        Intent in1 = new Intent(Intro.this, file.class);
        in1.putExtra("name", "mba");
        startActivity(in1);
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




    private class CustomAdapter extends FragmentPagerAdapter {

        private String fragments[] = {"About", "Contact", "Events"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Fragment1();
                case 1:
                    return new Fragment2();
                case 2:
                    return new Fragment3();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }
    }
}
