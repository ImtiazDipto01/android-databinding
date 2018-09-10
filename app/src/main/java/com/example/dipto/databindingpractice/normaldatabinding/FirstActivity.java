package com.example.dipto.databindingpractice.normaldatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    private UserPojo user ;
    private MyClickHandlers handlers ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_first);
        ActivityFirstBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        user = new UserPojo();
        user.setEmail("Imtiaz@gmail.com");
        user.setName("Imtiaz Uddin Ahmed");
        binding.setUser(user);

        handlers = new MyClickHandlers(this) ;
        binding.setHandlers(handlers);
    }

    public class MyClickHandlers {

        Context context;

        public MyClickHandlers(Context context) {
            this.context = context;
        }

        public void onEmailClicked(String name) {
            Toast.makeText(getApplicationContext(), "Email Clicked and name is :"+name, Toast.LENGTH_SHORT).show();
        }
    }
}
