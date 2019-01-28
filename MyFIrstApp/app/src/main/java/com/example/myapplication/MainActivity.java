package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMesage(View view){
        EditText editText = findViewById(R.id.editText);
        String cadena = editText.getText().toString();

        Intent intent = new Intent(this,DisplayMessageActivity.class);
        startActivity(intent);
    }
    public static String  message;
}
