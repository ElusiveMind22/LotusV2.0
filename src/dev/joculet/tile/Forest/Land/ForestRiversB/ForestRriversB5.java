package dev.joculet.tile.Forest.Land.ForestRiversB;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversB5 extends Tile {
    public ForestRriversB5(int id) {
        super(Assets.forestRiversB[4], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}