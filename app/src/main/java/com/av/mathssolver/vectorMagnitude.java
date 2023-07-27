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

public class vectorMagnitude extends AppCompatActivity {

    ImageButton b;
    Button res;
    TextView r;
    EditText x1,x2,x3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vector_magnitude);

        x1 =findViewById(R.id.x1);
        x2 =findViewById(R.id.x2);
        x3 =findViewById(R.id.x3);
        r=findViewById(R.id.res1);
        res = (Button)findViewById(R.id.resbut);
        //TO go back
        b = findViewById(R.id.back3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vectorMagnitude.this, vecSel.class);
                startActivity(intent);
            }
        });

        //calculate magnitude
       res.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (x1.getText().toString().equals("")) {
                   r.setText("Enter x1");
               } else if (x2.getText().toString().equals("")) {
                   r.setText("Enter x2");
               } else if (x3.getText().toString().equals("")) {
                   r.setText("Enter x3");
               } else {
                   int y1, y2, y3;
                   y1 = Integer.valueOf(Integer.parseInt((x1.getText().toString())));
                   y2 = Integer.valueOf(Integer.parseInt((x2.getText().toString())));
                   y3 = Integer.valueOf(Integer.parseInt((x3.getText().toString())));
                   double res = Math.pow(y1 * y1 + y2 * y2 + y3 * y3, 0.5);
                   r.setText(String.format("%.2f", res));
               }
           }
       });

    }
}