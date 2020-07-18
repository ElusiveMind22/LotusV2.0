package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA3 extends Tile {
    public ForestRriversA3(int id) {
        super(Assets.forestRiversA[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}