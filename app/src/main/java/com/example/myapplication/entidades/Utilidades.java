package com.example.myapplication.entidades;

public class Utilidades {

    // Constantes de Personas
    public static final String TABLA_PERSONA = "persona", CAMPO_USUARIO = "usuario",CAMPO_ID = "id", CAMPO_NOMBRE = "nombre", CAMPO_CLAVE = "clave", CAMPO_APELLIDO = "apellido", CAMPO_EMAIL = "email", CAMPO_DIRECCION = "direccion", CAMPO_LOCALIDAD = "localidad",CAMPO_LATITUD = "latitud", CAMPO_LONGITUD = "longitud", CAMPO_ACTIVO = "activo";
    // TABLA Usuario
    public static final String CREAR_TABLA_USUARIO= "CREATE TABLE " +  TABLA_PERSONA+" ("+CAMPO_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_USUARIO+" TEXT, "+CAMPO_NOMBRE + " TEXT, "+
            CAMPO_APELLIDO + " TEXT, "+CAMPO_DIRECCION + " TEXT, "+ CAMPO_LOCALIDAD + " TEXT, "+ CAMPO_EMAIL + " TEXT, "+
            CAMPO_LATITUD +" INTEGER, "+ CAMPO_LONGITUD+ " INTEGER, "+ CAMPO_ACTIVO + " INTEGER";

    // Constantes de Tienda
    public static final String TABLA_TIENDA = "tienda";
    // TABLA TIENDA
    public static final String CREAR_TABLA_TIENDA = "CREATE TABLE "+TABLA_TIENDA +" ("+CAMPO_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_NOMBRE+" TEXT, "+CAMPO_LOCALIDAD+
            " TEXT, "+CAMPO_DIRECCION+" TEXT, "+CAMPO_LONGITUD+" INTEGER, "+ CAMPO_LATITUD+" INTEGER, "+CAMPO_ACTIVO+" INTEGER";

    // Constantes de Producto
    public static final String TABLA_PRODUCTO = "producto", CAMPO_STOCK = "stock", CAMPO_DESCRIPCION = "descripcion", CAMPO_IDTIENDA="id_tienda",CAMPO_PRECIO ="precio";
    // TABLA PRODUCTO
    public static final String CREAR_TABLA_PRODUCTO = "CREATE TABLE"+ TABLA_PRODUCTO+" ("+CAMPO_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_IDTIENDA+ " INTEGER, "+
            CAMPO_STOCK+ " INTEGER, "+CAMPO_PRECIO+ " FLOAT, "+CAMPO_NOMBRE+ " TEXT, "+CAMPO_DESCRIPCION+ " TEXT";
}
