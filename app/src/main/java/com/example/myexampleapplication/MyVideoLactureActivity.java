package com.example.myexampleapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyVideoLactureActivity extends AppCompatActivity {

    LinearLayout ll_biology,ll_chemistry,ll_mathamatics,ll_physics;
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_video_lacture);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        mToolbar.setTitle("My Video Lectures");
        mToolbar.setBackgroundColor(getResources().getColor(R.color.myvideolacturecolor));

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);

        mTitle.setText("My Video Lectures");
        iv_toolbarIcon.setImageResource(R.drawable.icon_lecture);
//        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);


        ll_physics=(LinearLayout)findViewById(R.id.ll_physics);
        ll_biology=(LinearLayout)findViewById(R.id.ll_biology);
        ll_chemistry=(LinearLayout)findViewById(R.id.ll_chemistry);
        ll_mathamatics=(LinearLayout)findViewById(R.id.ll_mathamatics);

        ll_physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.subject="Physics" ;
                Constants.image=R.drawable.physics;
                Constants.bgColor= Color.parseColor("#c5e0b5");
                startActivity(new Intent(MyVideoLactureActivity.this,MyVideoLecture2activity.class));
            }
        });
        ll_biology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.subject="Biology" ;
                Constants.image=R.drawable.biology;
                Constants.bgColor= Color.parseColor("#d8beed");
                startActivity(new Intent(MyVideoLactureActivity.this,MyVideoLecture2activity.class));

            }
        });
        ll_chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Constants.bgColor= Color.parseColor("#f8cbae");
                Constants.subject="Chemistry" ;
                Constants.image=R.drawable.chemistry_icon;
                startActivity(new Intent(MyVideoLactureActivity.this,MyVideoLecture2activity.class));

            }
        });

        ll_mathamatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Constants.bgColor= Color.parseColor("#ffec9b");
                Constants.subject="Mathamatics" ;
                Constants.image=R.drawable.math;
                startActivity(new Intent(MyVideoLactureActivity.this,MyVideoLecture2activity.class));


            }
        });



    }
}
