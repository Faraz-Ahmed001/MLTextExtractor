package com.example.mltextextractor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Define a consistent background color
        int bgColor = Color.parseColor("#FF0957");

        addFragment(new Step.Builder()
                .setTitle("Extract Text from Images")
                .setContent("Recognize text in images effortlessly using Google ML Kit.")
                .setBackgroundColor(bgColor)
                .setDrawable(R.drawable.onboarding1)
                .setSummary("Instantly convert physical documents, signs, or any text in images into digital format.")
                .build());

        addFragment(new Step.Builder()
                .setTitle("Copy & Use Instantly")
                .setContent("Fast and accurate extraction at your fingertips.")
                .setBackgroundColor(bgColor)
                .setDrawable(R.drawable.onboarding2)
                .setSummary("Once extracted, you can copy the text to your clipboard with a single tap for use in other apps.")
                .build());

        addFragment(new Step.Builder()
                .setTitle("Get Started Now")
                .setContent("Ready to simplify your productivity?")
                .setBackgroundColor(bgColor)
                .setDrawable(R.drawable.onboarding1) // Reusing onboarding1 or another consistent icon
                .setSummary("Tap the finish button to start extracting text from your world.")
                .build());
    }

    @Override
    public void finishTutorial() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void currentFragmentPosition(int position) {
    }
}
