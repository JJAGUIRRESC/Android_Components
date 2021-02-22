package com.example.activitiesintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    Button btnActivity4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btnActivity4  = findViewById(R.id.btnGoToActivity4);
        btnActivity4.setOnClickListener(this);
    }

    // Método onclick implements View.OnClickListener
    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id == R.id.btnGoToActivity4) {
            Intent goToAct4 = new Intent(this, Activity4.class);

            // Enviar datos a otra activity
            goToAct4.putExtra("numero",5);
            goToAct4.putExtra("nombre","Antonio");

            startActivity(goToAct4);
        }
    }
}