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

public class vcube extends AppCompatActivity {
    public EditText a;
    Button ans;
    TextView res;
    ImageButton back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vcube);
        back3 = (ImageButton)findViewById(R.id.back3);
        a = (EditText) findViewById(R.id.l);
        res = (TextView) findViewById(R.id.res);
        ans = (Button)findViewById(R.id.generate);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vcube.this,Volume.class);
                startActivity(intent);
            }
        });
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString().equals("")  ){
                    res.setText("Enter all values");
                }
                else {
                double a1 = Double.valueOf(Double.parseDouble(a.getText().toString()));

                res.setText(String.valueOf(a1*a1*a1));
            }}
        });
    }
}