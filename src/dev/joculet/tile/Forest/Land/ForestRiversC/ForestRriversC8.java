package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC8 extends Tile {
    public ForestRriversC8(int id) {
        super(Assets.forestRiversC[7], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

