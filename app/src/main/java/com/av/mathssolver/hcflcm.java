package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class hcflcm extends AppCompatActivity {

    Button hcf, lcm;
    ImageButton back2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hcflcm);

        back2 = (ImageButton) findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hcflcm.this, MainActivity.class);
                startActivity(intent);
            }
        });

        hcf = (Button) findViewById(R.id.hcf);
        hcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hcflcm.this,Hcf.class);
                startActivity(intent);
            }
        });
        lcm = (Button) findViewById(R.id.lcm);
        lcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(hcflcm.this, Lcm.class);
                startActivity(intent);
            }
        });
    }
}
