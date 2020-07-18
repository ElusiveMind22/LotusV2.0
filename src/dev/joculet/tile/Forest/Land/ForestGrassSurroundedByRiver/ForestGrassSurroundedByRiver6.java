package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver6 extends Tile {
    public ForestGrassSurroundedByRiver6(int id) {
        super(Assets.forestGrassSurroundedByRiver[5], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
