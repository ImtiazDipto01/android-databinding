package com.example.dipto.databindingpractice.userprofile;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ActivityUserProfileBinding;

public class UserProfileActivity extends AppCompatActivity {

    UserProfile userProfile ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityUserProfileBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_user_profile);

        // binding user profile
        userProfile = new UserProfile();
        userProfile.setName("Imtiaz Uddin Ahmed");
        userProfile.setAge(25);
        userProfile.setImage("https://picsum.photos/300/300/?image=267");
        binding.setUserprofile(userProfile);
    }

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView iv, String url){
        Glide.with(iv.getContext())
                .load(url)
                .into(iv);
    }
}
