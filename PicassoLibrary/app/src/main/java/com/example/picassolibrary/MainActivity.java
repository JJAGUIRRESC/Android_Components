package com.example.picassolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.imageViewLogo);

        Picasso.get()
                .load("http://i.imgur.com/DvpvklR.png")
                .resize(800,800)
                .centerCrop()
                .into(logo);
    }
}