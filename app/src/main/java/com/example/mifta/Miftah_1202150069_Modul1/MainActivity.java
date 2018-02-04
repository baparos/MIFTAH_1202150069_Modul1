package com.example.mifta.case1_1202150069;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    Deklarasi variabel;
    Button Abnormal, Eatbus;
    EditText makanan, porsi;
    String food,amount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//  cari id
        Abnormal = (Button)findViewById(R.id.abnormal);
        Eatbus = (Button)findViewById(R.id.eatboss);
        makanan = (EditText)findViewById(R.id.makanan);
        porsi = (EditText)findViewById(R.id.porsi1);
        food= makanan.getText().toString();
        amount=porsi.getText().toString();



    }
    public void abnormal(View view){
        Intent intent =new Intent(this, SecondActivty.class);

        food = makanan.getText().toString();
        amount = porsi.getText().toString();
        String tempat = Abnormal.getText().toString();

        if (food.isEmpty()||amount.isEmpty()){
            Toast.makeText(this, "Isi menu dan porsi dulu gan!", Toast.LENGTH_SHORT).show();
        }else{
            intent.putExtra("makanan",food);
            intent.putExtra("porsi",amount);
            intent.putExtra("tempat",tempat);
            startActivity(intent);
        }

    }
    public void eatbus(View view){
        Intent intent =new Intent(this, SecondActivty.class);

        food = makanan.getText().toString();
        amount = porsi.getText().toString();
        String tempat = Eatbus.getText().toString();

        if (food.isEmpty()||amount.isEmpty()){
            Toast.makeText(this, "Isi menu dan porsi dulu gan!", Toast.LENGTH_SHORT).show();
        }else{
            intent.putExtra("makanan",food);
            intent.putExtra("porsi",amount);
            intent.putExtra("tempat",tempat);
            startActivity(intent);
        }

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
