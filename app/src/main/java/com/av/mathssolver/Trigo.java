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

public class Trigo extends AppCompatActivity {
    Button gen;
    ImageButton back;
    EditText ang;
    TextView t1,t2,t3,t4,t5,t6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_trigo);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        ang  = findViewById(R.id.a);

        back = (ImageButton)findViewById(R.id.back3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Trigo.this, MainActivity.class);
                startActivity(intent);
            }
        });
        gen = (Button)findViewById(R.id.gen);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ang.getText().toString().equals("")  ){
                    t1.setText("Enter angle");
                }
                else {
                int val = Integer.valueOf(Integer.parseInt((ang.getText().toString())));

                t1.setText("Sin ("+val+"):" + String.format("%.2f",Math.sin(Math.toRadians(val))));
                t2.setText("Cos ("+val+"):" + String.format("%.2f",Math.cos(Math.toRadians(val))));
                t3.setText("tan ("+val+"):" + String.format("%.2f",Math.tan(Math.toRadians(val))));
                t4.setText("sec ("+val+"):" + String.format("%.2f",1/Math.sin(Math.toRadians(val))));
                t5.setText("cosec ("+val+"):" + String.format("%.2f",1/Math.cos(Math.toRadians(val))));
                t6.setText("cot ("+val+"):" +String.format("%.2f", 1/Math.tan(Math.toRadians(val))));
            }}
        });
    }
}