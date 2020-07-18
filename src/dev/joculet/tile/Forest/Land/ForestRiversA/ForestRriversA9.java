package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA9 extends Tile {
    public ForestRriversA9(int id) {
        super(Assets.forestRiversA[8], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
