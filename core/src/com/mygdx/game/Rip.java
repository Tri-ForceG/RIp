package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Rip extends Game {
    Music Music;
    Sound Sound;

    @Override
    public void create() {

        Music = Gdx.audio.newMusic(Gdx.files.internal("ElginMusic.mp3")); // not the greatest naming
        Sound = Gdx.audio.newSound(Gdx.files.internal("Hitmarker.mp3"));
        Music.setLooping(true); // loops the mp3 file
        Music.play();
        Music.setVolume(1.0f); //controls how loud the music is
        setScreen(new gravtest(this));

    }

    @Override
    public void render() {
        super.render();

    }
}
