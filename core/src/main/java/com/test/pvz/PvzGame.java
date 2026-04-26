package com.test.pvz;

import com.badlogic.gdx.Game;
import com.test.pvz.screens.PantallaJuego;
import com.test.pvz.utils.GameData;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class PvzGame extends Game {



    /**
     * Called when the {@link Application} is first created.
     */
    @Override
    public void create() {
        GameData.cargarData();
        this.setScreen(new PantallaJuego(this));
    }
}
