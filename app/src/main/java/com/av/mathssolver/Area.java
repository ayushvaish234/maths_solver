package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class Area extends AppCompatActivity {

    ImageButton b;
    Button cuboid,cube,cylinder,sphere,cone;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_area);

        b = (ImageButton) findViewById(R.id.back3);
        cuboid = (Button) findViewById(R.id.Area);
        cube = (Button) findViewById(R.id.vol);
        cylinder = (Button) findViewById(R.id.cyli);
        cone = (Button) findViewById(R.id.cone);
        sphere = (Button) findViewById(R.id.sphere);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Area.this, areaSelection.class);
                startActivity(intent);
            }
        });
        cuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Area.this, cuboid.class);
                startActivity(intent);
            }
        });
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Area.this, Cube.class);
                startActivity(intent);
            }
        });
        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Area.this, Cylinder.class);
                startActivity(intent);
            }
        });
        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Area.this, Cone.class);
                startActivity(intent);
            }
        });

        sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Area.this, Sphere.class);
                startActivity(intent);
            }
        });
    }
}