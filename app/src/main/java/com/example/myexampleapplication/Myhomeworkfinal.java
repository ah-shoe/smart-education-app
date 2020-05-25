package com.example.myexampleapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Myhomeworkfinal extends AppCompatActivity {
    Toolbar toolbarTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myhomeworkfinal);
        toolbarTop = (Toolbar) findViewById(R.id.toolbar);
        toolbarTop.setTitle("My Homework");
        toolbarTop.setBackgroundColor(getResources().getColor(R.color.myresultcolor));
        setSupportActionBar(toolbarTop);
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
//                        startActivity(new Intent(Myhomeworkfinal.this,HomeWorktwoActivity.class));
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
