package com.test.pvz.entities.plantas.ataque;

import com.badlogic.gdx.utils.JsonValue;
import com.test.pvz.entities.EntidadViva;
import com.test.pvz.entities.Planta;
import com.test.pvz.interfaces.Ataque;
import com.test.pvz.utils.GameData;

public class Lanzaguisantes extends Planta implements Ataque {
    private float acumuladorTiempo=0;
    private float cooldownAtaque;

    //aca en el constructor publico hago uso de uno privado para poder pasarle los datos del json correctamente
    //sino da error porque el super debe estar siempre en primera linea y no podia obtener los datos del json
    public Lanzaguisantes(float x, float y) {
        this(x,y, GameData.getPlanta("lanzaguisantes"));
    }

    private Lanzaguisantes(float x, float y, JsonValue stats) {
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

    }

    @Override
    public void atacar(EntidadViva entidad) {

    }
}
