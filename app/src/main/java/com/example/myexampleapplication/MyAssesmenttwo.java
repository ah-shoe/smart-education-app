package com.example.myexampleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAssesmenttwo extends AppCompatActivity {


    ConstraintLayout constraintLayout;
    Toolbar toolbarTop;
    ImageView iv_icon;
    TextView tv_title;
    Button btn_reviewAssessment,btn_startAssessment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_assesmenttwo);
        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);
        btn_startAssessment=(Button)findViewById(R.id.btnstartassessment);

        btn_startAssessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MyAssesmenttwo.this,MyStartAssessmentactivity.class));
            }
        });
        mTitle.setText("My Assessments");
        iv_toolbarIcon.setImageResource(R.drawable.myassessments);
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.myassessmentscolor));


        setSupportActionBar(toolbarTop);

        constraintLayout=(ConstraintLayout)findViewById(R.id.constraintLayout);
        iv_icon=(ImageView)findViewById(R.id.iv_subjectIcon);
        tv_title=(TextView)findViewById(R.id.tv_subjectTitle);

        iv_icon.setImageResource(Constants.image);
        tv_title.setText(Constants.subject);
        constraintLayout.setBackgroundColor(Constants.bgColor);

        btn_reviewAssessment=(Button)findViewById(R.id.button_reviewassessment);

        btn_reviewAssessment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MyAssesmenttwo.this,MyreviewAssessmentactivity.class));
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
//                        startActivity(new Intent(MyAssesmenttwo.this,Myassessmentsubjects.class));
//                    }
//                });
//
//            }
//        });
//        thread.start();
    }
}
