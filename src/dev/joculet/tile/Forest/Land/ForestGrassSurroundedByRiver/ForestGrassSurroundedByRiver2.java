package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver2 extends Tile {
    public ForestGrassSurroundedByRiver2(int id) {
        super(Assets.forestGrassSurroundedByRiver[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
