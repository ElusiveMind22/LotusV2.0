package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA5 extends Tile {
    public ForestRriversA5(int id) {
        super(Assets.forestRiversA[4], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
