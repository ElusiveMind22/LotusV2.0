package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC9 extends Tile {
    public ForestRriversC9(int id) {
        super(Assets.forestRiversC[8], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

