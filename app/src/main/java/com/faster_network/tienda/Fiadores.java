package com.faster_network.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Fiadores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton agregarfiador = (FloatingActionButton) findViewById(R.id.fab);
        agregarfiador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent agregar = new Intent(Fiadores.this, AgregarFiador.class);
                startActivity(agregar);
            }
        });
    }

}
