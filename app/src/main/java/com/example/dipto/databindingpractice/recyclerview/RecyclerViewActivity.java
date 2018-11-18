package com.example.dipto.databindingpractice.recyclerview;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ActivityRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private List<MoviePojo> list ;
    private LinearLayoutManager layoutManager ;
    ActivityRecyclerViewBinding binding ;
    RecyclerViewAdapter recyclerViewAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        initInstance();
        generateRecyclerView();
    }

    private void generateRecyclerView() {
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewAdapter = new RecyclerViewAdapter(RecyclerViewActivity.this, getMovieList());
        binding.rvmovies.setLayoutManager(layoutManager);
        binding.rvmovies.setAdapter(recyclerViewAdapter);
    }

    private void initInstance() {
        list = new ArrayList<>() ;
    }


    @BindingAdapter({"movieImage"})
    public static void setMovieImage(ImageView ivMoviePoster, String imagePoster){

        RequestOptions options = new RequestOptions()
                .transforms(new FitCenter())
                .placeholder(R.drawable.ic_dashboard_shop_default)
                .error(R.drawable.ic_dashboard_shop_default)
                .priority(Priority.HIGH);

        Glide.with(ivMoviePoster.getContext())
                .load(imagePoster)
                .apply(options)
                .into(ivMoviePoster);
    }

    private List<MoviePojo> getMovieList(){
        List<MoviePojo> movieList = new ArrayList<>() ;

        MoviePojo moviePojo1 = new MoviePojo("Mission: Impossible - Fallout",
                "https://www.imdb.com/title/tt4912910/mediaviewer/rm1258310912",
                2018,
                "Christopher McQuarrie");
        list.add(moviePojo1);


        MoviePojo moviePojo2 = new MoviePojo("Avengers: Infinity War",
                "https://www.imdb.com/title/tt4154756/mediaviewer/rm4044245504",
                2018,
                "Anthony Russo, Joe Russo");
        list.add(moviePojo2);


        MoviePojo moviePojo3 = new MoviePojo("La La Land",
                "https://www.imdb.com/title/tt3783958/mediaviewer/rm3967749632",
                2016,
                "Damien Chazelle");
        list.add(moviePojo3);


        MoviePojo moviePojo4 = new MoviePojo("Captain America: Civil War",
                "https://www.imdb.com/title/tt3498820/mediaviewer/rm3218348288",
                2016,
                "Anthony Russo, Joe Russo");
        list.add(moviePojo4);


        MoviePojo moviePojo5 = new MoviePojo("The Revenant",
                "https://www.imdb.com/title/tt1663202/mediaviewer/rm2770541312",
                2015,
                "Alejandro G. Iñárritu");
        list.add(moviePojo5);

        return list;
    }
}
