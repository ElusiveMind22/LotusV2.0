package dev.joculet.tile.Forest.Cascade;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestCascade1 extends Tile {
    public ForestCascade1( int id) {
        super(Assets.forestCascade[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}