package com.example.dipto.databindingpractice.recyclerview;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.request.RequestOptions;
import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ActivityRecyclerViewBinding;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
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
}
