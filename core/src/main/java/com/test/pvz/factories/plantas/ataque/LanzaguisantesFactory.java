package com.test.pvz.factories.plantas.ataque;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.Planta;
import com.test.pvz.entities.plantas.ataque.Lanzaguisantes;
import com.test.pvz.factories.PlantaFactory;
import com.test.pvz.factories.ProyectilFactory;
import com.test.pvz.factories.proyectiles.GuisanteFactory;
import com.test.pvz.interfaces.Spawner;
import com.test.pvz.utils.GameData;

public class LanzaguisantesFactory extends PlantaFactory {
    private Spawner spawner;
    private ProyectilFactory guisanteFactory;

    public LanzaguisantesFactory(Spawner spawner) {
        this.spawner=spawner;
        this.guisanteFactory = new GuisanteFactory();
    }

    @Override
    public Planta crearPlanta(float x, float y) {
        JsonValue stats = GameData.getPlanta("lanzaguisantes");

        Lanzaguisantes lanzaguisantes = new Lanzaguisantes(x, y, stats);
        lanzaguisantes.setSpawner(spawner);
        lanzaguisantes.setProyectilFactory(guisanteFactory);

        return lanzaguisantes;
    }
}
