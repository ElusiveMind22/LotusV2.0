package dev.joculet.tile.Forest.Land.ForestRiversB;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversB6 extends Tile {
    public ForestRriversB6(int id) {
        super(Assets.forestRiversB[5], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}