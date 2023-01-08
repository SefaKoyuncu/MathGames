package com.kogosoft.easymathprototip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;


public class MainActivity extends AppCompatActivity {
    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView=findViewById(R.id.animationView);

        Looper l=Looper.getMainLooper();
        Handler h=new Handler(l);
        h.postDelayed(new Runnable()
                      {
                          @Override public void run(){
                              Intent intent=new Intent(MainActivity.this, CategoryPage.class);
                              startActivity(intent);
                              finish();
                          }
                      }
                ,3600);

        View decorView=getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        |View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        |View.SYSTEM_UI_FLAG_FULLSCREEN);

    }

    @Override
    protected void onStop() {
        super.onStop();
        finishAffinity();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}