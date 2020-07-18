package dev.joculet.tile.Forest.Land.ForestRiversB;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversB1 extends Tile {
    public ForestRriversB1(int id) {
        super(Assets.forestRiversB[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
