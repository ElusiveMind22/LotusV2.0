package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass1 extends Tile {
    public ForestHillSurroundedByGrass1(int id) {
        super(Assets.forestHillSurroundedByGrass[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
