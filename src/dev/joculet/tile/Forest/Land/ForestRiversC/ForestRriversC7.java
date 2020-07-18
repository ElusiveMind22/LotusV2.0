package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC7 extends Tile {
    public ForestRriversC7(int id) {
        super(Assets.forestRiversC[6], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}

