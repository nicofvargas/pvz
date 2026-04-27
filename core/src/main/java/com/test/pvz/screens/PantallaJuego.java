package com.test.pvz.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.test.pvz.PvzGame;
import com.test.pvz.logic.EntitiesManager;

public class PantallaJuego implements Screen {
    private final PvzGame game;
    private EntitiesManager manager;
    private OrthographicCamera camera;
    private Viewport viewport;
    private ShapeRenderer shapeRenderer;
    private SpriteBatch batch;

    public PantallaJuego(PvzGame game) {
        this.game = game;
        //motor logica y datos
        this.manager = new EntitiesManager();
        //camara y resolucion
        camera = new OrthographicCamera();
        viewport = new FitViewport(1280,720, camera);
        //render
        shapeRenderer = new ShapeRenderer();
        batch = new SpriteBatch();
    }




    ///////metodos de la interfaz Screen que trae libgdx
    /**
     * Called when this screen becomes the current screen for a {@link Game}.
     */
    @Override
    public void show() {

    }

    /**
     * Called when the screen should render itself.
     *
     * @param delta The time in seconds since the last render.
     */
    @Override
    public void render(float delta) {
        manager.dibujarDebug(shapeRenderer);
    }

    /**
     * @param width
     * @param height
     * @see ApplicationListener#resize(int, int)
     */
    @Override
    public void resize(int width, int height) {

    }

    /**
     * @see ApplicationListener#pause()
     */
    @Override
    public void pause() {

    }

    /**
     * @see ApplicationListener#resume()
     */
    @Override
    public void resume() {

    }

    /**
     * Called when this screen is no longer the current screen for a {@link Game}.
     */
    @Override
    public void hide() {

    }

    /**
     * Called when this screen should release all resources.
     */
    @Override
    public void dispose() {
        shapeRenderer.dispose();
        //batch.dispose();
    }
}
