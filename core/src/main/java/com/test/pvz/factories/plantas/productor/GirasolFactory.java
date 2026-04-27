package com.test.pvz.factories.plantas.productor;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.Planta;
import com.test.pvz.entities.plantas.productor.Girasol;
import com.test.pvz.factories.PlantaFactory;
import com.test.pvz.interfaces.Spawner;
import com.test.pvz.utils.GameData;

public class GirasolFactory extends PlantaFactory {
    private Spawner spawner;

    public GirasolFactory(Spawner spawner) {
        this.spawner=spawner;
    }
    @Override
    public Planta crearPlanta(float x, float y) {
        JsonValue stats = GameData.getPlanta("girasol");

        Girasol girasol = new Girasol(x,y,stats);
        girasol.setSpawner(spawner);

        return girasol;
    }
}
