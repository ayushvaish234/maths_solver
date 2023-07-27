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

public class vectorAdd extends AppCompatActivity {
    ImageButton b;
    Button r;
    TextView res;
    EditText x1,x2,x3,x4,x5,x6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vector_add);

        x1 =findViewById(R.id.x1);
        x2 =findViewById(R.id.x2);
        x3 =findViewById(R.id.x3);
        x4 =findViewById(R.id.x4);
        x5 =findViewById(R.id.x5);
        x6 =findViewById(R.id.x6);

        res=findViewById(R.id.res1);
        r = (Button)findViewById(R.id.resbut);

        //TO go back
        b = (ImageButton)findViewById(R.id.back3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vectorAdd.this, vecSel.class);
                startActivity(intent);
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double y1 = 0, y2 = 0, y3 = 0, y4 = 0, y5 = 0, y6 = 0;
                if (x1.getText().toString().equals("")) {
                    res.setText("Enter x1");
                } else if (x2.getText().toString().equals("")) {
                    res.setText("Enter x2");
                } else if (x3.getText().toString().equals("")) {
                    res.setText("Enter x3");
                } else if (x4.getText().toString().equals("")) {
                    res.setText("Enter y1");
                } else if (x5.getText().toString().equals("")) {
                    res.setText("Enter y2");
                } else if (x6.getText().toString().equals("")) {
                    res.setText("Enter y3");
                } else {
                    y1 = Double.valueOf(Double.parseDouble((x1.getText().toString())));
                    y2 = Double.valueOf(Double.parseDouble((x2.getText().toString())));
                    y3 = Double.valueOf(Double.parseDouble((x3.getText().toString())));
                    y4 = Double.valueOf(Double.parseDouble((x4.getText().toString())));
                    y5 = Double.valueOf(Double.parseDouble((x5.getText().toString())));
                    y6 = Double.valueOf(Double.parseDouble((x6.getText().toString())));
                    String s = "(" + String.format("%.2f", (y1 + y4)) + "," + String.format("%.2f", (y2 + y5)) + "," + String.format("%.2f", (y3 + y6)) + ")";
                    res.setText(s);
                }
            }
        });

    }
}