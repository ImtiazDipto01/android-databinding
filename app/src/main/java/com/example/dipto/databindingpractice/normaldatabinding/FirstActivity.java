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
import java.util.HashMap;
import java.util.List;

public class FirstActivity extends AppCompatActivity {

    private UserPojo user;
    private MyClickHandlers handlers ;
    private List<UserPojo> userList ;
    private HashMap<String, String> myHashMap ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_first);
        ActivityFirstBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        // for simple object
        user = new UserPojo();
        user.setEmail(null);
        user.setName("Imtiaz Uddin Ahmed");
        user.setAge(18);
        binding.setUser(user);

        // for simple list
        UserPojo user2 = new UserPojo();
        user2.setEmail("r@gmail.com");
        user2.setName("Rayhan Uddin");
        user2.setAge(22);
        user2.setPhoneNumber("01911100101");
        userList = new ArrayList<UserPojo>();
        userList.add(user2) ;
        binding.setUserList(userList);

        //for HashMap
        myHashMap = new HashMap<>();
        myHashMap.put(user2.getName(), user2.getPhoneNumber());

        handlers = new MyClickHandlers(this) ;
        binding.setHandlers(handlers);
        binding.setMyHashMap(myHashMap);
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
