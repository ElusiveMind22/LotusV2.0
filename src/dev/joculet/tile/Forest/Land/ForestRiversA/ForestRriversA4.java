package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA4 extends Tile {
    public ForestRriversA4(int id) {
        super(Assets.forestRiversA[3], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
