package com.uninorte.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class constraint extends AppCompatActivity {


    TextView tvresultado;
    int calculo;
    String operacion="";




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

    public void onclickigual(View view) {

    }

    public void onclickmenos(View view) {
    }

    public void onclickmas(View view) {
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
    }
}
