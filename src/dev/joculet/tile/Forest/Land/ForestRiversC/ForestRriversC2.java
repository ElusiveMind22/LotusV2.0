package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC2 extends Tile {
    public ForestRriversC2(int id) {
        super(Assets.forestRiversC[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

