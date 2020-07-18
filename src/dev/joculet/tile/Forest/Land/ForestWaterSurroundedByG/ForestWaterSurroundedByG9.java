package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG9 extends Tile {
    public ForestWaterSurroundedByG9(int id) {
        super(Assets.forestWaterSurroundedByGrass[8], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
