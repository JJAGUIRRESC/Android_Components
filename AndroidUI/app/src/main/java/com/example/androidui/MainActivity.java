package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLinearLayoutActivity(View view) {
        Intent intentLinearLayout = new Intent (this, LinearLayoutActivity.class);
        startActivity(intentLinearLayout);
    }

    public void openRelativeLayoutActivity(View view) {
        Intent intentRelativeLayout = new Intent (this, RelativeLayoutActivity.class);
        startActivity(intentRelativeLayout);
    }

    public void openButtonsActivity(View view) {
        Intent intentButtonsActivity = new Intent (this, ButtonsActivity.class);
        startActivity(intentButtonsActivity);
    }
}