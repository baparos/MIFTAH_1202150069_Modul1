package com.example.mifta.case1_1202150069;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class SecondActivty extends AppCompatActivity {

    int duit = 65000;
    int harga, total, hargaTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);
        TextView Makanan = (TextView)findViewById(R.id.makanan);
        TextView amount = (TextView)findViewById(R.id.porsi1);
        TextView lokasi = (TextView)findViewById(R.id.resto);
        TextView hasil = (TextView)findViewById(R.id.harga);
        Intent i = getIntent();

        String makanan = i.getStringExtra("makanan");
        String Lokasi = i.getStringExtra("tempat");
        String jumlah = i.getStringExtra("porsi");


        Makanan.setText(makanan);
        amount.setText(jumlah);
        lokasi.setText(Lokasi);

        switch (Lokasi){
            case "Eatbus":
                harga = 50000;
                break;
            case "Abnormal":
                harga = 30000;
                break;
        }
        total = parseInt(jumlah) * harga;
        String hargaTotal = Integer.toString(total);
        if(duit < total){
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Jangan disini makan makannya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }else{
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Disini Aja makan malamnya", Toast.LENGTH_SHORT).show();
        }
    }
}
/*
public class SecondActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);
    }
}
*/