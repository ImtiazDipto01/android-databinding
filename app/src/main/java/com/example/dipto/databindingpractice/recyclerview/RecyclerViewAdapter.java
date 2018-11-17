package com.example.dipto.databindingpractice.recyclerview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ItemMovieListBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private final LayoutInflater inflater;
    private Context context;
    private List<MoviePojo> list ;

    public RecyclerViewAdapter(Context context, List<MoviePojo> list){
        this.context = context ;
        this.list = list;
        inflater = LayoutInflater.from(context) ;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMovieListBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_movie_list, parent, false);
        return new MyViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
