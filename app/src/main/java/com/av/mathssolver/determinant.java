package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class determinant extends AppCompatActivity {

    ImageButton b;
    Button gen;
    EditText a11,a12,a13,a21,a22,a23,a31,a32,a33;
    TextView result;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_determinant);
        b = (ImageButton) findViewById(R.id.back3);
        gen = (Button) findViewById(R.id.gen);

        a11 = findViewById(R.id.a11);
        a12 = findViewById(R.id.a12);
        a13 = findViewById(R.id.a13);
        a21 = findViewById(R.id.a21);
        a22 = findViewById(R.id.a22);
        a23 = findViewById(R.id.a23);
        a31 = findViewById(R.id.a31);
        a32 = findViewById(R.id.a32);
        a33 = findViewById(R.id.a33);
        result = findViewById(R.id.result);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(determinant.this, Matrix.class);
                startActivity(intent);
            }
        });

        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a11.getText().toString().equals("")) {
                } else if (a12.getText().toString().equals("")) {
                } else if (a13.getText().toString().equals("")) {
                } else if (a21.getText().toString().equals("")) {
                } else if (a22.getText().toString().equals("")) {
                } else if (a23.getText().toString().equals("")) {
                } else if (a31.getText().toString().equals("")) {
                } else if (a32.getText().toString().equals("")) {
                } else if (a33.getText().toString().equals("")) {
                } else {
                double a[][] = new double[3][3];

                a[0][0] = Double.valueOf(Double.parseDouble((a11.getText().toString())));
                a[0][1] = Double.valueOf(Double.parseDouble((a12.getText().toString())));
                a[0][2] = Double.valueOf(Double.parseDouble((a13.getText().toString())));
                a[1][0] = Double.valueOf(Double.parseDouble((a21.getText().toString())));
                a[1][1] = Double.valueOf(Double.parseDouble((a22.getText().toString())));
                a[1][2] = Double.valueOf(Double.parseDouble((a23.getText().toString())));
                a[2][0] = Double.valueOf(Double.parseDouble((a31.getText().toString())));
                a[2][1] = Double.valueOf(Double.parseDouble((a32.getText().toString())));
                a[2][2] = Double.valueOf(Double.parseDouble((a33.getText().toString())));


                double x = (a[1][1] * a[2][2]) - (a[2][1] * a[1][2]);
                double y = (a[1][0] * a[2][2]) - (a[2][0] * a[1][2]);
                double z = (a[1][0] * a[2][1]) - (a[2][0] * a[1][1]);

                double det = (a[0][0] * x)- (a[0][1] * y) + (a[0][2] * z);

                result.setText(String.valueOf(det));

            }}
        });
            }
}