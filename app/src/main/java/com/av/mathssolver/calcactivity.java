package com.av.mathssolver;

import static com.av.mathssolver.R.id.back;
import static com.av.mathssolver.R.id.mul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class calcactivity extends AppCompatActivity {
    ImageButton back;
    public EditText e1, e2;
    TextView res;
    Double num1, num2,res2;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_calcactivity);

        back = (ImageButton)findViewById(R.id.back);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        res = (TextView) findViewById(R.id.result);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calcactivity.this,MainActivity.class);
                startActivity(intent);
            }
    });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("")) {
                    res.setText("Enter first number");
                }
                else if (e2.getText().toString().equals("")) {
                    res.setText("Enter second number");
                }
                else
                {
                    num1 = Double.valueOf(Double.parseDouble(e1.getText().toString()));
                    num2 = Double.valueOf(Double.parseDouble(e2.getText().toString()));
                    res2 = num1 + num2;
                    res.setText(res2.toString());
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("")) {
                    res.setText("Enter first number");
                }
                else if (e2.getText().toString().equals("")) {
                    res.setText("Enter second number");
                }
                else
                {
                    num1 = Double.valueOf(Double.parseDouble(e1.getText().toString()));
                    num2 = Double.valueOf(Double.parseDouble(e2.getText().toString()));
                    res2 = num1 - num2;
                    res.setText(res2.toString());
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("")) {
                    res.setText("Enter first number");
                }
                else if (e2.getText().toString().equals("")) {
                    res.setText("Enter second number");
                }
                else
                {
                    num1 = Double.valueOf(Double.parseDouble(e1.getText().toString()));
                    num2 = Double.valueOf(Double.parseDouble(e2.getText().toString()));
                    res2 = num1 * num2;
                    res.setText(res2.toString());
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.getText().toString().equals("")) {
                    res.setText("Enter first number");
                }
                else if (e2.getText().toString().equals("")) {
                    res.setText("Enter second number");
                }
                else
                {
                    num1 = Double.valueOf(Double.parseDouble(e1.getText().toString()));
                    num2 = Double.valueOf(Double.parseDouble(e2.getText().toString()));
                    res2 = num1 / num2;
                    res.setText(res2.toString());
                }
            }
        });
}

}