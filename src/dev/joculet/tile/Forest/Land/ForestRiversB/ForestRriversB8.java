package dev.joculet.tile.Forest.Land.ForestRiversB;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversB8 extends Tile {
    public ForestRriversB8(int id) {
        super(Assets.forestRiversB[7], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
