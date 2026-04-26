package com.test.pvz.entities;

import com.test.pvz.interfaces.Actualizable;

public abstract class Planta extends EntidadViva implements Actualizable {
    protected int costoSoles;

    public Planta(float x, float y, float ancho, float alto, int vida, int costoSoles) {
        super(x, y, ancho, alto, vida);
        this.costoSoles=costoSoles;
    }
}

