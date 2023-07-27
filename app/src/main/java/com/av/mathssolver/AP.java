package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AP extends AppCompatActivity {

    ImageButton b;
    Button gen;
    RadioGroup radioGroup;
    EditText a1,d1,n1;
    TextView res;
    int check = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ap);

        radioGroup = findViewById(R.id.radioGroup);
        b = (ImageButton) findViewById(R.id.back4);
        gen = (Button) findViewById(R.id.gen);
        a1 = findViewById(R.id.a);
        d1 = findViewById(R.id.d);
        n1 = findViewById(R.id.n);
        res = findViewById(R.id.res);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AP.this, apGpHp.class);
                startActivity(intent);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton radioButton = findViewById(checkedId);
              if(radioButton.getId() == R.id.tn)
                {
                        check = 1;
                }
              else if(radioButton.getId() == R.id.sn)
              {
                        check = 2;
              }
            }
        });

        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a1.getText().toString().equals("")  ){
                    res.setText("Enter all values");
                }
                    else if( n1.getText().toString().equals("") )
                {
                    res.setText("Enter all values");
                }else if(d1.getText().toString().equals("")) {
                    res.setText("Enter all values");
                }
                else {

                double a = Double.valueOf(Double.parseDouble((a1.getText().toString())));
                double n = Double.valueOf(Double.parseDouble((n1.getText().toString())));
                double d = Double.valueOf(Double.parseDouble((d1.getText().toString())));

                if(check ==1)
                {
                    double tn =a + (n-1)*d;
                    res.setText("t"+(int)n+": "+String.valueOf(tn));
                }
                else if(check ==2)
                {
                    double s =(2*a) + (n-1)*d;
                    double sn = (n/2)*(s);
                    res.setText("s"+(int)n+": "+String.valueOf(sn));
                }
                else{
                    res.setText("please select button");
                }

            }}
        });


    }
}