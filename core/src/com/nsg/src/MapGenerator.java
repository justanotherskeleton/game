package com.nsg.src;

public class MapGenerator {
	
	/* Avoid TiledMap 
	 * 
	 * ConcurrentHashMap<Coord, MapTile> dungeonMap = dungeonGen.getMap();
        for(Entry<Coord, MapTile> entry : dungeonMap.entrySet()){
            Coord coord = entry.getKey();
            MapTile tile = entry.getValue();

            if((inCameraFrustum(coord.getX() * tileSize, coord.getY() * tileSize, 100))){
                game.batch.draw(dungeonGen.getTileTexture(tile),
                        coord.getX() * tileSize, coord.getY() * tileSize);
            }

        }
        end example (from stackoverflow)
	 */
	
	

}
