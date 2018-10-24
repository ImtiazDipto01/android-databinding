package com.example.dipto.databindingpractice.userprofile;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ActivityUserProfileBinding;

public class UserProfileActivity extends AppCompatActivity {

    UserProfile userProfile ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityUserProfileBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_user_profile);

        userProfile = new UserProfile();
        userProfile.setName("Imtiaz Uddin Ahmed");
        userProfile.setAge(25);

        binding.setUserprofile(userProfile);
    }
}
