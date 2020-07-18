package dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestGrassSurroundedByRiver8 extends Tile {
    public ForestGrassSurroundedByRiver8(int id) {
        super(Assets.forestGrassSurroundedByRiver[7], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
