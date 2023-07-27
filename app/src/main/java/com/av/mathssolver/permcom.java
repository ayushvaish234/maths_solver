package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class permcom extends AppCompatActivity {

    Button npr, ncr;
    ImageButton back2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_permcom);

        back2 = (ImageButton)findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(permcom.this, MainActivity.class);
                 startActivity(intent);
             }
         });

        npr = (Button) findViewById(R.id.hcf);
        npr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(permcom.this, permutation.class);
                startActivity(intent);
            }
        });
        ncr = (Button) findViewById(R.id.lcm);
        ncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(permcom.this, Combination.class);
                startActivity(intent);
            }
        });
    }
}