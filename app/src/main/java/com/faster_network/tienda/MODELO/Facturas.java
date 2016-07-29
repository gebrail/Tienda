package com.faster_network.tienda.MODELO;

/**
 * Created by Gebrail on 28/07/2016.
 */
public class Facturas {

    private String id_factura;

    public String getId_factura() {
        return id_factura;
    }

    public String getId_fiador() {
        return id_fiador;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public String getTotalpagado() {
        return totalpagado;
    }

    private String id_fiador;
    private String fecha_inicio;
    private String fecha_final;
    private String estado_pago;
    private String totalpagado;


    public Facturas(String id_factura, String id_fiador, String fecha_inicio, String fecha_final, String estado_pago, String totalpagado) {
        this.id_factura = id_factura;
        this.id_fiador = id_fiador;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.estado_pago = estado_pago;
        this.totalpagado = totalpagado;
    }


}
