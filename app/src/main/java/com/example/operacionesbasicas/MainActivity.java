package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
btSumar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Sumar();
    }
});

btRestar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Restar();
    }
});

btMultiplicar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Multiplicar();
    }
});

btDividir.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Dividir();
    }
});


    }
    //Método para Sumar
public void Sumar(){
        String suno = etNumero1.getText().toString();
        String sdos = etNumero2.getText().toString();
        if (suno.equals("")||sdos.equals("")){//------------------------Valida que no falte un número. Esto se utiliza en todos los comportamientos
tvResultado.setText("Falta un número");
        }else{

int uno = Integer.parseInt(suno);
            int dos = Integer.parseInt(sdos);
           int sum = uno+dos;
           tvResultado.setText("El resultado de la suma es: "+sum);
        }
}
//Método para restar
public void Restar(){
    String suno = etNumero1.getText().toString();
    String sdos = etNumero2.getText().toString();
    if (suno.equals("")||sdos.equals("")){
        tvResultado.setText("Falta un número");
    }else{

        int uno = Integer.parseInt(suno);
        int dos = Integer.parseInt(sdos);
        int rest = uno-dos;
        tvResultado.setText("El resultado de la resta es: "+rest);
    }
}

//Metodo para multiplicar
public void Multiplicar(){
    String suno = etNumero1.getText().toString();
    String sdos = etNumero2.getText().toString();
    if (suno.equals("")||sdos.equals("")){
        tvResultado.setText("Falta un número");
    }else{

        int uno = Integer.parseInt(suno);
        int dos = Integer.parseInt(sdos);
        int multi = uno*dos;
        tvResultado.setText("El resultado de la multiplicación es: "+multi);
    }
}
public void Dividir(){
    String suno = etNumero1.getText().toString();
    String sdos = etNumero2.getText().toString();
    if (suno.equals("")||sdos.equals("")){
        tvResultado.setText("Falta un número");
    }else{

        int uno = Integer.parseInt(suno);
        int dos = Integer.parseInt(sdos);

        if(uno == 0 && dos == 0){//-------------------------Validación 0/0
            tvResultado.setText("Resultado indefinido");
        }else if (dos == 0){//---------------------------------Validacion Numero/0
            tvResultado.setText("No se puede dividir entre cero");
        }else{//------------------------------------------------Divición
            int div = uno/dos;
            tvResultado.setText("El resultado de la división es: "+div);
        }

    }
}
}
