package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG8 extends Tile {
    public ForestWaterSurroundedByG8(int id) {
        super(Assets.forestWaterSurroundedByGrass[7], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
