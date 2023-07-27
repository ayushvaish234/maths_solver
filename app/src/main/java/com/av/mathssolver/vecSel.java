package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class vecSel extends AppCompatActivity {

    ImageButton b;
    Button m,a ,s,d,ang;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vec_sel);

        b = (ImageButton) findViewById(R.id.back3);
        m = (Button)findViewById(R.id.ap);
        a = (Button)findViewById(R.id.gen);
        s = (Button)findViewById(R.id.gp);
        d = (Button)findViewById(R.id.hp);
        ang = (Button)findViewById(R.id.anglevec);

        //Back to mainactivity
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(vecSel.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //to magnitude calculation
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(vecSel.this, vectorMagnitude.class);
                startActivity(intent);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(vecSel.this, vectorAdd.class);
                startActivity(intent);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(vecSel.this, vecSub.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(vecSel.this, vecDot.class);
                startActivity(intent);
            }
        });
        ang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(vecSel.this, vecAngle.class);
                startActivity(intent);
            }
        });
    }
}