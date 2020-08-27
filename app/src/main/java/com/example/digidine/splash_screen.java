package com.example.digidine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class splash_screen extends AppCompatActivity {

    ImageView splashimage;

    private static  int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashimage = (ImageView) findViewById(R.id.splash_screen);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.myanimation);
        splashimage.startAnimation(myanim);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(5000);

                    Intent splash_intent = new Intent(splash_screen.this, MainActivity.class);
                    startActivity(splash_intent);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });
        myThread.start();
    }
}