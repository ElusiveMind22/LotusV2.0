package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC4 extends Tile {
    public ForestRriversC4(int id) {
        super(Assets.forestRiversC[3], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

