package com.nsg.src;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

public class GameRender implements Screen {

	private SpriteBatch batch;
	private World world;
	private Box2DDebugRenderer debugRenderer;
	private OrthographicCamera camera;
	private float timestep = 1 / 60f;
	
	@Override
	public void show() {
		world = new World(new Vector2(), true);
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		debugRenderer = new Box2DDebugRenderer();
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		debugRenderer.render(world, camera.combined);
	}

	@Override
	public void resize(int width, int height) {
		camera.viewportWidth = width / 25;
		camera.viewportHeight = height / 25;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		debugRenderer.dispose();
	}

}
