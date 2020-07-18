package dev.joculet.tile.Forest.Land.ForestRiversB;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversB7 extends Tile {
    public ForestRriversB7(int id) {
        super(Assets.forestRiversB[6], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
