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

import java.util.Arrays;

public class Statistics extends AppCompatActivity {

    Button gen;
    ImageButton back;
    EditText i;
    TextView t1, t2, t3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_statistics);

        t1 = findViewById(R.id.mean);
        t2 = findViewById(R.id.median);
        t3 = findViewById(R.id.mode);
        i = findViewById(R.id.input);
        gen = findViewById(R.id.gen);
        //Back button

        back = (ImageButton) findViewById(R.id.back5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Statistics.this, MainActivity.class);
                startActivity(intent);
            }
        });

        gen = (Button) findViewById(R.id.gen);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i.getText().toString().equals("")  ){
                    t1.setText("Enter input");
                }
               else {
                double mean = 0, median = 0, mode = 0;

                String inp = i.getText().toString();

                    String[] numbers = inp.split(",");
                    int[] num = new int[numbers.length];
                    //get numbers
                    for (int i = 0; i < numbers.length; i++) {
                        num[i] = Integer.parseInt(numbers[i]);
                    }
                    //mean
                    mean = 0;
                    for (int i = 0; i < num.length; i++) {
                        mean += num[i];
                    }
                    mean = mean / (num.length);

                    //median
                    Arrays.sort(num);
                    if (num.length % 2 == 0) {
                        median = (num[num.length / 2] + num[(num.length - 1) / 2]) / 2.0;
                    } else {
                        median = (num[num.length / 2]);
                    }

                    //mode
                    int maxValue = 0, maxCount = 0;

                    for (int i = 0; i < num.length; ++i) {
                        int count = 0;
                        for (int j = 0; j < num.length; ++j) {
                            if (num[j] == num[i]) {
                                ++count;
                            }
                        }

                        if (count > maxCount) {
                            maxCount = count;
                            maxValue = num[i];
                        }
                    }
                    mode = maxValue;

                    t1.setText("Mean:" + mean);
                    t2.setText("Median:" + median);
                    t3.setText("Mode:" + mode);
                }
            }
        });
    }
}