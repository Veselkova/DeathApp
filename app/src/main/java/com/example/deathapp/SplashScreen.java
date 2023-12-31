package com.example.deathapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override

            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, SecondSplashScreen.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }

        },SPLASH_DISPLAY_LENGTH);

    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}
