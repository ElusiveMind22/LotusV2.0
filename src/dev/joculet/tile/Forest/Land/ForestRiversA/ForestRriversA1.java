package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA1 extends Tile {
    public ForestRriversA1(int id) {
        super(Assets.forestRiversA[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
