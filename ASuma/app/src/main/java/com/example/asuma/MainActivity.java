package com.example.asuma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    BigDecimal result;
    EditText editText1;
    EditText editText2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Aqui se crea el contenido de la app despues de crear la vista
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);

    }

    public void sumar(View view){
        result= getDecimal1().add(getDecimal2());
        textView.setText(""+result);
        //textView.setText(String.valueOf(suma))
    }

    public void restar(View view){
       result = getDecimal1().subtract(getDecimal2());
        textView.setText(""+result);
//        Double n1 = Double.parseDouble(cadenaN1);
//        Double n2 = Double.parseDouble(cadenaN2);
//        double resta = n1-n2;
    }

    public void borrar(View view){
        textView.setText("");
        editText1.setText("");
        editText2.setText("");
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

    public void versionSimple(View view){
        Intent intent = new Intent(this,CalculadoraSimple.class);
        startActivity(intent);

    }

    private boolean isEmpty(){
        return editText1.getText().toString().trim().isEmpty();
    }



}
