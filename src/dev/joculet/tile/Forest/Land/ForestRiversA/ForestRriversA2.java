package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA2 extends Tile {
    public ForestRriversA2(int id) {
        super(Assets.forestRiversA[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
