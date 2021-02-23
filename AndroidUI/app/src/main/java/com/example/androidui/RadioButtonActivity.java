package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
    RadioGroup radioGroupAV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroupAV = findViewById(R.id.radioGroupAverias);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioBtnChapa:
                if (checked){
                    Toast.makeText(this, "Ha seleccionado reparar chapa y pintura", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radioBtnCristal:
                if (checked) {
                    Toast.makeText(this, "Ha seleccionado reparar cristales", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radioBtnMecanica:
                if (checked) {
                    Toast.makeText(this, "Ha seleccionado reparar mecánica", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void conocerOpcionMarcada(View view) {
        int idSeleccionado = radioGroupAV.getCheckedRadioButtonId();

        if (idSeleccionado == R.id.radioBtnChapa){
            Toast.makeText(this, "Ha seleccionado reparar chapa y pintura", Toast.LENGTH_SHORT).show();
        } else if (idSeleccionado == R.id.radioBtnCristal){
            Toast.makeText(this, "Ha seleccionado reparar cristales", Toast.LENGTH_SHORT).show();
        } else if (idSeleccionado == R.id.radioBtnMecanica){
            Toast.makeText(this, "Ha seleccionado reparar mecánica", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No ha seleccionado nada", Toast.LENGTH_SHORT).show();
        }
    }
}