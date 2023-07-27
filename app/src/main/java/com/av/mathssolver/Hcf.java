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

public class Hcf extends AppCompatActivity {

    public EditText n1 , n2;
    TextView res;
    Button eqhcf;
    ImageButton back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hcf);

        back3 = (ImageButton)findViewById(R.id.back3);
        n1 = (EditText) findViewById(R.id.a);
        n2 = (EditText) findViewById(R.id.c);
        res = (TextView) findViewById(R.id.res);
        eqhcf = (Button) findViewById(R.id.generate);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hcf.this,hcflcm.class);
                startActivity(intent);
            }
        });
        eqhcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")) {
                    res.setText("Enter First number");
                } else if (n2.getText().toString().equals("")) {
                    res.setText("Enter second number");
                } else {
                    int a = Integer.valueOf(Integer.parseInt((n1.getText().toString())));
                    int b = Integer.valueOf(Integer.parseInt((n2.getText().toString())));
                    int hcf = 0;
                    for (int i = 1; i <= a || i <= b; i++) {
                        if (a % i == 0 && b % i == 0)
                            hcf = i;
                    }
                    res.setText(String.valueOf(hcf));
                }}
        });
    }
}