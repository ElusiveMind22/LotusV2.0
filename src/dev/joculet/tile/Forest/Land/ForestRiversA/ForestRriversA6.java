package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA6 extends Tile {
    public ForestRriversA6(int id) {
        super(Assets.forestRiversA[5], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
