package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    ImageButton opt;
    Button calc, permute,hcf_lcm,power,root,numconv,vectors,matrices,apgp,areaselect,trigonometry,Quadratic,stats;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        //Button to launch Calculator
        calc = (Button) findViewById(R.id.Calc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, calcactivity.class);
                startActivity(intent);
            }
        });

        //Button to launch number converter
        numconv = (Button) findViewById(R.id.Numconv);
        numconv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, numconv.class);
                startActivity(intent);
            }
        });

        //Button to launch vectors
        vectors = (Button) findViewById(R.id.Vectors);
        vectors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, vecSel.class);
                startActivity(intent);
            }
        });

        //Button to launch permutation combination
        permute = (Button) findViewById(R.id.Permute);
        permute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, permcom.class);
                startActivity(intent);
            }
        });

        //Button to launch HCF LCM
        hcf_lcm = (Button) findViewById(R.id.HCF);
        hcf_lcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, hcflcm.class);
                startActivity(intent);
            }
        });

        //Button to launch power
        power = (Button) findViewById(R.id.power);
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Power.class);
                startActivity(intent);
            }
        });

        //Button to launch roots
        root = (Button) findViewById(R.id.Roots);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Root.class);
                startActivity(intent);
            }
        });

        //Button to launch matrices
        matrices = (Button) findViewById(R.id.Matrices);
        matrices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Matrix.class);
                startActivity(intent);
            }
        });
        //Button to launch AP GP Hp
        apgp = (Button) findViewById(R.id.apgphp);
        apgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, apGpHp.class);
                startActivity(intent);
            }
        });
        //Button to launch Area and volume
        areaselect = (Button) findViewById(R.id.Area);
        areaselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, areaSelection.class);
                startActivity(intent);
            }
        });
        //Button to launch Trigonometry
        trigonometry = (Button) findViewById(R.id.Trigonometry);
        trigonometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Trigo.class);
                startActivity(intent);
            }
        });

        //Button to launch quadratic
        Quadratic = (Button) findViewById(R.id.Quadratic);
        Quadratic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, quadratic.class);
                startActivity(intent);
            }
        });
        stats = (Button) findViewById(R.id.stats);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Statistics.class);
                startActivity(intent);
            }
        });
        ////Button to launch Options

        opt = (ImageButton) findViewById(R.id.opt);
        opt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, opt);

                // Inflating popup menu from popup_menu.xml file
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        if(item.getItemId() == R.id.about) {
                            Intent intent = new Intent(MainActivity.this, About.class);
                            startActivity(intent);
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}