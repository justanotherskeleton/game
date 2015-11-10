package com.nsg.object;

import com.badlogic.gdx.graphics.Texture;

public class Tile {
	
	private String name;
	private int id;
	private Texture img;
	
	//TODO add textures
	public static Tile OCEAN = new Tile("Ocean", 0, null);
	public static Tile SEA = new Tile("Sea", 1, null);
	public static Tile SHORE = new Tile("Island Shore", 2, null);
	public static Tile ISLAND = new Tile("Land", 3, null);
	
	public Tile(String name, int id, Texture img) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Texture getImg() {
		return img;
	}

	public void setImg(Texture img) {
		this.img = img;
	}

}
