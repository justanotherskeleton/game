package com.nsg.src;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

import com.nsg.object.Coord;
import com.nsg.object.Tile;

public class Area {
	
	public ConcurrentHashMap<Coord, Tile> worldMap = new ConcurrentHashMap<Coord, Tile>();
	
	public Area(Coord[] c1, Tile[] t1) {
		//TODO is this needed?
	}
	
	public Area(LinkedList<Coord> c1, LinkedList<Tile> t1) {
		
	}
	
}
