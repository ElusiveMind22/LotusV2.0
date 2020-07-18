package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByW4 extends Tile {
    public ForestGrassSurroundedByW4( int id) {
        super(Assets.forestGrassSurroundedByWater[3], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
