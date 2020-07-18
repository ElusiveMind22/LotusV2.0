package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC6 extends Tile {
    public ForestRriversC6(int id) {
        super(Assets.forestRiversC[5], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
