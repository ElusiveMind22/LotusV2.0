package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC3 extends Tile {
    public ForestRriversC3(int id) {
        super(Assets.forestRiversC[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

