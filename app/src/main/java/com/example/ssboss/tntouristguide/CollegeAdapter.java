package com.example.ssboss.tntouristguide;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by venu sankaran on 11/16/2016.
 */

public class CollegeAdapter extends RecyclerView.Adapter<CollegeAdapter.MyViewHolder> {

    private List<College> collegeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
            image=(ImageView)view.findViewById(R.id.imageView);
        }
    }


    public CollegeAdapter(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.college_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        College college = collegeList.get(position);
        holder.title.setText(college.getTitle());
        holder.genre.setText(college.getGenre());
        holder.year.setText(college.getYear());
        holder.image.setImageResource(college.getImage());
    }

    @Override
    public int getItemCount() {
        return collegeList.size();
    }
}
