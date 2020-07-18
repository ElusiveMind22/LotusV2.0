package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG6 extends Tile {
    public ForestWaterSurroundedByG6(int id) {
        super(Assets.forestWaterSurroundedByGrass[5], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
