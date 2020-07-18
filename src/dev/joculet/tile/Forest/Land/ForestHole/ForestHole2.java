package dev.joculet.tile.Forest.Land.ForestHole;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHole2 extends Tile {
    public ForestHole2(int id) {
        super(Assets.forestHole[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}