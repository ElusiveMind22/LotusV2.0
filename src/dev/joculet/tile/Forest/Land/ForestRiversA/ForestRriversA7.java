package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA7 extends Tile {
    public ForestRriversA7(int id) {
        super(Assets.forestRiversA[6], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
