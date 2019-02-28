package com.example.asuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraSimple extends AppCompatActivity {
    Double result;
    TextView textView;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_simple);

        editText1 = findViewById(R.id.editText1);
        textView = findViewById(R.id.textView);
        result=0.00;
    }
    public void sumarS(View view){
        result= result+getDoubleT();
        textView.setText(String.format("%.2f",result));
        editText1.setText("");
        //textView.setText(String.valueOf(suma))
    }
    public void restarS(View view){
        result= result-getDoubleT();
        textView.setText(String.format("%.3f",result));
        editText1.setText("");
        //textView.setText(String.valueOf(suma))
    }

    private double getDoubleT(){
        String cadenaN1 = editText1.getText().toString();
        double d1= Double.parseDouble(cadenaN1);
        return d1;
    }

    private double getDoubleR(){
        String cadenaN1 = textView.getText().toString();
        double d1= Double.parseDouble(cadenaN1);
        return d1;
    }
}
