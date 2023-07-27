package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class apGpHp extends AppCompatActivity {

    ImageButton b;
    Button ap,gp,hp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_ap_gp_hp);

        b = (ImageButton) findViewById(R.id.back3);
        ap = (Button) findViewById(R.id.ap);
        gp = (Button) findViewById(R.id.gp);
        hp = (Button) findViewById(R.id.hp);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(apGpHp.this, MainActivity.class);
                startActivity(intent);
            }
        });


        ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(apGpHp.this,AP.class);
                startActivity(intent);
            }
        });
        gp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(apGpHp.this,GP.class);
                startActivity(intent);
            }
        });
        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(apGpHp.this,Hp.class);
                startActivity(intent);
            }
        });
    }
}