package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
LottieAnimationView LaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LaView= findViewById(R.id.LaView);

        LaView.setAnimation(R.raw.lottie);
        // Ya direct Xml sa bhi chal sakta ha or is sa bhi plus agar error de minimum sdk ka to graddle main ja kaar module app main jana min sdk change kar daina
        LaView.playAnimation();
    }
}