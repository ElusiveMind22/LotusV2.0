package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW3 extends Tile {
    public ForestGrassSurroundedByW3( int id) {
        super(Assets.forestGrassSurroundedByWater[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
