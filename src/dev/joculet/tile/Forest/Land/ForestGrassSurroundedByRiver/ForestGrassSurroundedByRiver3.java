package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver3 extends Tile {
    public ForestGrassSurroundedByRiver3(int id) {
        super(Assets.forestGrassSurroundedByRiver[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
