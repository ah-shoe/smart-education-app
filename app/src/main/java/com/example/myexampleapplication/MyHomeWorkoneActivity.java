package com.example.myexampleapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHomeWorkoneActivity extends AppCompatActivity {

    Toolbar toolbarTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_home_workone);

        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);

        mTitle.setText("My Homework");
        iv_toolbarIcon.setImageResource(R.drawable.homework);
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.my_homework));

    }
}
