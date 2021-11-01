package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_Toast, btn_Proxima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Toast = findViewById(R.id.Btn_Volta);
        btn_Proxima = findViewById(R.id.Btn_Proxima);

        btn_Toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Este é o botão 1", Toast.LENGTH_SHORT).show();

            }
        });

        btn_Proxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Volta.class);
                startActivity(intent);
            }
        });

    }

}