package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Volta extends AppCompatActivity {

    Button btn_volta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volta);

        btn_volta = findViewById(R.id.Btn_Volta);

        btn_volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Volta.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}