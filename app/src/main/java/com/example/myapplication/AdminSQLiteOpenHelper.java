package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.myapplication.entidades.Utilidades;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    // Nombre de la db
    private static final String DB_NAME = "database.sqlite";
    // Version db
    private static final int DB_VERSION = 1;

    public AdminSQLiteOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override // Creo las tablas
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREAR_TABLA_USUARIO);
        db.execSQL(Utilidades.CREAR_TABLA_TIENDA);
        db.execSQL(Utilidades.CREAR_TABLA_PRODUCTO);
    }

    @Override // Chequeo las versión y actualizo las tablas
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
