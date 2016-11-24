package com.example.ssboss.tntouristguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainRecycler extends AppCompatActivity {
    private List<College> collegeList = new ArrayList<>();
    private CollegeAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new CollegeAdapter (collegeList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new Cardview.ClickListener() {
            public void onClick(View view, int position) {
                College college = collegeList.get(position);
               // Intent i= new Intent(MainRecycler.this,MainTab.class);{
//                    startActivity(i);
//                    finish();
//                }
          }

            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();
    }

    private void prepareMovieData() {
        College college = new College("Mad Max: Fury Road", "Action & Adventure", "2015", R.drawable.ll);
        collegeList.add(college);

        college = new College("Inside Out", "Animation, Kids & Family", "2015", R.drawable.bb);
        collegeList.add(college);

        college = new College("Star Wars: Episode VII - The Force Awakens", "Action", "2015", R.drawable.cc);
        collegeList.add(college);

        college = new College("Shaun the Sheep", "Animation", "2015", R.drawable.dd);
        collegeList.add(college);

        college = new College("The Martian", "Science Fiction & Fantasy", "2015", R.drawable.ee);
        collegeList.add(college);

        college = new College("Mission: Impossible Rogue Nation", "Action", "2015", R.drawable.ff);
        collegeList.add(college);

        college = new College("Up", "Animation", "2009", R.drawable.gg);
        collegeList.add(college);

        college = new College("Star Trek", "Science Fiction", "2009", R.drawable.hh);
        collegeList.add(college);

        college = new College("The LEGO Movie", "Animation", "2014", R.drawable.ii);
        collegeList.add(college);

        college = new College("Iron Man", "Action & Adventure", "2008", R.drawable.jj);
        collegeList.add(college);

//        movie = new Movie("Aliens", "Science Fiction", "1986",R.drawable.k);
//        movieList.add(movie);

//        movie = new Movie("Chicken Run", "Animation", "2000");
//        movieList.add(movie);
//
//        movie = new Movie("Back to the Future", "Science Fiction", "1985");
//        movieList.add(movie);
//
//        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
//        movieList.add(movie);
//
//        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
//        movieList.add(movie);
//
//        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
//        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}