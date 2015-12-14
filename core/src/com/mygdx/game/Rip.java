package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Rip extends Game {
    SpriteBatch batch;
    TextureAtlas taMegaman;
    Sprite[] spMegaman;
    int j, nSpeed = 0;
    Music Music;
    Sound Sound;
    public static final int WIDTH = 460;
    public static final int HEIGHT = 750;
    public static final String TITLE = "Dank Bird";

    @Override
    public void create() {
        //j = 0;
        //nSpeed = 0;
        Music = Gdx.audio.newMusic(Gdx.files.internal("ElginMusic.mp3")); // not the greatest naming
        Sound = Gdx.audio.newSound(Gdx.files.internal("Hitmarker.mp3"));
        Music.setLooping(true); // loops the mp3 file
        Music.play();
        Music.setVolume(1.0f); //controls how loud the music is
        setScreen(new gravtest(this));
        //batch = new SpriteBatch();
        //Create an array sprites loaded from the TextureAtlas
        //taMegaman = new TextureAtlas(Gdx.files.internal("Megaman.txt"));
        //spMegaman = new Sprite[4];
        //Loop through regions of the TextureAtlas and assign each to an index of the array
        //for (int i = 0; i < 4; i++) {
        //    this.spMegaman[i] = new Sprite(this.taMegaman.findRegion("frame_" + i));
        //}
    }

    @Override
    public void render() {
        super.render();
        /*Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//Draw sprites on to screen
		spMegaman[j].draw(batch);
		//nSpeed changes the time interval at which the sprites are drawn
		nSpeed++;
		if (nSpeed%8 == 0) {
			if (j == 3) { //Make sure index stays within the bounds the array
				j = 0;
			} else {
				j++;
			}
		}
		if(Gdx.input.justTouched()) //used for dectecting if the screen is clicked
			Sound.play();
		batch.end();*/
    }
}
//assistance from Don's code and teaching me how to do sprite arrays