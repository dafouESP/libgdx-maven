package com.yo;

//Proyecto base en maven de libgdx. Dafnis Rey

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;


public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private ExtendViewport viewport;
    private OrthographicCamera camara;
    private ShapeRenderer shape;

    @Override
    public void create() {
        batch = new SpriteBatch();
        //image = new Texture("worldmap.jpg");
        shape = new ShapeRenderer();
   

    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        shape.begin(ShapeType.Filled);
        shape.setColor(Color.CHARTREUSE);
        shape.circle(400, 300, 100);
        shape.end();


        batch.begin();        
        batch.end();

    }


    @Override
    public void dispose() {
        batch.dispose();
        shape.dispose();
    }
}
