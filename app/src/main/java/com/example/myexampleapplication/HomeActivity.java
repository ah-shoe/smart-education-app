package com.example.myexampleapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;

//run and show me error
// spp crashes in android 6 version not here
//without error how can i proceed?
// android version 6 mobile it crashes  u der
//will u hwlp me for other smaal issue

public class HomeActivity extends Activity {
    GridView grid;

    LinearLayout ll_mynotes,ll_myassessments,ll_myvideos,ll_myattendance,ll_myresults,ll_myhomework;
    String[] web = {
            "My Notes",
            "My Assessments",
            "My Video Lectures",
            "My Attendance",
            "My Results",
            "My Homeworks"
    } ;
    int[] imageId = {
            R.drawable.mynotes,
            R.drawable.myassessments,
            R.drawable.videoicon,
            R.drawable.myattendance,
            R.drawable.results,
            R.drawable.homework

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
     //   Intent i= new Intent(HomeActivity.this,Mynotesactivity.class);
     //   startActivity(i);
        ll_mynotes=(LinearLayout)findViewById(R.id.ll_mynotes);
        ll_myassessments=(LinearLayout)findViewById(R.id.ll_myassessments);
        ll_myvideos=(LinearLayout)findViewById(R.id.ll_myvideos);
        ll_myattendance=(LinearLayout)findViewById(R.id.ll_myattendance);
        ll_myresults=(LinearLayout)findViewById(R.id.ll_myresults);
        ll_myhomework=(LinearLayout)findViewById(R.id.ll_myhomework);


        ll_mynotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(HomeActivity.this,Mynotesactivity.class);
                startActivity(i);
               // startActivity(new Intent(HomeActivity.this,Mynotesactivity.class));
            }
        });

        ll_myassessments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,Myassessmentsubjects.class));
            }
        });

        ll_myvideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MyVideoLactureActivity.class));
            }
        });

        ll_myattendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(HomeActivity.this,MyAssesmenttwo.class));
            }
        });

        ll_myresults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MyResultActivity.class));
            }
        });

        ll_myhomework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MyHomeWorkoneActivity.class));
            }
        });

/*        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(HomeActivity.this,Mynotesactivity.class));
                    }
                });

            }
        });

        //home actvity ke baad
*/
/*       thread.start();
        CustomGrid adapter = new CustomGrid(HomeActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Switch position:
                Toast.makeText(HomeActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
*/






        GradientDrawable bgNoteShape = (GradientDrawable) ll_mynotes.getBackground();
        bgNoteShape.setColor(getResources().getColor(R.color.my_note));

        GradientDrawable bgAssignmentShape = (GradientDrawable) ll_myassessments.getBackground();
        bgAssignmentShape.setColor(getResources().getColor(R.color.my_assignment));

        GradientDrawable bgVideoShape = (GradientDrawable) ll_myvideos.getBackground();
        bgVideoShape.setColor(getResources().getColor(R.color.my_video_lectures));

        GradientDrawable bgAttendanceShape = (GradientDrawable) ll_myattendance.getBackground();
        bgAttendanceShape.setColor(getResources().getColor(R.color.my_attendance));

        GradientDrawable bgResultShape = (GradientDrawable) ll_myresults.getBackground();
        bgResultShape.setColor(getResources().getColor(R.color.my_results));

        GradientDrawable bgHomeWorkShape = (GradientDrawable) ll_myhomework.getBackground();
        bgHomeWorkShape.setColor(getResources().getColor(R.color.my_homework));


    }

}
