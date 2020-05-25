package com.example.myexampleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyResultActivity extends AppCompatActivity {

    Toolbar toolbarTop;
    Button classresults,termexamresults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_result);
        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.tv_toolbar_title);
        ImageView iv_toolbarIcon=(ImageView)toolbarTop.findViewById(R.id.iv_toolbarIcon);

        mTitle.setText("My Results");
        iv_toolbarIcon.setImageResource(R.drawable.results);
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.myresultcolor));

        classresults=(Button)findViewById(R.id.btnclasstest);
        termexamresults=(Button)findViewById(R.id.btntermexam);
        classresults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyResultActivity.this,MyExamResultActivity.class);
                startActivity(i);
            }
        });
        termexamresults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyResultActivity.this,MyResultMarksActivity.class);
                startActivity(i);
            }
        });
//        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        mToolbar.setTitle("My Result");
        // setSupportActionBar(mToolbar);
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
//                        startActivity(new Intent(MyResultActivity.this,MyResultMarksActivity.class));
//                    }
//                });
//
//            }
//        });
//
//
//        thread.start();

    }
}
