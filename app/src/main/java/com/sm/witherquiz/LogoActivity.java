package com.sm.witherquiz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


import com.facebook.appevents.AppEventsLogger;

public class LogoActivity extends AppCompatActivity {

    AnimationDrawable splashAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);


        AppEventsLogger.activateApp(this.getApplication());

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.logo_activity);
        linearLayout.setBackgroundResource(R.drawable.splash_animation);
        splashAnimation = (AnimationDrawable) linearLayout.getBackground();
        splashAnimation.start();

        long animationDuration = 0;
        for (int i = 0; i < splashAnimation.getNumberOfFrames(); i++) {
            animationDuration += splashAnimation.getDuration(i);
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LogoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, animationDuration);


    }





}
