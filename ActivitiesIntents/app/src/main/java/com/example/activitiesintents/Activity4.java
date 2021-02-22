package com.example.activitiesintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        // Parametros recibidos en el intent
        Bundle extras = getIntent().getExtras();
        int n = extras.getInt("numero");
        String s = extras.getString("nombre");
        Toast.makeText(this, "Recibido por parámetro: "+s+","+n, Toast.LENGTH_SHORT).show();
    }
}