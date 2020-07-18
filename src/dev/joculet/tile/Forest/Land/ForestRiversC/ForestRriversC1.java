package dev.joculet.tile.Forest.Land.ForestRiversC;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversC1 extends Tile {
    public ForestRriversC1(int id) {
        super(Assets.forestRiversC[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
