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

public class matrixInverse extends AppCompatActivity {

    ImageButton b;
    Button generate;
    EditText a11,a12,a13,a21,a22,a23,a31,a32,a33;
    TextView b11,b12,b13,b21,b22,b23,b31,b32,b33;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_matrix_inverse);

        b = (ImageButton) findViewById(R.id.back3);
        generate = (Button) findViewById(R.id.gen);

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

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(matrixInverse.this, Matrix.class);
                startActivity(intent);
            }
        });
        generate.setOnClickListener(new View.OnClickListener() {
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
                double b[][] = new double[3][3];
                a[0][0] = Double.valueOf(Double.parseDouble((a11.getText().toString())));
                a[0][1] = Double.valueOf(Double.parseDouble((a12.getText().toString())));
                a[0][2] = Double.valueOf(Double.parseDouble((a13.getText().toString())));
                a[1][0] = Double.valueOf(Double.parseDouble((a21.getText().toString())));
                a[1][1] = Double.valueOf(Double.parseDouble((a22.getText().toString())));
                a[1][2] = Double.valueOf(Double.parseDouble((a23.getText().toString())));
                a[2][0] = Double.valueOf(Double.parseDouble((a31.getText().toString())));
                a[2][1] = Double.valueOf(Double.parseDouble((a32.getText().toString())));
                a[2][2] = Double.valueOf(Double.parseDouble((a33.getText().toString())));
                double det = 0;
                for (int i = 0; i < 3; i++) {
                    det = det + (a[0][i] * (a[1][(i + 1) % 3] * a[2][(i + 2) % 3] - a[1][(i + 2) % 3] * a[2][(i + 1) % 3]));
                }
                if (det == 0)
                {
                    b11.setText("deta");
                    b12.setText("rmi");
                    b13.setText("nant");
                    b21.setText("is");
                    b22.setText("0");
                }
                else {
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < 3; ++j) {
                        b[i][j] = (((a[(j + 1) % 3][(i + 1) % 3] * a[(j + 2) % 3][(i + 2) % 3]) - (a[(j + 1) % 3][(i + 2) % 3] * a[(j + 2) % 3][(i + 1) % 3])) / det);
                    }
                }
                b11.setText(String.format("%.2f",b[0][0]));
                b12.setText(String.format("%.2f",b[0][1]));
                b13.setText(String.format("%.2f",b[0][2]));
                b21.setText(String.format("%.2f",b[1][0]));
                b22.setText(String.format("%.2f",b[1][1]));
                b23.setText(String.format("%.2f",b[1][2]));
                b31.setText(String.format("%.2f",b[2][0]));
                b32.setText(String.format("%.2f",b[2][1]));
                b33.setText(String.format("%.2f",b[2][2]));
            }}}
        });
    }
}