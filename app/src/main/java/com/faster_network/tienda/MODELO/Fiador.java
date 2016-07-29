package com.faster_network.tienda.MODELO;

/**
 * Created by Gebrail on 28/07/2016.
 */
public class Fiador {

    private String id_fiador;
    private String nombre_fiador;
    private String estado;

    public String getId_fiador() {
        return id_fiador;
    }

    public String getNombre_fiador() {
        return nombre_fiador;
    }

    public String getEstado() {
        return estado;
    }


    public Fiador(String id_fiador, String nombre_fiador, String estado) {
        this.id_fiador = id_fiador;
        this.nombre_fiador = nombre_fiador;
        this.estado = estado;
    }


}
