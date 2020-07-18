package dev.joculet.tile.Forest.Land.ForestRiversB;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversB3 extends Tile {
    public ForestRriversB3(int id) {
        super(Assets.forestRiversB[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}