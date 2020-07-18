package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW9 extends Tile {
    public ForestGrassSurroundedByW9( int id) {
        super(Assets.forestGrassSurroundedByWater[8], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
