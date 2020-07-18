package dev.joculet.tile.Forest.Land.ForestHole;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHole4 extends Tile {
    public ForestHole4(int id) {
        super(Assets.forestHole[3], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}