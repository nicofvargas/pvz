package com.test.pvz.entities.proyectiles;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.Proyectil;
import com.test.pvz.utils.GameData;

public class Guisante extends Proyectil {

    public Guisante(float x, float y, JsonValue stats) {
        super(
            x,
            y,
            stats.getFloat("ancho"),
            stats.getFloat("alto"),
            stats.getFloat("velocidad"),
            stats.getInt("damage")
        );
    }
}
