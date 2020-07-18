package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG7 extends Tile {
    public ForestWaterSurroundedByG7(int id) {
        super(Assets.forestWaterSurroundedByGrass[6], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
