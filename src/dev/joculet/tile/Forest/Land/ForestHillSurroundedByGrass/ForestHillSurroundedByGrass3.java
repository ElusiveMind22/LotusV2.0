package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass3 extends Tile {
    public ForestHillSurroundedByGrass3(int id) {
        super(Assets.forestHillSurroundedByGrass[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
