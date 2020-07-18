package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass4 extends Tile {
    public ForestHillSurroundedByGrass4(int id) {
        super(Assets.forestHillSurroundedByGrass[3], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
