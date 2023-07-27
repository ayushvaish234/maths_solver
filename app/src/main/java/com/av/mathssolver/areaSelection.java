package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class areaSelection extends AppCompatActivity {

    ImageButton b;
    Button area,vol;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_area_selection);

        b = (ImageButton) findViewById(R.id.back3);
        area = (Button) findViewById(R.id.Area);
        vol = (Button) findViewById(R.id.vol);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(areaSelection.this, MainActivity.class);
                startActivity(intent);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(areaSelection.this, Area.class);
                startActivity(intent);
            }
        });
        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(areaSelection.this, Volume.class);
                startActivity(intent);
            }
        });
    }
}