package dev.joculet.tile.Forest.Land.ForestRiversB;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversB2 extends Tile {
    public ForestRriversB2(int id) {
        super(Assets.forestRiversB[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
