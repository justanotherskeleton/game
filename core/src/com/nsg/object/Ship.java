package com.nsg.object;

import java.util.HashMap;

import com.badlogic.gdx.physics.box2d.World;
import com.nsg.src.GObject;

public class Ship extends GObject {
	
	public Ship(int id, World world, float x, float y, float z, float width, float height) {
		super(id, world, x, y, z, width, height);
	}

	//ShipPart to location on ship relative to center
	public HashMap<ShipPart, int[]> body = new HashMap<ShipPart, int[]>();

}
