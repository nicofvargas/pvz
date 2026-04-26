package com.test.pvz.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

public abstract class GameObject {
    protected float x, y;
    protected float ancho, alto;
    protected Texture image;
    protected Rectangle hitbox;

    /**
     * @param x Coordenada horizontal -> esquina inferior izquierda
     * @param y Coordenada vertical -> esquina inferior izquierda
     * @param ancho ancho en pixeles
     * @param alto alto en pixeles
     */
    public GameObject(float x, float y, float ancho, float alto) {
        this.x=x;
        this.y=y;
        this.ancho=ancho;
        this.alto=alto;

        this.hitbox = new Rectangle(x,y,ancho,alto);
    }

    /**
     * Comprueba si esta objeto colisiona con otro usando su .hitbox
     * @param object El otro objeto a comparar
     * @return - Retorna true si colisiona, false caso contrario
     */
    public boolean colisionaCon(GameObject object) {
        return this.hitbox.overlaps(object.hitbox);
    }

    //Notar que en dibujarDebug no pase las coordenadas sino la hitbox porque la hitbox quizas pueda ser mas chica que la imagen

    /**
     * Dibuja la imagen, usar solo cuando ya esten las imagenes.
     * Este metodo debe ser llamado obligatoriamente entre {@code batch.begin()} y {@code batch.end()}.
     * @param batch El {@link SpriteBatch} que gestiona el envío de texturas a la placa de video.
     */
    public void dibujar(SpriteBatch batch) {
        if(this.image!=null) {
            batch.draw(image, x, y, ancho, alto);
        }
    }

    /**
     * Dibuja la hitbox, usar mientras se desarrolla para testeo
     * @param shape El {@link ShapeRenderer} utilizado para dibujar formas.
     */
    public void dibujarDebug(ShapeRenderer shape) {
        shape.rect(hitbox.x, hitbox.y, hitbox.width, hitbox.height);
    }

}
