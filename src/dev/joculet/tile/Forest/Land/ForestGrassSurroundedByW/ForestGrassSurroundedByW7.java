package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW7 extends Tile {
    public ForestGrassSurroundedByW7( int id) {
        super(Assets.forestGrassSurroundedByWater[6], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
