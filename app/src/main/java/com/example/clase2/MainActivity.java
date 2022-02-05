package com.example.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idValor1;
    private EditText idValor2;
    private TextView idResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idValor1 = findViewById(R.id.idValor1);
        idValor2 = findViewById(R.id.idValor2);
    }

    public void sumar(View view){
        String valor1 = idValor1.getText().toString();
        String valor2 = idValor2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = "Resultado: " + String.valueOf(num1) + " + "+ String.valueOf(num2) +" = " + String.valueOf(suma);

        idResultado.setText(result);
    }

    public void restar(View view){
        String valor1 = idValor1.getText().toString();
        String valor2 = idValor2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resta = num1 - num2;

        String result = "Resultado: " + String.valueOf(num1) + " - "+ String.valueOf(num2) +" = " + String.valueOf(resta);

        idResultado.setText(result);
    }

    public void multipicar(View view){
        String valor1 = idValor1.getText().toString();
        String valor2 = idValor2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int multi = num1 * num2;

        String result = "Resultado: " + String.valueOf(num1) + " X "+ String.valueOf(num2) +" = " + String.valueOf(multi);

        idResultado.setText(result);
    }

    public void dividir(View view){
        String valor1 = idValor1.getText().toString();
        String valor2 = idValor2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int dividir = num1 / num2;

        String result = "Resultado: " + String.valueOf(num1) + " / "+ String.valueOf(num2) +" = " + String.valueOf(dividir);

        idResultado.setText(result);
    }
}