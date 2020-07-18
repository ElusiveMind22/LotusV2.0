package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW6 extends Tile {
    public ForestGrassSurroundedByW6( int id) {
        super(Assets.forestGrassSurroundedByWater[5], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
