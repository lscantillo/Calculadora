package com.uninorte.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvresultado;
    int calculo,num1;
    String operacion="";
    String simbolo="";

    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        tvresultado=(TextView) findViewById(R.id.txtNumero);
    }



    public void  valor(int i){
        calculo= i;
        operacion= operacion + Integer.toString(calculo);
        tvresultado.setText(operacion);

    }

    public  void guardar (){
        operacion="";
        num1=calculo;

    }

    public void onclickigual(View view) {



        if(simbolo.equals("+"))
        {
            num1= num1+calculo;
        }
        else if(simbolo.equals("-"))
        {
            num1= num1-calculo;
        }


        tvresultado.setText(""+ num1);

    }

    public void onclickmenos(View view) {
        guardar ();
        simbolo="-";
    }

    public void onclickmas(View view) {
        guardar ();
        simbolo="+";
    }

    public void onclickbtn7(View view) {
        valor(7);
    }

    public void onclickbtn8(View view) {
        valor(8);
    }

    public void onclickbtn9(View view) {
        valor(9);
    }

    public void onclickbtn4(View view) {
        valor(4);
    }

    public void onclickbtn5(View view) {
        valor(5);
    }

    public void onclickbtn6(View view) {
        valor(6);
    }

    public void onclickbtn3(View view) {
        valor(3);
    }

    public void onclickbtn2(View view) {
        valor(2);
    }

    public void onclickbtn1(View view) {
        valor(1);

    }

    public void onclickbtn0(View view) {
        valor(0);

    }
    public void onclickclear(View view) {
        operacion="";
        tvresultado.setText(operacion);


    }
}

