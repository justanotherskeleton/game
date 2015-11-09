package com.nsg.object;

import com.badlogic.gdx.graphics.Texture;

public class Tile {
	
	private String name;
	private int id;
	private Texture img;
	
	public static Tile OCEAN = new Tile("Ocean", 0, null /* TODO add ocean texture */);
	
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
