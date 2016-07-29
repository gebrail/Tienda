package com.faster_network.tienda.MODELO;

/**
 * Created by Gebrail on 28/07/2016.
 */
public class Fiados {

    private String id_fiados;
    private String id_factura;
    private String fiado;
    private String fecha;

    public Fiados(String id_fiados, String id_factura, String fiado, String fecha) {
        this.id_fiados = id_fiados;
        this.id_factura = id_factura;
        this.fiado = fiado;
        this.fecha = fecha;
    }


    public String getId_fiados() {
        return id_fiados;
    }

    public String getId_factura() {
        return id_factura;
    }

    public String getFiado() {
        return fiado;
    }

    public String getFecha() {
        return fecha;
    }


    /**
     * Compara los atributos de dos Fiados
     *
     * @param fiado Fiado externa
     * @return true si son iguales, false si hay cambios
     */

    public boolean compararCon(Fiados fiados) {
        return
                this.id_factura.compareTo(fiados.id_factura) == 0 &&
                        this.fiado.compareTo(fiados.fiado) == 0 &&
                        this.fecha.compareTo(fiados.fecha) == 0;
    }


}
