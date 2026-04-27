package com.test.pvz.interfaces;

import com.test.pvz.factories.ProyectilFactory;

public interface Lanzador {

    /**
     * Clase que implemente esta interfaz ademas de implementar debe crear el atributo.
     * Spawner spawner;
     * @param spawner Se carga al atributo Spawner
     */
    void setSpawner(Spawner spawner);

    /**
     * clase que implementa esta interfaz debe agregar el atributo ProyectilFactory
     * @param proyectil se carga al atributo ProyectilFactory
     */
    void setProyectilFactory(ProyectilFactory proyectil);
}
