package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW8 extends Tile {
    public ForestGrassSurroundedByW8( int id) {
        super(Assets.forestGrassSurroundedByWater[7], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
