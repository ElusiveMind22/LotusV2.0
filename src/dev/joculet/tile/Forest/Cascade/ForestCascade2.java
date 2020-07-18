package dev.joculet.tile.Forest.Cascade;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestCascade2 extends Tile {
    public ForestCascade2( int id) {
        super(Assets.forestCascade[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}