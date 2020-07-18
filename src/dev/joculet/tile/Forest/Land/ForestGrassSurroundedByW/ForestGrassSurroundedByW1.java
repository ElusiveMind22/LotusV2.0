package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW1 extends Tile {
    public ForestGrassSurroundedByW1( int id) {
        super(Assets.forestGrassSurroundedByWater[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
