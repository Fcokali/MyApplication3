package com.example.myapplication3.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication3.R;

public class pagoentradacine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagoentradacine);
    }

    public void goMain1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goCalculadora(View view) {
        Intent intent = new Intent(this, Calculadora.class);
        startActivity(intent);
    }
}