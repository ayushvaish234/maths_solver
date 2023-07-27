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

public class matrixaddthree extends AppCompatActivity {

    ImageButton b;
    Button add , sub,prod;
    EditText a11,a12,a13,a21,a22,a23,a31,a32,a33,b11,b12,b13,b21,b22,b23,b31,b32,b33;
    TextView c11,c12,c13,c21,c22,c23,c31,c32,c33;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_matrixaddthree);

        b = (ImageButton) findViewById(R.id.back3);
        add = (Button) findViewById(R.id.matrixadd);
        sub = (Button) findViewById(R.id.matrixminus);
        prod = (Button) findViewById(R.id.gen);

        a11 = findViewById(R.id.a11);
        a12 = findViewById(R.id.a12);
        a13 = findViewById(R.id.a13);
        a21 = findViewById(R.id.a21);
        a22 = findViewById(R.id.a22);
        a23 = findViewById(R.id.a23);
        a31 = findViewById(R.id.a31);
        a32 = findViewById(R.id.a32);
        a33 = findViewById(R.id.a33);

        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);

        c11 = findViewById(R.id.c11);
        c12 = findViewById(R.id.c12);
        c13 = findViewById(R.id.c13);
        c21 = findViewById(R.id.c21);
        c22 = findViewById(R.id.c22);
        c23 = findViewById(R.id.c23);
        c31 = findViewById(R.id.c31);
        c32 = findViewById(R.id.c32);
        c33 = findViewById(R.id.c33);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(matrixaddthree.this, Matrix.class);
                startActivity(intent);
            }
        });

        //matrix addition
        add.setOnClickListener(new View.OnClickListener() {
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
                } else if (b11.getText().toString().equals("")) {
                } else if (b12.getText().toString().equals("")) {
                } else if (b13.getText().toString().equals("")) {
                } else if (b21.getText().toString().equals("")) {
                } else if (b22.getText().toString().equals("")) {
                } else if (b23.getText().toString().equals("")) {
                } else if (b31.getText().toString().equals("")) {
                } else if (b32.getText().toString().equals("")) {
                } else if (b33.getText().toString().equals("")) {
                } else {
                    double a[][] = new double[3][3];
                    double b[][] = new double[3][3];
                    double c[][] = new double[3][3];
                    a[0][0] = Double.valueOf(Double.parseDouble((a11.getText().toString())));
                    a[0][1] = Double.valueOf(Double.parseDouble((a12.getText().toString())));
                    a[0][2] = Double.valueOf(Double.parseDouble((a13.getText().toString())));
                    a[1][0] = Double.valueOf(Double.parseDouble((a21.getText().toString())));
                    a[1][1] = Double.valueOf(Double.parseDouble((a22.getText().toString())));
                    a[1][2] = Double.valueOf(Double.parseDouble((a23.getText().toString())));
                    a[2][0] = Double.valueOf(Double.parseDouble((a31.getText().toString())));
                    a[2][1] = Double.valueOf(Double.parseDouble((a32.getText().toString())));
                    a[2][2] = Double.valueOf(Double.parseDouble((a33.getText().toString())));

                    b[0][0] = Double.valueOf(Double.parseDouble((b11.getText().toString())));
                    b[0][1] = Double.valueOf(Double.parseDouble((b12.getText().toString())));
                    b[0][2] = Double.valueOf(Double.parseDouble((b13.getText().toString())));
                    b[1][0] = Double.valueOf(Double.parseDouble((b21.getText().toString())));
                    b[1][1] = Double.valueOf(Double.parseDouble((b22.getText().toString())));
                    b[1][2] = Double.valueOf(Double.parseDouble((b23.getText().toString())));
                    b[2][0] = Double.valueOf(Double.parseDouble((b31.getText().toString())));
                    b[2][1] = Double.valueOf(Double.parseDouble((b32.getText().toString())));
                    b[2][2] = Double.valueOf(Double.parseDouble((b33.getText().toString())));


                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            c[i][j] = a[i][j] + b[i][j];
                        }
                    }
                    c11.setText(String.valueOf(c[0][0]));
                    c12.setText(String.valueOf(c[0][1]));
                    c13.setText(String.valueOf(c[0][2]));
                    c21.setText(String.valueOf(c[1][0]));
                    c22.setText(String.valueOf(c[1][1]));
                    c23.setText(String.valueOf(c[1][2]));
                    c31.setText(String.valueOf(c[2][0]));
                    c32.setText(String.valueOf(c[2][1]));
                    c33.setText(String.valueOf(c[2][2]));

                }
            }
        });


        //Matrix subtraction
        sub.setOnClickListener(new View.OnClickListener() {
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
                } else if (b11.getText().toString().equals("")) {
                } else if (b12.getText().toString().equals("")) {
                } else if (b13.getText().toString().equals("")) {
                } else if (b21.getText().toString().equals("")) {
                } else if (b22.getText().toString().equals("")) {
                } else if (b23.getText().toString().equals("")) {
                } else if (b31.getText().toString().equals("")) {
                } else if (b32.getText().toString().equals("")) {
                } else if (b33.getText().toString().equals("")) {
                } else {
                    double a[][] = new double[3][3];
                    double b[][] = new double[3][3];
                    double c[][] = new double[3][3];
                    a[0][0] = Double.valueOf(Double.parseDouble((a11.getText().toString())));
                    a[0][1] = Double.valueOf(Double.parseDouble((a12.getText().toString())));
                    a[0][2] = Double.valueOf(Double.parseDouble((a13.getText().toString())));
                    a[1][0] = Double.valueOf(Double.parseDouble((a21.getText().toString())));
                    a[1][1] = Double.valueOf(Double.parseDouble((a22.getText().toString())));
                    a[1][2] = Double.valueOf(Double.parseDouble((a23.getText().toString())));
                    a[2][0] = Double.valueOf(Double.parseDouble((a31.getText().toString())));
                    a[2][1] = Double.valueOf(Double.parseDouble((a32.getText().toString())));
                    a[2][2] = Double.valueOf(Double.parseDouble((a33.getText().toString())));

                    b[0][0] = Double.valueOf(Double.parseDouble((b11.getText().toString())));
                    b[0][1] = Double.valueOf(Double.parseDouble((b12.getText().toString())));
                    b[0][2] = Double.valueOf(Double.parseDouble((b13.getText().toString())));
                    b[1][0] = Double.valueOf(Double.parseDouble((b21.getText().toString())));
                    b[1][1] = Double.valueOf(Double.parseDouble((b22.getText().toString())));
                    b[1][2] = Double.valueOf(Double.parseDouble((b23.getText().toString())));
                    b[2][0] = Double.valueOf(Double.parseDouble((b31.getText().toString())));
                    b[2][1] = Double.valueOf(Double.parseDouble((b32.getText().toString())));
                    b[2][2] = Double.valueOf(Double.parseDouble((b33.getText().toString())));

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            c[i][j] = a[i][j] - b[i][j];
                        }
                    }
                    c11.setText(String.valueOf(c[0][0]));
                    c12.setText(String.valueOf(c[0][1]));
                    c13.setText(String.valueOf(c[0][2]));
                    c21.setText(String.valueOf(c[1][0]));
                    c22.setText(String.valueOf(c[1][1]));
                    c23.setText(String.valueOf(c[1][2]));
                    c31.setText(String.valueOf(c[2][0]));
                    c32.setText(String.valueOf(c[2][1]));
                    c33.setText(String.valueOf(c[2][2]));
                }
            }
        });

        //Multiply matrix
        prod.setOnClickListener(new View.OnClickListener() {
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
                } else if (b11.getText().toString().equals("")) {
                } else if (b12.getText().toString().equals("")) {
                } else if (b13.getText().toString().equals("")) {
                } else if (b21.getText().toString().equals("")) {
                } else if (b22.getText().toString().equals("")) {
                } else if (b23.getText().toString().equals("")) {
                } else if (b31.getText().toString().equals("")) {
                } else if (b32.getText().toString().equals("")) {
                } else if (b33.getText().toString().equals("")) {
                } else {
                    double a[][] = new double[3][3];
                    double b[][] = new double[3][3];
                    double c[][] = new double[3][3];
                    a[0][0] = Double.valueOf(Double.parseDouble((a11.getText().toString())));
                    a[0][1] = Double.valueOf(Double.parseDouble((a12.getText().toString())));
                    a[0][2] = Double.valueOf(Double.parseDouble((a13.getText().toString())));
                    a[1][0] = Double.valueOf(Double.parseDouble((a21.getText().toString())));
                    a[1][1] = Double.valueOf(Double.parseDouble((a22.getText().toString())));
                    a[1][2] = Double.valueOf(Double.parseDouble((a23.getText().toString())));
                    a[2][0] = Double.valueOf(Double.parseDouble((a31.getText().toString())));
                    a[2][1] = Double.valueOf(Double.parseDouble((a32.getText().toString())));
                    a[2][2] = Double.valueOf(Double.parseDouble((a33.getText().toString())));

                    b[0][0] = Double.valueOf(Double.parseDouble((b11.getText().toString())));
                    b[0][1] = Double.valueOf(Double.parseDouble((b12.getText().toString())));
                    b[0][2] = Double.valueOf(Double.parseDouble((b13.getText().toString())));
                    b[1][0] = Double.valueOf(Double.parseDouble((b21.getText().toString())));
                    b[1][1] = Double.valueOf(Double.parseDouble((b22.getText().toString())));
                    b[1][2] = Double.valueOf(Double.parseDouble((b23.getText().toString())));
                    b[2][0] = Double.valueOf(Double.parseDouble((b31.getText().toString())));
                    b[2][1] = Double.valueOf(Double.parseDouble((b32.getText().toString())));
                    b[2][2] = Double.valueOf(Double.parseDouble((b33.getText().toString())));

                    double sum = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            for (int k = 0; k < 3; k++) {
                                sum = sum + a[i][k] * b[k][j];
                            }

                            c[i][j] = sum;
                            sum = 0;
                        }
                    }
                    c11.setText(String.valueOf(c[0][0]));
                    c12.setText(String.valueOf(c[0][1]));
                    c13.setText(String.valueOf(c[0][2]));
                    c21.setText(String.valueOf(c[1][0]));
                    c22.setText(String.valueOf(c[1][1]));
                    c23.setText(String.valueOf(c[1][2]));
                    c31.setText(String.valueOf(c[2][0]));
                    c32.setText(String.valueOf(c[2][1]));
                    c33.setText(String.valueOf(c[2][2]));

                } }
        });


    }
}