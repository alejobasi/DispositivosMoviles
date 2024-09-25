package com.example.dungeonsdados;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int contador_suma, contadorTirasD4, contadorTiradasD6,contadorTiradasD8,contadorTiradasD10,contadorTiradasD12,contadorTiradasD20,contadorTiradasD100;
private Button botonD4,botonD6,botonD8,botonD10,botonD12,botonD20,botonD100, botonReset;
private TextView cajaTotal,resultadoD4, tiradasD4,resultadoD6, tiradasD6,resultadoD8, tiradasD8,resultadoD10, tiradasD10,resultadoD12, tiradasD12,resultadoD20, tiradasD20,resultadoD100, tiradasD100;
Random generador=new Random();
    static final String Cuenta_Suma="Estado del contador";
    static final String Cuenta_D4="Estado del contador";
    static final String Cuenta_D6="Estado del contador";
    static final String Cuenta_D8="Estado del contador";
    static final String Cuenta_D10="Estado del contador";
    static final String Cuenta_D12="Estado del contador";
    static final String Cuenta_D20="Estado del contador";
    static final String Cuenta_D100="Estado del contador";


    static final String resultadoValores_D4="Estado del contador";
    static final String resultadoValores_D6="Estado del contador";
    static final String resultadoValores_D8="Estado del contador";
    static final String resultadoValores_D10="Estado del contador";
    static final String resultadoValores_D12="Estado del contador";
    static final String resultadoValores_D20="Estado del contador";
    static final String resultadoValores_D100="Estado del contador";






@SuppressLint("MissingInflatedId")
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    //if(savedInstanceState!=null){
       // contador_suma=savedInstanceState.getInt(Cuenta_Suma);
  //  }

    botonReset=findViewById(R.id.botonReset);
    botonReset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contador_suma=0;
            contadorTirasD4=0;
            contadorTiradasD6=0;
            contadorTiradasD8=0;
            contadorTiradasD10=0;
            contadorTiradasD12=0;
            contadorTiradasD20=0;
            contadorTiradasD100=0;


            tiradasD4.setText(String.valueOf(contador_suma));
            tiradasD6.setText(String.valueOf(contador_suma));
            tiradasD8.setText(String.valueOf(contador_suma));
            tiradasD10.setText(String.valueOf(contador_suma));
            tiradasD12.setText(String.valueOf(contador_suma));
            tiradasD20.setText(String.valueOf(contador_suma));
            tiradasD100.setText(String.valueOf(contador_suma));

            resultadoD4.setText(String.valueOf(contador_suma));
            resultadoD6.setText(String.valueOf(contador_suma));
            resultadoD8.setText(String.valueOf(contador_suma));
            resultadoD10.setText(String.valueOf(contador_suma));
            resultadoD12.setText(String.valueOf(contador_suma));
            resultadoD20.setText(String.valueOf(contador_suma));
            resultadoD100.setText(String.valueOf(contador_suma));

            cajaTotal.setText(String.valueOf(contador_suma));
        }
    });
resultadoD4=findViewById(R.id.resultadoD4);
tiradasD4=findViewById(R.id.tiradasD4);
cajaTotal=findViewById(R.id.cuenta);
botonD4=findViewById(R.id.botonD4);
botonD4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
    contadorTirasD4++;
    int ran=generador.nextInt(4)+1;
    contador_suma+=ran;
    resultadoD4.setText(String.valueOf(ran));
    tiradasD4.setText(String.valueOf(contadorTirasD4));
    cajaTotal.setText(String.valueOf(contador_suma));
    }

});

    resultadoD6=findViewById(R.id.resultadoD6);
    tiradasD6=findViewById(R.id.tiradasD6);

    botonD6=findViewById(R.id.botonD6);
    botonD6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contadorTiradasD6++;
            int ran=generador.nextInt(6)+1;
            contador_suma+=ran;
            resultadoD6.setText(String.valueOf(ran));
            tiradasD6.setText(String.valueOf(contadorTiradasD6));
            cajaTotal.setText(String.valueOf(contador_suma));
        }
    });

    resultadoD8=findViewById(R.id.resultadoD8);
    tiradasD8=findViewById(R.id.tiradasD8);

    botonD8=findViewById(R.id.botonD8);
    botonD8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contadorTiradasD8++;
            int ran=generador.nextInt(8)+1;
            contador_suma+=ran;
            resultadoD8.setText(String.valueOf(ran));
            tiradasD8.setText(String.valueOf(contadorTiradasD8));
            cajaTotal.setText(String.valueOf(contador_suma));
        }
    });

    resultadoD10=findViewById(R.id.resultadoD10);
    tiradasD10=findViewById(R.id.tiradasD10);

    botonD10=findViewById(R.id.botonD10);
    botonD10.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contadorTiradasD10++;
            int ran=generador.nextInt(10)+1;
            contador_suma+=ran;
            resultadoD10.setText(String.valueOf(ran));
            tiradasD10.setText(String.valueOf(contadorTiradasD10));
            cajaTotal.setText(String.valueOf(contador_suma));
        }
    });

    resultadoD12=findViewById(R.id.resultadoD12);
    tiradasD12=findViewById(R.id.tiradasD12);

    botonD12=findViewById(R.id.botonD12);
    botonD12.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contadorTiradasD12++;
            int ran=generador.nextInt(12)+1;
            contador_suma+=ran;
            resultadoD12.setText(String.valueOf(ran));
            tiradasD12.setText(String.valueOf(contadorTiradasD12));
            cajaTotal.setText(String.valueOf(contador_suma));
        }
    });

    resultadoD20=findViewById(R.id.resultadoD20);
    tiradasD20=findViewById(R.id.tiradasD20);

    botonD20=findViewById(R.id.botonD20);
    botonD20.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contadorTiradasD20++;
            int ran=generador.nextInt(20)+1;
            contador_suma+=ran;
            resultadoD20.setText(String.valueOf(ran));
            tiradasD20.setText(String.valueOf(contadorTiradasD20));
            cajaTotal.setText(String.valueOf(contador_suma));
        }
    });

    resultadoD100=findViewById(R.id.resultadoD100);
    tiradasD100=findViewById(R.id.tiradasD100);

    botonD100=findViewById(R.id.botonD100);
    botonD100.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            contadorTiradasD100++;
            int ran=generador.nextInt(100)+1;
            contador_suma+=ran;
            resultadoD100.setText(String.valueOf(ran));
            tiradasD100.setText(String.valueOf(contadorTiradasD100));
            cajaTotal.setText(String.valueOf(contador_suma));
        }
    });

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        savedInstanceState.putInt(Cuenta_Suma, contador_suma);
        savedInstanceState.putInt(Cuenta_D4, contadorTirasD4);
        savedInstanceState.putInt(Cuenta_D6, contadorTiradasD6);
        savedInstanceState.putInt(Cuenta_D8, contadorTiradasD8);
        savedInstanceState.putInt(Cuenta_D10, contadorTiradasD10);
        savedInstanceState.putInt(Cuenta_D12, contadorTiradasD12);
        savedInstanceState.putInt(Cuenta_D20, contadorTiradasD20);
        savedInstanceState.putInt(Cuenta_D100, contadorTiradasD100);







        super.onSaveInstanceState(savedInstanceState);
    }
}