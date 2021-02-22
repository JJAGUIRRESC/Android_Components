package com.example.activitiesintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Button btnActivity3;
    Button btnSaySomething;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnActivity3 = findViewById(R.id.btnGoToActivity3);

        // Definimos el listener
        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openActivity3 = new Intent(Activity2.this, Activity3.class);
                startActivity(openActivity3);
            }
        });

        btnSaySomething = findViewById(R.id.btnSaySomething);

        btnSaySomething.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity2.this, "Hello!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}