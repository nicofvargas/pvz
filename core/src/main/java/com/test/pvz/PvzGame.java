package com.test.pvz;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.test.pvz.core.EntitiesManager;
import com.test.pvz.entities.plantas.ataque.Lanzaguisantes;
import com.test.pvz.utils.GameData;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class PvzGame extends ApplicationAdapter {
    private Lanzaguisantes lanzaguisantes;
    private ShapeRenderer shape;
    private EntitiesManager manager;

    @Override
    public void create() {
        GameData.cargarData();
        shape = new ShapeRenderer();
        lanzaguisantes = new Lanzaguisantes(100, 100);
        manager = new EntitiesManager();
        manager.agregarPlanta(lanzaguisantes);
    }

    @Override
    public void render() {
        ScreenUtils.clear(0, 0, 0, 1);
        float delta = Gdx.graphics.getDeltaTime();
        manager.update(delta);

        shape.begin(ShapeRenderer.ShapeType.Line);
        shape.setColor(1, 0, 0, 1);
        manager.dibujarDebug(shape);
        shape.end();
    }

    @Override
    public void dispose() {
        shape.dispose();
    }
}
