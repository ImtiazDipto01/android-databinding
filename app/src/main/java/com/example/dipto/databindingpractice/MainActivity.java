package com.example.dipto.databindingpractice;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dipto.databindingpractice.databinding.ActivityMainBinding;
import com.example.dipto.databindingpractice.normaldatabinding.FirstActivity;
import com.example.dipto.databindingpractice.recyclerview.RecyclerViewActivity;
import com.example.dipto.databindingpractice.userprofile.UserProfileActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityClickListeners mainActivityClickListeners = new MainActivityClickListeners(this) ;
        mainBinding.setClickListener(mainActivityClickListeners);
    }


    public class MainActivityClickListeners{

        private Context context ;

        public  MainActivityClickListeners(Context context){
            this.context = context ;
        }

        public void normalDataBindingClicked(){
            Intent intent = new Intent(MainActivity.this, FirstActivity.class);
            startActivity(intent);
        }

        public void userProfileDataBindingClicked(){
            Intent intent = new Intent(MainActivity.this, UserProfileActivity.class);
            startActivity(intent);
        }

        public void recyclerDataBindingClicked(){
            Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
            startActivity(intent);
        }
    }
}
