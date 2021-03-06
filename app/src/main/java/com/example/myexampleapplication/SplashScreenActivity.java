package com.example.myexampleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Admin on 22-03-2020.
 */

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2000;
    private static final String TAG = SplashScreenActivity.class.getName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                 Intent i = new Intent(SplashScreenActivity.this, HomeActivity.class);
                    startActivity(i);
                    finish();
                }


            }, SPLASH_TIME_OUT);

    }
}
