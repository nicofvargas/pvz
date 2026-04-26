package com.test.pvz.interfaces;

public interface Lanzador {

    /**
     * Clase que implemente esta interfaz ademas de implementar debe crear el atributo.
     * ProyectilSpawner spawner;
     * @param spawner Es el encargado de conectar el EntitiesManager con la planta
     */
    void setSpawner(Spawner spawner);
}
