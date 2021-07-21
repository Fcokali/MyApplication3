package com.example.myapplication3.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPromedio(View view) {
        Intent intent = new Intent(this, promedioview.class);
        startActivity(intent);
    }


    public void goToCalculadora(View view) {
        Intent intent = new Intent(this, Calculadora.class);
        startActivity(intent);
    }


    public void goToPagoentradacine(View view) {
        Intent intent = new Intent(this, pagoentradacine.class);
        startActivity(intent);
    }




}