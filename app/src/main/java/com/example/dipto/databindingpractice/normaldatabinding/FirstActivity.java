package com.example.dipto.databindingpractice.normaldatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dipto.databindingpractice.R;
import com.example.dipto.databindingpractice.databinding.ActivityFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {

    private UserPojo user, user2 ;
    private MyClickHandlers handlers ;
    private List<UserPojo> userList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_first);
        ActivityFirstBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        user = new UserPojo();
        user.setEmail(null);
        user.setName("Imtiaz Uddin Ahmed");
        user.setAge(18);
        binding.setUser(user);

        user2 = new UserPojo();
        user2.setEmail("r@gmail.com");
        user2.setName("Rayhan Uddin");
        user2.setAge(22);
        userList = new ArrayList<UserPojo>();
        userList.add(user2) ;

        handlers = new MyClickHandlers(this) ;
        binding.setHandlers(handlers);
        binding.setUserList(userList);
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
