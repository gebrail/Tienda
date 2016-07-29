package com.faster_network.tienda.MODELO;

/**
 * Created by Gebrail on 28/07/2016.
 */
public class Abonos {


    private String id_abono;
    private String id_factura;
    private String abono;
    private String fecha;


    public String getId_abono() {
        return id_abono;
    }

    public String getId_factura() {
        return id_factura;
    }

    public String getAbono() {
        return abono;
    }

    public String getFecha() {
        return fecha;
    }


    public Abonos(String id_abono, String id_factura, String abono, String fecha) {
        this.id_abono = id_abono;
        this.id_factura = id_factura;
        this.abono = abono;
        this.fecha = fecha;
    }


}
