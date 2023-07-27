package com.av.mathssolver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class numconv extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner s1;
    Button gen;
    ImageButton back;
    int pos=0;
    EditText n;
    TextView t1,t2,t3;

    String v[] = {"Binary","Decimal","Octal","Hexadecimal"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_numconv);

        //For output

         t1 = findViewById(R.id.t1);
         t2 = findViewById(R.id.t2);
         t3 = findViewById(R.id.t3);
         n  = findViewById(R.id.a);
        //Back button

        back = (ImageButton)findViewById(R.id.back3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(numconv.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //number type selection
        Spinner s1 = findViewById(R.id.s1);
        s1.setOnItemSelectedListener(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,v);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);

        //results
        gen = (Button)findViewById(R.id.generate);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (n.getText().toString().equals("")  ){
                    t1.setText("Enter value");
                }
                else {
                    long val;int dec;
                switch (pos)
                {

                    case 0:
                        //binary
                        if(numcheck(n.getText().toString())){
                        val = Long.valueOf(Long.parseLong((n.getText().toString())));
                        if(binCheck(val)) {
                            dec = binToDec(val);
                            t1.setText("Decimal :" + dec);
                            t2.setText("Octal :" + decToOct(dec));
                            t3.setText("Hexadecimal :" + decToHex(dec));
                            break;
                        }
                        else{
                            t1.setText(String.valueOf(val));
                            t2.setText("is not a Binary value");
                            t3.setText("....");
                            break;
                        }}
                    case 1:
                        //decimal
                        if(numcheck(n.getText().toString())) {
                            val = Long.valueOf(Long.parseLong((n.getText().toString())));
                            t1.setText("Binary :" + String.valueOf(decTobin(val)));  //wrong
                            t2.setText("Octal :" + decToOct(val));
                            t3.setText("Hexadecimal :" + decToHex(val));
                        }
                        break;
                    case 2:
                        //octal
                        if(numcheck(n.getText().toString())) {
                            val = Long.valueOf(Long.parseLong((n.getText().toString())));
                           dec = octToDec(val);
                            t1.setText("Binary :" + String.valueOf(decTobin(dec)));
                            t2.setText("Decimal :" + String.valueOf(octToDec(val)));
                            t3.setText("Hexadecimal :" + decToHex(dec));
                        }
                        break;
                    case 3:
                        //Hexadecimal

                         dec = hexToDec(n.getText().toString());
                        t1.setText("Binary :" +String.valueOf(decTobin(dec)));
                        t2.setText("Decimal :" +String.valueOf(dec));
                        t3.setText("Octal :"+decToOct(dec));
                        break;

                }}
            }
        });
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),v[position] , Toast.LENGTH_LONG).show();
        pos = position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(),v[0] , Toast.LENGTH_LONG).show();
        pos = 0;
    }

    public static boolean binCheck(long b){
        boolean aa = false;
        while (b!=0)
        {
            if(b%10 == 0 || b%10 == 1)
            {
                b /= 10;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    //Binary to Decimal
    public static int binToDec(long b) {
        int dec = 0;
        int n = 0;
        while (true) {
            if (b == 0) {
                break;
            } else {
                long temp = b % 10;
                dec += temp * Math.pow(2, n);
                b = b / 10;
                n++;
            }
        }
        return dec;
    }

    //String to Decimal
    public static String decToHex(long dec){
        long rem;
        String hex = "";
        char hexc[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(dec > 0)
        {
            rem = dec % 16;
            hex = hexc[(int) rem] + hex;
            dec = dec / 16;
        }
        return hex;
    }


    //Decimal to Octal
    public static String decToOct(long dec){
        long rem;
        String octal = "";

        char octc[]={'0','1','2','3','4','5','6','7'};

        while(dec > 0)
        {
            rem=dec % 8;
            octal=octc[(int) rem] + octal;
            dec = dec / 8;
        }
        return octal;
    }

    //decimal to binary
    public static long decTobin(long n) {

        long bin = 0;
        long rem, i = 1, step = 1;

        while (n!=0)
        {
            rem = n % 2;
            n /= 2;
            bin += rem * i;
            i *= 10;
        }
        return bin;
    }

    //octal to decimal
    public static int octToDec(long oct){

        int dec = 0;
        int n = 0;
        while(true){
            if(oct == 0){
                break;
            } else {
                long temp = oct%10;
                dec += temp*Math.pow(8, n);
                oct = oct/10;
                n++;
            }
        }
        return dec;
    }

    //Hexadecimal to decimal
    public static int hexToDec(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public boolean numcheck(String str) {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) < '0'
                    || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    }
