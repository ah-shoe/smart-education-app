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

public class Myassessmentsubjects extends AppCompatActivity {
    Toolbar toolbarTop;
    LinearLayout ll_biology,ll_chemistry,ll_mathamatics,ll_physics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myassessmentsubjects);

        ll_physics=(LinearLayout)findViewById(R.id.ll_physics);
        ll_biology=(LinearLayout)findViewById(R.id.ll_biology);
        ll_chemistry=(LinearLayout)findViewById(R.id.ll_chemistry);
        ll_mathamatics=(LinearLayout)findViewById(R.id.ll_mathamatics);

        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);

        mTitle.setText("My Assessments");
        iv_toolbarIcon.setImageResource(R.drawable.myassessments);
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.myassessmentscolor));


        setSupportActionBar(toolbarTop);


        ll_physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Constants.subject="Physics" ;
                Constants.image=R.drawable.physics;
                Constants.bgColor= Color.parseColor("#c5e0b5");
                startActivity(new Intent(Myassessmentsubjects.this,MyAssesmenttwo.class));
            }
        });
        ll_biology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Constants.subject="Biology" ;
                Constants.image=R.drawable.biology;
                Constants.bgColor= Color.parseColor("#d8beed");
                startActivity(new Intent(Myassessmentsubjects.this,MyAssesmenttwo.class));

            }
        });
        ll_chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Constants.bgColor= Color.parseColor("#f8cbae");
                Constants.subject="Chemistry" ;
                Constants.image=R.drawable.chemistry_icon;
                startActivity(new Intent(Myassessmentsubjects.this,MyAssesmenttwo.class));

            }
        });

        ll_mathamatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Constants.bgColor= Color.parseColor("#ffec9b");
                Constants.subject="Mathamatics" ;
                Constants.image=R.drawable.math;
                startActivity(new Intent(Myassessmentsubjects.this,MyAssesmenttwo.class));


            }
        });



//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        startActivity(new Intent(Myassessmentsubjects.this,MyAssesmenttwo.class));
//                    }
//                });
//
//            }
//        });
//
//
//        thread.start();
//
//
//

    }

}
