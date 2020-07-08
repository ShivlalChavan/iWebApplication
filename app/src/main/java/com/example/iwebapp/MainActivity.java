package com.example.iwebapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.iwebapp.Common.ToolbarSetup;
import com.example.iwebapp.Fragment.AttendanceFragment;
import com.example.iwebapp.Fragment.TimeTableFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout llAttendance, llTimeTable, llNotification,
            llResult, llPlacements, llCampus, llCourses, llLibrary, llDashboard;

    private Toolbar toolbar;
    private ToolbarSetup toolbarSetup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }


    private void initViews() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.iweb_ap));
//        toolbar.setLogo(getDrawable(R.drawable.back_icon));

         /*toolbarSetup = new ToolbarSetup(MainActivity.this, toolbar, getResources()
                .getString(R.string.iweb_ap), R.drawable.back_icon);*/


        llAttendance = (LinearLayout) findViewById(R.id.llAttendance);
        llTimeTable = (LinearLayout) findViewById(R.id.llTimeTable);
        llNotification = (LinearLayout) findViewById(R.id.llNotification);
        llResult = (LinearLayout) findViewById(R.id.llResult);
        llPlacements = (LinearLayout) findViewById(R.id.llPlacements);
        llCampus = (LinearLayout) findViewById(R.id.llCampus);
        llCourses = (LinearLayout) findViewById(R.id.llCourses);
        llLibrary = (LinearLayout) findViewById(R.id.llLibrary);
        llDashboard = (LinearLayout) findViewById(R.id.llDashboard);

        llDashboard.setOnClickListener(this);
        llLibrary.setOnClickListener(this);
        llCourses.setOnClickListener(this);
        llCampus.setOnClickListener(this);
        llPlacements.setOnClickListener(this);
        llResult.setOnClickListener(this);
        llNotification.setOnClickListener(this);
        llTimeTable.setOnClickListener(this);
        llAttendance.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Fragment fragment = null;
        Fragment tempFragment = null;
        boolean flagToAddFragment = true;

        switch (v.getId()) {

            case R.id.llAttendance:
                fragment = new AttendanceFragment();
                tempFragment = getCurrentFragment();
                if (tempFragment != null) {
                    if (tempFragment instanceof AttendanceFragment) {
                        flagToAddFragment = false;
                    }
                }

                break;

            case R.id.llTimeTable:
                fragment = new TimeTableFragment();
                tempFragment = getCurrentFragment();
                if (tempFragment != null) {
                    if (tempFragment instanceof TimeTableFragment) {
                        flagToAddFragment = false;
                    }
                }

                break;


        }

        if (fragment != null)
        {
            if (flagToAddFragment)
            {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.flContentRoot, fragment)
                        .addToBackStack(null)
                        .commit();
            }

        }
        else
        {
            // error in creating fragment
            Log.e("MainActivity", "Error in creating fragment");
        }


    }

    Fragment getCurrentFragment() {
        Fragment currentFragment = getSupportFragmentManager()
                .findFragmentById(R.id.flContentRoot);
        return currentFragment;
    }
}