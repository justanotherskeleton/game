package com.nsg.src;

import java.util.LinkedList;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.World;

public class GObject {
	
	private LinkedList<Body> bodies; 
	
	public GObject(int id, World world, float x, float y, float z, float width, float height) {
		
		bodies = new LinkedList<Body>();
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyType.DynamicBody;
		bodyDef.position.set(x, y);
		
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(width / 2,  height / 2);
		
		FixtureDef fixDef = new FixtureDef();
		fixDef.shape = shape;
		fixDef.density = (float) Math.pow(width, height);
		fixDef.restitution = .1f;
		fixDef.friction = .5f;
		
		//update this
		Body TEST = world.createBody(bodyDef);
		TEST.createFixture(fixDef);
		
	}

}
