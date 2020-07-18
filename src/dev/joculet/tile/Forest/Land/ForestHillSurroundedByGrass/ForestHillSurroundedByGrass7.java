package dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHillSurroundedByGrass7 extends Tile {
    public ForestHillSurroundedByGrass7(int id) {
        super(Assets.forestHillSurroundedByGrass[6], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
