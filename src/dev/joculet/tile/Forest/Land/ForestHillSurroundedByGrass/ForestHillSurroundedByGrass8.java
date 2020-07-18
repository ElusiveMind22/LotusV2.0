package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass8 extends Tile {
    public ForestHillSurroundedByGrass8(int id) {
        super(Assets.forestHillSurroundedByGrass[7], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
