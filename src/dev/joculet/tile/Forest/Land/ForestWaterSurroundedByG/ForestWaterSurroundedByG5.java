package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG5 extends Tile {
    public ForestWaterSurroundedByG5(int id) {
        super(Assets.forestWaterSurroundedByGrass[4], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
