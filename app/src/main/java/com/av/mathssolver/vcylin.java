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

public class vcylin extends AppCompatActivity {
    public EditText r,h;
    Button ans;
    TextView res;
    ImageButton back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vcylin);
        back3 = (ImageButton)findViewById(R.id.back3);
        r = (EditText) findViewById(R.id.r);
        h = (EditText) findViewById(R.id.h);
        res = (TextView) findViewById(R.id.res);
        ans = (Button)findViewById(R.id.generate);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vcylin.this,Volume.class);
                startActivity(intent);
            }
        });
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r.getText().toString().equals("")  ){
                    res.setText("Enter all values");
                }
                else if (h.getText().toString().equals("")  ){
                    res.setText("Enter all values");
                }
                else {
                    double r1 = Double.valueOf(Double.parseDouble(r.getText().toString()));
                    double h1 = Double.valueOf(Double.parseDouble(h.getText().toString()));
                    double s = (3.14) * (h1 * r1 * r1);
                    res.setText(String.format("%.2f", s));
                }         }
        });
    }
}