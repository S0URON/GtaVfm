package com.mokniCorp.gtavfm;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RadioList extends AppCompatActivity {

    private static final String TAG = "RadioList";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_list);
        Log.d(TAG, "onCreate:  Started.");

        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 =  findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent(RadioList.this, wescostclassics.class);
                startActivity(move);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent(RadioList.this, LosSantosfm.class);
                startActivity(move);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent(RadioList.this, thespace.class);
                startActivity(move);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent(RadioList.this, theLab.class);
                startActivity(move);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent(RadioList.this, nonStopFm.class);
                startActivity(move);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent move = new Intent(RadioList.this, flyloFm.class);
                startActivity(move);
            }
        });


    }

}
