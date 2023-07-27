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

public class Combination extends AppCompatActivity {

    public EditText n , r;
    TextView res;
    Button eq;
    ImageButton back3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_combination);
        back3 = (ImageButton)findViewById(R.id.back3);
        n = (EditText) findViewById(R.id.a);
        r = (EditText) findViewById(R.id.c);
        res = (TextView) findViewById(R.id.res);
        eq = (Button) findViewById(R.id.generate);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Combination.this,permcom.class);
                startActivity(intent);
            }
        });
        eq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if (n.getText().toString().equals("")) {
                    res.setText("Enter n");
                }
                else if (r.getText().toString().equals("")) {
                    res.setText("Enter r");
                }

                else{
                        long n1 = Long.valueOf(Long.parseLong((n.getText().toString())));
                        long r1 = Long.valueOf(Long.parseLong((r.getText().toString())));
                        if (n1 > r1)
                        {
                            long ress = fact(n1) / (fact(n1 - r1) * fact(r1));
                            res.setText(String.valueOf(ress));
                        }
                        else
                        {
                            res.setText("r is greater than n");
                        }
                }
            }
            public long fact(long num)
            {
                long fact=1, i;
                for(i=1; i<=num; i++)
                {
                    fact = fact*i;
                }
                return fact;
            }
        });
    }
}