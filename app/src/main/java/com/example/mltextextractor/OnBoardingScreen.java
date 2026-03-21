package com.example.mltextextractor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Extract Text from Images using ML")
                .setContent("Recognize text in Images with ML Kit on Android")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboarding1) // int top drawable
                .setSummary("You can use ML Kit to recognize text in images or video, such as the text of a street sign.")
                .build());

        addFragment(new Step.Builder().setTitle("Copy and Use the Extracted Text in Seconds")
                .setContent("Recognize text in Images with ML Kit on Android")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboarding2) // int top drawable
                .setSummary("You can use ML Kit to recognize text in images or video, such as the text of a street sign.")
                .build());

        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("Recognize text in Images with ML Kit on Android")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.onboarding1) // int top drawable
                .setSummary("You can use ML Kit to recognize text in images or video, such as the text of a street sign.")
                .build());

    }

    @Override
    public void finishTutorial() {
        // Your implementation
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}