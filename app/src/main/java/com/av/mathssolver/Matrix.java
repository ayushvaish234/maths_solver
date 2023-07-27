package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class Matrix extends AppCompatActivity {

    ImageButton b;
    Button a,p,d,i;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_matrix);

        b = (ImageButton) findViewById(R.id.back3);
        a = (Button)findViewById(R.id.ap);
        p = (Button)findViewById(R.id.gen);
        d = (Button)findViewById(R.id.gp);
        i = (Button)findViewById(R.id.hp);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Matrix.this, MainActivity.class);
                startActivity(intent);
            }
        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Matrix.this, matrixaddthree.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Matrix.this, determinant.class);
                startActivity(intent);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Matrix.this,matrixInverse.class);
                startActivity(intent);
            }
        });
    }
}