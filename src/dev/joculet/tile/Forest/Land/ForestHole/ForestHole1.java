package dev.joculet.tile.Forest.Land.ForestHole;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHole1 extends Tile {
    public ForestHole1(int id) {
        super(Assets.forestHole[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}