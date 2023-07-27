package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class quadratic extends AppCompatActivity {
    Button gen;
    ImageButton back;
    EditText a,b,c;
    TextView res1,res2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_quadratic);

        back = (ImageButton)findViewById(R.id.back3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(quadratic.this, MainActivity.class);
                startActivity(intent);
            }
        });
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        gen = findViewById(R.id.generate);
        res1 = findViewById(R.id.res);
        res2 = findViewById(R.id.res2);

        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.onEditorAction(EditorInfo.IME_ACTION_DONE);
                if (a.getText().toString().equals("")  ){
                    res2.setText("Enter a");
                }
                else if (b.getText().toString().equals("")  ){
                    res2.setText("Enter b");
                }
                else if (c.getText().toString().equals("")  ){
                    res2.setText("Enter c");
                }
                else{
                double A = Double.valueOf(Double.parseDouble((a.getText().toString())));
                double B = Double.valueOf(Double.parseDouble((b.getText().toString())));
                double C = Double.valueOf(Double.parseDouble((c.getText().toString())));
                double d = B*B - 4*A*C;
                if(d==0)
                {
                    res2.setText(String.valueOf(-B/(2*A)));
                }
                else if(d<0)
                {
                    double real = -B/(2*A);
                    double img =  Math.sqrt(-d) / (2 * A);
                    res1.setText(String.format("%.2f",real) +"-"+String.format("%.2f",img)+"i");
                    res2.setText(String.format("%.2f",real) +"+"+String.format("%.2f",img)+"i");
                }
                else if(d>0)
                {
                    res2.setText(String.format("%.2f",(-B + Math.sqrt(d)) / (2 * A)));
                    res1.setText(String.format("%.2f",(-B - Math.sqrt(d)) / (2 * A)));
                }
            }}
        });
    }
}