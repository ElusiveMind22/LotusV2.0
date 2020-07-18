package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW2 extends Tile {
    public ForestGrassSurroundedByW2( int id) {
        super(Assets.forestGrassSurroundedByWater[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
