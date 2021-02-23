package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBoxChapa:
                if (checked) {
                    Toast.makeText(this, "Ha seleccionado reparar chapa y pintura", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBoxCristales:
                if (checked) {
                    Toast.makeText(this, "Ha seleccionado reparar cristales", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBoxMecanica:
                if (checked) {
                    Toast.makeText(this, "Ha seleccionado reparar mecánica", Toast.LENGTH_SHORT).show();
                }
        }
    }
}