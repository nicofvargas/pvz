package com.test.pvz.factories.proyectiles;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.Proyectil;
import com.test.pvz.entities.proyectiles.Guisante;
import com.test.pvz.factories.ProyectilFactory;
import com.test.pvz.utils.GameData;

public class GuisanteFactory extends ProyectilFactory {
    @Override
    public Proyectil crearProyectil(float x, float y) {
        JsonValue stats = GameData.getProyectil("guisante");

        return new Guisante(x, y, stats);
    }
}
