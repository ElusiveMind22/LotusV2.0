package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass9 extends Tile {
    public ForestHillSurroundedByGrass9(int id) {
        super(Assets.forestHillSurroundedByGrass[8], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
