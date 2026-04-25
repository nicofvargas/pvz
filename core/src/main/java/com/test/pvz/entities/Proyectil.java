package com.test.pvz.entities;

public abstract class Proyectil extends GameObject {
    protected float velocidad;
    protected int damage;

    public Proyectil(float x, float y, float ancho, float alto, float velocidad, int damage) {
        super(x, y, ancho, alto);

        this.velocidad=velocidad;
        this.damage=damage;
    }

    @Override
    public void actuar(float delta) {
        this.x+= velocidad * delta;
        this.hitbox.setX(this.x);
    }
}
