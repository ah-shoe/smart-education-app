package com.example.myexampleapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class MyResultMarksActivity extends AppCompatActivity {

    Toolbar toolbarTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result_marks);
        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);

        mTitle.setText("My Results");
        iv_toolbarIcon.setImageResource(R.drawable.results);
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.myresultcolor));


        setSupportActionBar(toolbarTop);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
