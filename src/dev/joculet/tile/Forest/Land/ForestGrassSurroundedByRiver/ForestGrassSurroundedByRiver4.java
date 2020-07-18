package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver4 extends Tile {
    public ForestGrassSurroundedByRiver4(int id) {
        super(Assets.forestGrassSurroundedByRiver[3], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
