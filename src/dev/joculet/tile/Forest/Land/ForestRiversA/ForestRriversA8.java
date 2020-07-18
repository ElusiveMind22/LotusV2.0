package dev.joculet.tile.Forest.Land.ForestRiversA;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestRriversA8 extends Tile {
    public ForestRriversA8(int id) {
        super(Assets.forestRiversA[7], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
