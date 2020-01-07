package com.example.mx.tesoem.isc.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class View_Activity extends AppCompatActivity {

    ArrayList<VariableGlobal> listadecolores;
    Button button7;
    Spinner spinnerview;


    ArrayAdapter<String> ColorD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_);

        button7 = (Button) findViewById(R.id.button7);
        spinnerview = findViewById(R.id.spinnerview);

        ColorD = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, VariableGlobal.colores());
        listadecolores = new ArrayList<VariableGlobal>();

        spinnerview.setAdapter(ColorD);
    }

    public void Menuprincipal(View view) {
        Intent Menuprincipal = new Intent(this, MainActivity.class);
        startActivity(Menuprincipal);
        Toast.makeText(getApplicationContext(), "Regresando al menu " , Toast.LENGTH_LONG).show();

    }
    public void iragregar(View view) {
        Intent iragregar = new Intent(this, Agregar_Activity.class);
        startActivity(iragregar);
        Toast.makeText(getApplicationContext(), "Regresando a Agregar" , Toast.LENGTH_LONG).show();

    }
}
