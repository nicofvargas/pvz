package com.test.pvz.entities.plantas.productor;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.Planta;
import com.test.pvz.interfaces.Productor;
import com.test.pvz.interfaces.Spawner;

public class Girasol extends Planta implements Productor {
    private Spawner spawner;
    private float cooldown;
    private float acumuladorTiempo = 0;
    public Girasol(float x, float y, JsonValue stats) {
        super(x,
            y,
            stats.getFloat("ancho"),
            stats.getFloat("alto"),
            stats.getInt("vida"),
            stats.getInt("costo")
        );

        this.cooldown=stats.getFloat("cooldown");
    }

    @Override
    public void actuar(float delta) {
        this.acumuladorTiempo+=delta;

        if(this.acumuladorTiempo>=this.cooldown) {
            this.productir();
            this.acumuladorTiempo-=this.cooldown;
        }
    }

    /**
     * Agregar atributo Spawner a clase que implemente esta interfaz
     *
     * @param spawner
     */
    @Override
    public void setSpawner(Spawner spawner) {
        this.spawner=spawner;
    }

    /**
     * logica de produccion de X material, se llama cada X tiempo
     */
    @Override
    public void productir() {
        if(spawner!=null) {
            spawner.agregarEntidad(new Sol(this.x,this.y));
            System.out.println("Produciendo sol"); //debug
        }

    }
}
