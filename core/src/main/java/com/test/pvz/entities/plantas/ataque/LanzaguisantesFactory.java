package com.test.pvz.entities.plantas.ataque;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.Planta;
import com.test.pvz.entities.PlantaFactory;
import com.test.pvz.interfaces.Spawner;
import com.test.pvz.utils.GameData;

public class LanzaguisantesFactory extends PlantaFactory {
    private Spawner spawner;

    public LanzaguisantesFactory(Spawner spawner) {
        this.spawner=spawner;
    }

    @Override
    public Planta crearPlanta(float x, float y) {
        JsonValue stats = GameData.getPlanta("lanzaguisantes");

        Lanzaguisantes lanzaguisantes = new Lanzaguisantes(x, y, stats);
        lanzaguisantes.setSpawner(spawner);

        return lanzaguisantes;
    }
}
