package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Declaración de variables
    EditText etNumero1, etNumero2;
    TextView tvResultado;
    Button btSumar, btDividir, btRestar, btMultiplicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlace de las variables con los elementos
         tvResultado = findViewById(R.id.resultado);
         etNumero1 = findViewById(R.id.numero1);
         etNumero2 = findViewById(R.id.numero2);
         btSumar = findViewById(R.id.sumar);
         btDividir = findViewById(R.id.dividir);
         btRestar = findViewById(R.id.restar);
         btMultiplicar = findViewById(R.id.multiplicar);

         //Código para sumar



    }


}
