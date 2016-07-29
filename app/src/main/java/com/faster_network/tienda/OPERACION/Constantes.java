package com.faster_network.tienda.OPERACION;

/**
 * Created by Gebrail on 27/07/2016.
 */

/**
 * Clase que contiene los códigos usados en para
 * mantener la integridad en las interacciones entre actividades
 * y fragmentos
 */

public class Constantes {

    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;

    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "63343";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "faster-network.com";
    /**
     * URLs del Web Service
     */
    public static final String GET = IP + "/I%20Wish/obtener_metas.php";
    public static final String GET_BY_ID = IP + "/I%20Wish/obtener_meta_por_id.php";
    public static final String UPDATE = IP + "/I%20Wish/actualizar_meta.php";
    public static final String DELETE = IP + "/I%20Wish/borrar_meta.php";
    public static final String INSERT = IP + "/I%20Wish/insertar_meta.php";

    /**
     * URLs del Web Service ABONOS
     */
    public static final String AGET = "http://" + IP + "/tienda_web/abonos/obtener_abonos.php";
    public static final String AGET_BY_ID = "http://" + IP + "/tienda_web/abonos/obtener_abono_por_id.php";
    public static final String AUPDATE = "http://" + IP + "/tienda_web/abonos/actualizar_abono.php";
    public static final String ADELETE = "http://" + IP + "/tienda_web/abonos/borrar_abono.php";
    public static final String AINSERT = "http://" + IP + "/tienda_web/abonos/insertar_abono.php";
    /**
     * URLs del Web Service FIADOR
     */

    public static final String FGET = "http://" + IP + "/tienda_web/fiador/obtener_fiadores.php";
    public static final String FGET_BY_ID = "http://" + IP + "/tienda_web/fiador/obtener_fiador_por_id.php";
    public static final String FUPDATE = "http://" + IP + "/tienda_web/fiador/actualizar_fiador.php";
    public static final String FDELETE = "http://" + IP + "/tienda_web/fiador/borrar_fiador.php";
    public static final String FINSERT = "http://" + IP + "/tienda_web/fiador/insertar_fiador.php";


    /**
     * URLs del Web Service FACTURAS
     */
    public static final String FAGET = "http://" + IP + "/tienda_web/facturas/obtener_facturas.php";
    public static final String FAGET_BY_ID = "http://" + IP + "/tienda_web/facturas/obtener_factura_por_id.php";
    public static final String FAUPDATE = "http://" + IP + "/tienda_web/facturas/actualizar_factura.php";
    public static final String FADELETE = "http://" + IP + "/tienda_web/facturas/borrar_factura.php";
    public static final String FAINSERT = "http://" + IP + "/tienda_web/facturas/insertar_factura.php";


    /**
     * URLs del Web Service FIADOS
     */
    public static final String FIGET = "http://" + IP + "/tienda_web/fiados/obtener_fiados.php";
    public static final String FIGET_BY_ID = "http://" + IP + "/tienda_web/fiados/obtener_fiado_por_id.php";
    public static final String FIUPDATE = "http://" + IP + "/tienda_web/fiados/actualizar_fiado.php";
    public static final String FIDELETE = "http://" + IP + "/tienda_web/fiados/borrar_fiado.php";
    public static final String FIINSERT = "http://" + IP + "/tienda_web/fiados/insertar_fiado.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}
