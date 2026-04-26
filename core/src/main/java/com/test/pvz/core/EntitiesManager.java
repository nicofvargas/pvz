package com.test.pvz.core;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Array;
import com.test.pvz.entities.Planta;
import com.test.pvz.entities.Proyectil;
import com.test.pvz.interfaces.Lanzador;
import com.test.pvz.interfaces.Spawner;

public class EntitiesManager implements Spawner {
    private Array<Planta> plantas;
    private Array<Proyectil> proyectiles;

    public EntitiesManager() {
        this.plantas = new Array<>();
        this.proyectiles = new Array<>();

        System.out.println("Entities manager iniciado"); //debug
    }

    public void update(float delta) {

        for(Planta planta : plantas) {
            planta.actuar(delta);
        }

        for(Proyectil proyectil : proyectiles) {
            proyectil.actuar(delta);
        }

    }

    //dibuja la imagen por ahora no se usa no tenemos assets
    public void dibujar(SpriteBatch batch) {
        for (Planta planta : plantas) {
            planta.dibujar(batch);
        }

        for (Proyectil proyectil : proyectiles) {
            proyectil.dibujar(batch);
        }
    }

    public void dibujarDebug(ShapeRenderer shape) {
        for (Planta planta : plantas) {
            planta.dibujarDebug(shape);
        }

        for (Proyectil proyectil : proyectiles) {
            proyectil.dibujarDebug(shape);
        }
    }

    @Override
    public void agregarProyectil(Proyectil p) {
        this.proyectiles.add(p);
        System.out.println("Proyectil agregado: " + p); //debug
    }

    public void agregarPlanta(Planta p) {
        if (p instanceof Lanzador) {
            ((Lanzador) p).setSpawner(this);
        }

        plantas.add(p);
    }
}
