package com.example.myapplication3.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication3.R;

public class Calculadora extends AppCompatActivity {

    private EditText et_numer1;
    private EditText et_numer2;
    private TextView et_resultado;
    private View view;
    private Integer integer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        et_numer1 = (EditText)  findViewById(R.id.Numero1);
        et_numer2 = (EditText)  findViewById(R.id.Numero2);
        et_resultado = (TextView) findViewById(R.id.txtresultadocal);
    }
    public void calcular(View view) {

        int num1 = integer.parseInt(et_numer1.getText().toString());
        int num2 = integer.parseInt(et_numer2.getText().toString());

        int operacion = num1 + num2;

        String resultado = String.valueOf(operacion);
        et_resultado.setText(resultado);

    }
    public void restar(View view) {

        int num1 = integer.parseInt(et_numer1.getText().toString());
        int num2 = integer.parseInt(et_numer2.getText().toString());

        int operacion = num1 - num2;

        String resultado = String.valueOf(operacion);
        et_resultado.setText(resultado);
    }
    public void Multiplicar(View view) {

        int num1 = integer.parseInt(et_numer1.getText().toString());
        int num2 = integer.parseInt(et_numer2.getText().toString());

        int operacion = num1 * num2;

        String resultado = String.valueOf(operacion);
        et_resultado.setText(resultado);
    }

    public void Dividir(View view) {

        int num1 = integer.parseInt(et_numer1.getText().toString());
        int num2 = integer.parseInt(et_numer2.getText().toString());

        if (num2 != 0) {
            int operacion = num1 / num2;
            String resultado = String.valueOf(operacion);
            et_resultado.setText(resultado);
        } else {
            Toast.makeText(this, "EL SEGUNDO VALOR DEBE SER DIFERENTE DE CERO", Toast.LENGTH_LONG).show();

        }
    }

    public void Gomain1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
