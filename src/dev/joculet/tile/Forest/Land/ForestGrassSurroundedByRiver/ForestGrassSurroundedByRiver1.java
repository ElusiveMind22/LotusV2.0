package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver1 extends Tile {
    public ForestGrassSurroundedByRiver1(int id) {
        super(Assets.forestGrassSurroundedByRiver[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
