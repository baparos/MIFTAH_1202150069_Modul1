package com.example.mifta.case1_1202150069;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //    Deklarasi variabel;
    Button Abnormal, Eatbus;
    EditText makanan, porsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  Mencari berdasarkan id
        Abnormal = (Button)findViewById(R.id.abnormal);
        Eatbus = (Button)findViewById(R.id.eatboss);
        makanan = (EditText)findViewById(R.id.makanan);
        porsi = (EditText)findViewById(R.id.porsi1);

//  untuk Abnormal
        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,SecondActivty.class);
                String tempat = Abnormal.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());
                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);

            }
        });

        //untuk eatbus
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,SecondActivty.class);
                String tempat = Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());

                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
    }
}
/*
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.mifta.case1_1202150069.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button abnormal= (Button) findViewById(R.id.abnormal);

        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent btn= new Intent(getApplicationContext(),SecondActivty.class);

                startActivity(btn);
            }
            EXTRA_MESSAGE= "abnormal";
        });

        Button eatboss= (Button) findViewById(R.id.eatboss);

        eatboss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent btn= new Intent(getApplicationContext(),SecondActivty.class);


                startActivity(btn);
            }
            EXTRA_MESSAGE= "eatboss";
        });
    }
}
*/
