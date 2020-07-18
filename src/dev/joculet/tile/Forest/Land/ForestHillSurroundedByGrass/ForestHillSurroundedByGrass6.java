package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass6 extends Tile {
    public ForestHillSurroundedByGrass6(int id) {
        super(Assets.forestHillSurroundedByGrass[5], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
