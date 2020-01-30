package com.example.ejercicioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonstep;
    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Para el logo
        getSupportActionBar(). setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        // Elementos UI con sus referencias
        buttonstep = findViewById(R.id.button);
        editTextName = findViewById(R.id.editText);

        //Para pasar al siguiente activity
        buttonstep.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                if (!name.isEmpty()){
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Name", name);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"The name is Essential", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}