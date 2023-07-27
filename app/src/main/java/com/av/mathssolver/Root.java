package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Root extends AppCompatActivity {

    public EditText a, x;
    TextView res;
    Button eq;
    ImageButton back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_root);
        back3 = (ImageButton) findViewById(R.id.back3);
        a = (EditText) findViewById(R.id.a);
        x = (EditText) findViewById(R.id.c);
        res = (TextView) findViewById(R.id.res);
        eq = (Button) findViewById(R.id.generate);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Root.this, MainActivity.class);
                startActivity(intent);
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a.getText().toString().equals("")) {
                    res.setText("Enter a");
                } else if (x.getText().toString().equals("")) {
                    res.setText("Enter x");
                } else {
                    double a1 = Double.valueOf(Double.parseDouble(a.getText().toString()));
                    double x1 = Double.valueOf(Double.parseDouble(x.getText().toString()));
                    double k = 1/x1;
                    Double c = Math.pow(a1, k);
                    res.setText(String.valueOf(c));

                }
            }

        });
    }
}