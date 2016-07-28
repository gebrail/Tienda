package com.faster_network.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Detallesfiador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallesfiador);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton pagar = (FloatingActionButton) findViewById(R.id.pagar_lo_fiado);
        FloatingActionButton abonar = (FloatingActionButton) findViewById(R.id.abonar);
        FloatingActionButton fiar = (FloatingActionButton) findViewById(R.id.fiar);

        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ipagar = new Intent(Detallesfiador.this, Cancelardeuda.class);
                startActivity(ipagar);
            }
        });
        fiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ifiar = new Intent(Detallesfiador.this, Fiar.class);
                startActivity(ifiar);
            }
        });
        abonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iabonar = new Intent(Detallesfiador.this, Abonar.class);
                startActivity(iabonar);
            }
        });
    }

}
