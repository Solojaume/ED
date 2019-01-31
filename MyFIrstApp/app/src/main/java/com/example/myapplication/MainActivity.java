package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_MESSAGE="clave1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMesage(View view){
        EditText editText = findViewById(R.id.editText);
        String cadena = editText.getText().toString();
        String message = editText.getText().toString();
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        intent.putExtra(KEY_MESSAGE, message);
        startActivity(intent);
    }

}
