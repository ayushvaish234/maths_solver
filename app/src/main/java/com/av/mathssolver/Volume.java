package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class Volume extends AppCompatActivity {
    ImageButton b;
    Button cuboid,cube,cylinder,sphere,cone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_volume);
        b = (ImageButton) findViewById(R.id.back3);
        cuboid = (Button) findViewById(R.id.Area);
        cube = (Button) findViewById(R.id.vol);
        cylinder = (Button) findViewById(R.id.cyli);
        cone = (Button) findViewById(R.id.cone);
        sphere = (Button) findViewById(R.id.sphere);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Volume.this, areaSelection.class);
                startActivity(intent);
            }
        });
        cuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Volume.this, vcuboid.class);
                startActivity(intent);
            }
        });
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Volume.this, vcube.class);
                startActivity(intent);
            }
        });
        cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Volume.this, vcylin.class);
                startActivity(intent);
            }
        });
        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Volume.this, vcone.class);
                startActivity(intent);
            }
        });

        sphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Volume.this, vsphere.class);
                startActivity(intent);
            }
        });
    }
}