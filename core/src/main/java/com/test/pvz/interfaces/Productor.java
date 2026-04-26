package com.test.pvz.interfaces;

public interface Productor {
    /**
     * Agregar atributo Spawner a clase que implemente esta interfaz
     * @param spawner
     */
    void setSpawner(Spawner spawner);

    /**
     * logica de produccion de X material, se llama cada X tiempo
     */
    void productir();
}
