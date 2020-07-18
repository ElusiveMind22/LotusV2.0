package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass2 extends Tile {
    public ForestHillSurroundedByGrass2(int id) {
        super(Assets.forestHillSurroundedByGrass[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
