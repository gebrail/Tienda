package com.faster_network.tienda;

/**
 * Created by undercoder on 8/07/2016.
 */
public class Producto {


    private String id_producto;

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    private String nombre_producto;
    private String descripcion_producto;
    private String imagen;
    private String precio;
    private String id_categoria;

    public Producto(String id_producto, String nombre_producto, String descripcion_producto, String imagen, String precio, String id_categoria) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.imagen = imagen;
        this.precio = precio;
        this.id_categoria = id_categoria;
    }


}
