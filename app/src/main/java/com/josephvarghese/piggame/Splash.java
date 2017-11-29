package com.josephvarghese.piggame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent homeIntent = new Intent(Splash.this,Home.class);
                startActivity(homeIntent);
                finish();


            }
        },3000);
    }
}
