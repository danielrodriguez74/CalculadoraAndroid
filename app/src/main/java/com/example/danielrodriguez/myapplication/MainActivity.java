package com.example.danielrodriguez.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    boolean decimal = false;
    /*boolean suma = false;
    boolean resta = false;
    boolean mul = false;
    boolean div = false;
    Double[] numero = new Double[20];
    Double dato;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button num0 = (Button)findViewById(R.id.button0);
        num0.setOnClickListener(this);

        Button num1 = (Button)findViewById(R.id.button1);
        num1.setOnClickListener(this);

        Button num2 = (Button)findViewById(R.id.button2);
        num2.setOnClickListener(this);

        Button num3 = (Button)findViewById(R.id.button3);
        num3.setOnClickListener(this);

        Button num4 = (Button)findViewById(R.id.button4);
        num4.setOnClickListener(this);

        Button num5 = (Button)findViewById(R.id.button5);
        num5.setOnClickListener(this);

        Button num6 = (Button)findViewById(R.id.button6);
        num6.setOnClickListener(this);

        Button num7 = (Button)findViewById(R.id.button7);
        num7.setOnClickListener(this);

        Button num8 = (Button)findViewById(R.id.button8);
        num8.setOnClickListener(this);

        Button num9 = (Button)findViewById(R.id.button9);
        num9.setOnClickListener(this);

        Button bPunto = (Button)findViewById(R.id.btnPunto);
        bPunto.setOnClickListener(this);

        Button bBorrar = (Button)findViewById(R.id.btnBorrar);
        bBorrar.setOnClickListener(this);

        Button bSumar = (Button)findViewById(R.id.btnSuma);
        bSumar.setOnClickListener(this);

        Button bRestar = (Button)findViewById(R.id.btnResta);
        bRestar.setOnClickListener(this);

        Button bMult = (Button)findViewById(R.id.btnMult);
        bMult.setOnClickListener(this);

        Button bDiv = (Button)findViewById(R.id.btnDiv);
        bDiv.setOnClickListener(this);

        Button bIgual = (Button)findViewById(R.id.btnIgual);
        bIgual.setOnClickListener(this);

        Button bAcercaDe = (Button) findViewById(R.id.btnAcercaDe);
        bAcercaDe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                {
                    Intent intent = new Intent(v.getContext(), ActivityAcercaDe.class);
                    startActivityForResult(intent, 0);
                }
            }
        });

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Button sen = (Button) findViewById(R.id.buttonSen);
            sen.setOnClickListener(this);

            Button cos = (Button) findViewById(R.id.buttonCos);
            cos.setOnClickListener(this);

            Button tan = (Button) findViewById(R.id.buttonTan);
            tan.setOnClickListener(this);

            Button ln = (Button) findViewById(R.id.buttonLn);
            ln.setOnClickListener(this);

            Button log = (Button) findViewById(R.id.buttonLog);
            log.setOnClickListener(this);

            Button raiz = (Button) findViewById(R.id.buttonRaiz);
            raiz.setOnClickListener(this);

            Button exp = (Button) findViewById(R.id.buttonExp);
            exp.setOnClickListener(this);

            Button parIz = (Button) findViewById(R.id.buttonParentIzq);
            parIz.setOnClickListener(this);

            Button parDr = (Button) findViewById(R.id.buttonParentDer);
            parDr.setOnClickListener(this);

            Button varX = (Button) findViewById(R.id.buttonVarX);
            varX.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        TextView screen = (TextView)findViewById(R.id.textView);
        int selector = v.getId();
        String x = screen.getText().toString();
        try{
            switch (selector){
                case R.id.button0:
                    screen.setText(x+"0");
                    break;
                case R.id.button1:
                    screen.setText(x+"1");
                    break;
                case R.id.button2:
                    screen.setText(x+"2");
                    break;
                case R.id.button3:
                    screen.setText(x+"3");
                    break;
                case R.id.button4:
                    screen.setText(x+"4");
                    break;
                case R.id.button5:
                    screen.setText(x+"5");
                    break;
                case R.id.button6:
                    screen.setText(x+"6");
                    break;
                case R.id.button7:
                    screen.setText(x+"7");
                    break;
                case R.id.button8:
                    screen.setText(x+"8");
                    break;
                case R.id.button9:
                    screen.setText(x+"9");
                    break;
                case R.id.buttonSen:
                    screen.setText(x+"Sen(");
                    break;
                case R.id.buttonCos:
                    screen.setText(x+"Cos(");
                    break;
                case R.id.buttonTan:
                    screen.setText(x+"Tan(");
                    break;
                case R.id.buttonLn:
                    screen.setText(x+"Ln(");
                    break;
                case R.id.buttonLog:
                    screen.setText(x+"Log(");
                    break;
                case R.id.buttonRaiz:
                    screen.setText(x+"√");
                    break;
                case R.id.buttonExp:
                    screen.setText(x+"^(");
                    break;
                case R.id.buttonParentIzq:
                    screen.setText(x+"(");
                    break;
                case R.id.buttonParentDer:
                    screen.setText(x+")");
                    break;
                case R.id.buttonVarX:
                    screen.setText(x+"X");
                    break;
                case R.id.btnPunto:
                    if(decimal==false)
                    {
                        screen.setText(x+".");
                        decimal = true;
                    }
                    else
                    {
                        return;
                    }
                    break;
                case R.id.btnBorrar:
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.btnSuma:
                    //suma = true;
                    //numero[0] = Double.parseDouble(x);
                    decimal = false;
                    screen.setText(x+"+");
                    break;
                case R.id.btnResta:
                    //resta = true;
                    //numero[0] = Double.parseDouble(x);
                    decimal = false;
                    screen.setText(x+"-");
                    break;
                case R.id.btnMult:
                    //mul = true;
                    //numero[0] = Double.parseDouble(x);
                    decimal = false;
                    screen.setText(x+"*");
                    break;
                case R.id.btnDiv:
                    //div = true;
                    //numero[0] = Double.parseDouble(x);
                    decimal = false;
                    screen.setText(x+"/");
                    break;
                case R.id.btnIgual:
                    /*numero[1] = Double.parseDouble(x);
                    if(suma)
                    {
                        dato = numero[0] + numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    else if(resta)
                    {
                        dato = numero[0] - numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    else if(mul)
                    {
                        dato = numero[0] * numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    else if(div)
                    {
                        dato = numero[0] / numero[1];
                        screen.setText(String.valueOf(dato));
                    }*/
                    screen.setText(x+"=");
                    decimal = false;
                    /*suma = false;
                    resta = false;
                    mul = false;
                    div = false;*/
                    break;
            }
        }catch (Exception e){
            screen.setText("error");
        }
    }
}
