package com.test.pvz.entities.plantas.ataque;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.EntidadViva;
import com.test.pvz.entities.Planta;
import com.test.pvz.entities.proyectiles.Guisante;
import com.test.pvz.interfaces.Atacante;
import com.test.pvz.interfaces.Lanzador;
import com.test.pvz.interfaces.Spawner;

public class Lanzaguisantes extends Planta implements Atacante, Lanzador {
    private float acumuladorTiempo=0;
    private float cooldownAtaque;
    private Spawner spawner;

    public Lanzaguisantes(float x, float y, JsonValue stats) {
        super(
            x,
            y,
            stats.getFloat("ancho"),
            stats.getFloat("alto"),
            stats.getInt("vida"),
            stats.getInt("costo")
        );

        this.cooldownAtaque = stats.getFloat("cooldownAtaque");
    }

    @Override
    public void actuar(float delta) {
        this.acumuladorTiempo+=delta;

        if(this.acumuladorTiempo>=this.cooldownAtaque) {
            this.atacar(null);
            this.acumuladorTiempo-=this.cooldownAtaque;
        }
    }

    @Override
    public void atacar(EntidadViva entidad) {
        if (spawner!=null) {
            spawner.agregarEntidad(new Guisante(this.x,this.y));
            System.out.println("Disparando guisante"); //debug
        }
    }

    @Override
    public void setSpawner(Spawner spawner) {
        this.spawner=spawner;
    }
}
