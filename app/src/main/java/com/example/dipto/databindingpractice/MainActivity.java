package com.example.dipto.databindingpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dipto.databindingpractice.normaldatabinding.FirstActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_normal_screen)
    Button btnNormalScreen;
    @BindView(R.id.btn_recyclerview_screen)
    Button btnRecyclerviewScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_normal_screen, R.id.btn_recyclerview_screen})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_normal_screen:{
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_recyclerview_screen:{
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);

                // new intent will e added here !
                break;
            }

        }
    }
}
