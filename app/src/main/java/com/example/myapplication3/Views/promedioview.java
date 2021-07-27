package com.example.myapplication3.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


/*import com.example.myapplication3.Interactor.PromedioInteractor;
import com.example.myapplication3.Interfaces.PromedioInterface;
import com.example.myapplication3.Presenters.PromedioPresenter;*/
import com.example.myapplication3.R;

public class promedioview extends AppCompatActivity  {

    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private TextView elresultado;
    //private Integer;
    //private  PromedioInterface.Presenter presenter;

    private View view;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_pagoxpromedio);

        nota1 = (EditText)findViewById(R.id.txtnum1prom);
        nota2 = (EditText)findViewById(R.id.txtnum2prom);
        nota3 = (EditText)findViewById(R.id.txtnum3prom);
        elresultado = (TextView) findViewById(R.id.txtresulprom);
        //PromedioPresenter presentador = new PromedioPresenter(this);

    }

   public void Promedio(View view) {

       double n1 = Integer.parseInt(nota1.getText().toString());
       double n2 = Integer.parseInt(nota2.getText().toString());
       double n3 = Integer.parseInt(nota3.getText().toString());
       //PromedioInteractor presentador;
       //final Void promediar = presentador.promediar(n1, n2, n3);
       double Prom = (n1 + n2 + n3) / 3;

       if (Prom >=3) {
           elresultado.setText("Aprobado con promedio  igual a:" + Prom);
       } else if (Prom < 3) {
           elresultado.setText( "Reprobado con promedio igual a:"  + Prom);
       }
       //String.format("El triangulo es %s.\nEl area es (%.3f).\nEl perimetro es (%.3f).", t, a, p)




       /*String ELPromedio = String.valueOf(Prom);
       elresultado.setText(ELPromedio);*/
   }

    public void Gomain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

/*
    @Override
    public void mostrarresultado(String resultado) {
        elresultado.setText("El promedio es" + resultado);

    }*/
}