package com.faster_network.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.faster_network.tienda.FRAGMENTOS.FiadoresFragmento;
import com.faster_network.tienda.OPERACION.Constantes;

public class Fiadores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiadores);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Creación del fragmento
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.container, new FiadoresFragmento(),"FiadoresFragmento").commit();}
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Toast toast2xd = Toast.makeText(getApplicationContext(), "Llego aqui", Toast.LENGTH_SHORT);
        toast2xd.show();
        if (requestCode == Constantes.CODIGO_DETALLE || requestCode == 3) {
            if (resultCode == RESULT_OK || resultCode == 203) {
                FiadoresFragmento fiadoresFragmento = (FiadoresFragmento) getSupportFragmentManager().
                        findFragmentByTag("FiadoresFragmento");
                fiadoresFragmento.cargarAdaptador();
            }
        }
    }
}