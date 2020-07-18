package dev.joculet.tile.Forest.Cascade;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestCascade3 extends Tile {
    public ForestCascade3( int id) {
        super(Assets.forestCascade[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}