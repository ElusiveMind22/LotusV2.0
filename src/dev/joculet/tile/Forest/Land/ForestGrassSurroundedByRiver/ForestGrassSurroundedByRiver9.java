package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver9 extends Tile {
    public ForestGrassSurroundedByRiver9(int id) {
        super(Assets.forestGrassSurroundedByRiver[8], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
