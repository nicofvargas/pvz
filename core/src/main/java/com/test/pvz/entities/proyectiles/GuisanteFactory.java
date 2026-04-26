package com.test.pvz.entities.proyectiles;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.Proyectil;
import com.test.pvz.entities.ProyectilFactory;
import com.test.pvz.utils.GameData;

public class GuisanteFactory extends ProyectilFactory {
    @Override
    public Proyectil crearProyectil(float x, float y) {
        JsonValue stats = GameData.getProyectil("guisante");

        Guisante guisante = new Guisante(x, y, stats);
        return guisante;
    }
}
