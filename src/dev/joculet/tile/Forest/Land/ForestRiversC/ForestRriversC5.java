package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC5 extends Tile {
    public ForestRriversC5(int id) {
        super(Assets.forestRiversC[4], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

