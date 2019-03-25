package com.example.apostdelayed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button.setOnClickListener(v -> {

        });

        button.setOnClickListener(this :: onButtonClick);
    }


    public void onButtonClick(View view){
        Log.i(MainActivity.class.getSimpleName(), "Ejecutando onButtonClick");
        button.setText("Hola soy el bola");
//        button.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                button.setText("");
//            }
//        },3500);

        button.postDelayed(()->button.setText(""), 3500);

//        button.postDelayed(this::kkita, 3500);

    }

    private void kkita(){
        button.setText("");
    }
}
