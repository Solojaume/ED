package com.example.asuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sumar(){
        EditText introNumero1 = findViewById(R.id.introNumero1);
        EditText introNumero2 = findViewById(R.id.introNumero2);
        TextView textView= findViewById(R.id.textView);


        String cadenaN1 = introNumero1.getText().toString();
        String cadenaN2 = introNumero1.getText().toString();
        Double n1 = Double.parseDouble(cadenaN1);
        Double n2 = Double.parseDouble(cadenaN2);
        double suma = n1+n2;
        textView.setText(suma);
    }
}
