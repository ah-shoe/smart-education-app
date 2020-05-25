package com.example.myexampleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Mynotesactivity extends AppCompatActivity {
    Toolbar toolbarTop;
    LinearLayout ll_biology,ll_chemistry,ll_mathamatics,ll_physics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mynotesactivity);
        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);

        mTitle.setText("My Notes");
        iv_toolbarIcon.setImageResource(R.drawable.mynotes);
//        mToolbar.setTitle("My Notes");
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.my_note));
        setSupportActionBar(toolbarTop);

        ll_physics=(LinearLayout)findViewById(R.id.ll_physics);
        ll_biology=(LinearLayout)findViewById(R.id.ll_biology);
        ll_chemistry=(LinearLayout)findViewById(R.id.ll_chemistry);
        ll_mathamatics=(LinearLayout)findViewById(R.id.ll_mathamatics);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ll_physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.subject="Physics" ;
                Constants.image=R.drawable.physics;
                Constants.bgColor= Color.parseColor("#c5e0b5");
                Intent i = new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class);
                startActivity(i);
                //startActivity(new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class));
            }
        });
        ll_biology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.subject="Biology" ;
                Constants.image=R.drawable.biology;
                Constants.bgColor= Color.parseColor("#d8beed");
                Intent i = new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class);
                startActivity(i);
                //startActivity(new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class));

            }
        });
        ll_chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Constants.bgColor= Color.parseColor("#f8cbae");
                Constants.subject="Chemistry" ;
                Constants.image=R.drawable.chemistry_icon;
                Intent i = new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class);
                startActivity(i);
                //startActivity(new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class));

            }
        });

        ll_mathamatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Constants.bgColor= Color.parseColor("#ffec9b");
                Constants.subject="Mathamatics" ;
                Constants.image=R.drawable.math;
                Intent i = new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class);
                startActivity(i);
//                startActivity(new Intent(Mynotesactivity.this,Mynotessubjectsactivity.class));


            }
        });

    }

}
