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

public class Power extends AppCompatActivity {

    public EditText a , x;
    TextView res;
    Button eq;
    ImageButton back3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_power);

        back3 = (ImageButton)findViewById(R.id.back3);
        a = (EditText) findViewById(R.id.a);
        x = (EditText) findViewById(R.id.c);
        res = (TextView) findViewById(R.id.res);
        eq = (Button) findViewById(R.id.generate);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Power.this, MainActivity.class);
                startActivity(intent);
            }
        });
        eq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("")) {
                    res.setText("Enter a");
                }
                else if (x.getText().toString().equals("")) {
                    res.setText("Enter x");
                }

                else {
                    int a1 = Integer.valueOf(Integer.parseInt((a.getText().toString())));
                    int x1 = Integer.valueOf(Integer.parseInt((x.getText().toString())));
                        int c = (int)Math.pow(a1,x1);
                        res.setText(String.valueOf(c));

                    }
                }

        });
    }
}