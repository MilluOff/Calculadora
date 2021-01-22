package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText operacion;
    Button suma, resta, division, mult, igual, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, punto, porciento, borrar, vaciar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacion = findViewById(R.id.eTOperacion);
        suma = findViewById(R.id.btnSuma);
        resta = findViewById(R.id.btnResta);
        division = findViewById(R.id.btnDivision);
        mult = findViewById(R.id.btnMult);
        igual = findViewById(R.id.btnIgual);
        uno = findViewById(R.id.btnUno);
        dos = findViewById(R.id.btnDos);
        tres = findViewById(R.id.btnTres);
        cuatro = findViewById(R.id.btnCuatro);
        cinco = findViewById(R.id.btnCinco);
        seis = findViewById(R.id.btnSeis);
        siete = findViewById(R.id.btnSiete);
        ocho = findViewById(R.id.btnOcho);
        nueve = findViewById(R.id.btnNueve);
        cero = findViewById(R.id.btnCero);
        vaciar = findViewById(R.id.btnVaciar);
        borrar = findViewById(R.id.btnBorrar);
        porciento = findViewById(R.id.btnPorcentaje);
        punto = findViewById(R.id.btnPunto);
    }

    public void Calcular(View view){
        String ope = operacion.getText().toString();
        if(ope.indexOf('+') != -1){
            String[] data = ope.split("[+]");
            double res = Double.parseDouble(data[0])+Double.parseDouble(data[1]);
            operacion.setText(String.valueOf(res));
        }

        if(ope.indexOf('-') != -1){
            String[] data = ope.split("[-]");
            double res = Double.parseDouble(data[0])-Double.parseDouble(data[1]);
            operacion.setText(String.valueOf(res));
        }

        if(ope.indexOf('x') != -1){
            String[] data = ope.split("[x]");
            double res = Double.parseDouble(data[0])*Double.parseDouble(data[1]);
            operacion.setText(String.valueOf(res));
        }

        if(ope.indexOf('/') != -1){
            String[] data = ope.split("[/]");
            double res = Double.parseDouble(data[0])/Double.parseDouble(data[1]);
            operacion.setText(String.valueOf(res));
        }
    }

    public void BotonBorrar(View view){
        String dataErase="";
        String data = operacion.getText().toString();
        char[] cData = data.toCharArray();
        for(int i=0;i<cData.length-1;i++){
            dataErase = dataErase+cData[i];
        }
        operacion.setText(dataErase);
        //Toast.makeText(this,dataErase,Toast.LENGTH_SHORT).show();
    }

    public void BotonVaciar(View view){
        operacion.setText("");
    }

    public void BotonUno(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"1");
    }

    public void BotonDos(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"2");
    }

    public void BotonTres(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"3");
    }

    public void BotonCuatro(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"4");
    }

    public void BotonCinco(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"5");
    }

    public void BotonSeis(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"6");
    }

    public void BotonSiete(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"7");
    }

    public void BotonOcho(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"8");
    }

    public void BotonNueve(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"9");
    }

    public void BotonCero(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"0");
    }

    public void BotonPunto(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+".");
    }

    public void BotonDiv(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"/");
    }

    public void BotonMulti(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"x");
    }

    public void BotonResta(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"-");
    }

    public void BotonSuma(View view){
        String data = operacion.getText().toString();
        operacion.setText(data+"+");
    }

    public void BotonPorciento(View view){
        String data = operacion.getText().toString();
        String[] cData = data.split("[x]");
        double res = (Double.parseDouble(cData[0])*Double.parseDouble(cData[1]))/100;
        operacion.setText(String.valueOf(res));
    }
}