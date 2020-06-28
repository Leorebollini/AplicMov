package com.example.myapplication.entidades;

public class Tienda {
    private Integer _id, latitud, longitud, activo;
    private String nombre, direccion, localidad;



    // private static final String crear_tabla_tienda = "CREATE TABLE tienda (_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, direccion TEXT, localidad TEXT, latitud INTEGER, longitud INTEGER, activo INTEGER)";

    public Tienda(Integer _id, Integer latitud, Integer longitud, Integer activo, String nombre, String direccion, String localidad) {
        this._id = _id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.activo = activo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public Integer getLatitud() {
        return latitud;
    }

    public void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

}
