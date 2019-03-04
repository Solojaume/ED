package com.example.asuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

public class CalculadoraComplej extends AppCompatActivity {

    ToggleButton toggle;
    BigDecimal result;
    EditText editText1;
    EditText editText2;
    TextView textView;
    Button buttonIgual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_complej);


        //Aqui se crea el contenido de la app despues de crear la vista
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
        buttonIgual = findViewById(R.id.button6);
        buttonIgual.setVisibility(View.INVISIBLE);
        toggle = (ToggleButton) findViewById(R.id.toggleButton);
        //Si no se pone aquí no funciona
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    buttonIgual.setVisibility(View.VISIBLE);
                    editText2.setEnabled(false);

                } else {
                    // The toggle is disabled
                    buttonIgual.setVisibility(View.INVISIBLE);
                    editText2.setEnabled(true);

                }
            }
        });


    }


    public void sumar(View view){
        if (toggle.isChecked()){
            result= result.add(getDecimal1()) ;
        }
        else
            result= getDecimal1().add(getDecimal2());
        textView.setText(""+result);
        //textView.setText(String.valueOf(suma))
    }

    public void restar(View view){
        if (toggle.isChecked()){
            result= result.subtract(getDecimal1()) ;
        }
        else {
            result = getDecimal1().subtract(getDecimal2());
        }
        textView.setText(""+result);
//        Double n1 = Double.parseDouble(cadenaN1);
//        Double n2 = Double.parseDouble(cadenaN2);
//        double resta = n1-n2;
    }

    public void borrar(View view){
        textView.setText("0");
        editText1.setText("0");
        editText2.setText("0");
    }

    //Obtiener los numeros

    private BigDecimal getDecimal1(){
        String cadenaN1 = editText1.getText().toString();
        return new BigDecimal(cadenaN1);
    }

    private BigDecimal getDecimal2(){
        String cadenaN2 = editText2.getText().toString();
        return new BigDecimal(cadenaN2);
    }

    private boolean isEmpty(){
        return editText1.getText().toString().trim().isEmpty();
    }
}
