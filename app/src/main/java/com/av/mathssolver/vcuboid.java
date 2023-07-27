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

public class vcuboid extends AppCompatActivity {
    public EditText l,b,h;
    Button ans;
    TextView res;
    ImageButton back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vcuboid);
        back3 = (ImageButton)findViewById(R.id.back3);
        l = (EditText) findViewById(R.id.l);
        b = (EditText) findViewById(R.id.b);
        h = (EditText) findViewById(R.id.h);
        res = (TextView) findViewById(R.id.res);
        ans = (Button)findViewById(R.id.generate);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vcuboid.this,Volume.class);
                startActivity(intent);
            }
        });
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l.getText().toString().equals("")  ){
                    res.setText("Enter all values");
                }
                else if (h.getText().toString().equals("")  ){
                    res.setText("Enter all values");
                }

                else if (b.getText().toString().equals("")  ){
                    res.setText("Enter all values");
                }
                else{
                double l1 = Double.valueOf(Double.parseDouble(l.getText().toString()));
                double b1 = Double.valueOf(Double.parseDouble(b.getText().toString()));
                double h1 = Double.valueOf(Double.parseDouble(h.getText().toString()));
                res.setText(String.valueOf(l1*b1*h1));
            }}
        });
    }
}