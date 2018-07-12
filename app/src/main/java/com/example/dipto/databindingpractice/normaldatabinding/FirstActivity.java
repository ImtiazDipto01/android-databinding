package com.example.dipto.databindingpractice.normaldatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    private UserPojo user ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_first);
        ActivityFirstBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        user = new UserPojo();
        user.setEmail("Imtiaz@gmail.com");
        user.setName("Imtiaz Uddin Ahmed");
        binding.setUser(user);
    }
}
