package com.example.activityintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // On click en XML
    public void openSecondActivity(View view) {
        Intent openActivity2 = new Intent (this, Activity2.class);

        startActivity(openActivity2);
    }

    public void goToCommonIntents(View view) {
        Intent openCommonIntents = new Intent (this, CommonIntentsActivity.class);
        startActivity(openCommonIntents);
    }
}