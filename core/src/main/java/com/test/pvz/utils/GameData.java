package com.test.pvz.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

public class GameData {
    private static JsonValue plantas;
    private static JsonValue proyectiles;

    public static void cargarData() {
        JsonReader reader = new JsonReader();

        plantas = reader.parse(Gdx.files.internal("data/plants.json"));
        proyectiles = reader.parse(Gdx.files.internal("data/proyectiles.json"));
    }

    public static JsonValue getPlanta(String nombre) {
        return plantas.get(nombre);
    }

    public static JsonValue getProyectil(String nombre) {
        return proyectiles.get(nombre);
    }
}
