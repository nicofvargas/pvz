package com.test.pvz.entities;

public abstract class EntidadViva extends GameObject {
    protected int vidaActual, vidaMax;

    public EntidadViva(float x, float y, float ancho, float alto, int vida) {
        super(x, y, ancho, alto); //le paso lo necesario a la clase madre
        this.vidaMax=vida;
        this.vidaActual=vida;
    }

    public void recibirDamage(int damage) {
        this.vidaActual-=damage;
    }

    public boolean estaVivo() {
        return vidaActual > 0;
    }
}
