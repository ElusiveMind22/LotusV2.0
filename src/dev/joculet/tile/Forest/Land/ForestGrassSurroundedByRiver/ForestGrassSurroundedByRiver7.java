package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver7 extends Tile {
    public ForestGrassSurroundedByRiver7(int id) {
        super(Assets.forestGrassSurroundedByRiver[6], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
