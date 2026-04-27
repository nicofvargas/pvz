package com.test.pvz.entities.plantas.ataque;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.EntidadViva;
import com.test.pvz.entities.Planta;
import com.test.pvz.entities.Proyectil;
import com.test.pvz.factories.ProyectilFactory;
import com.test.pvz.interfaces.Atacante;
import com.test.pvz.interfaces.Lanzador;
import com.test.pvz.interfaces.Spawner;

public class Lanzaguisantes extends Planta implements Atacante, Lanzador {
    private float acumuladorTiempo=0;
    private float cooldownAtaque;
    private Spawner spawner;
    private ProyectilFactory proyectil;

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
            Proyectil p = proyectil.crearProyectil(this.x, this.y);
            spawner.agregarEntidad(p);
            System.out.println("Disparando guisante"); //debug
        }
    }

    @Override
    public void setSpawner(Spawner spawner) {
        this.spawner=spawner;
    }

    /**
     * clase que implementa esta interfaz debe agregar el atributo ProyectilFactory
     *
     * @param proyectil se carga al atributo ProyectilFactory
     */
    @Override
    public void setProyectilFactory(ProyectilFactory proyectil) {
        this.proyectil=proyectil;
    }
}
