package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG2 extends Tile {
    public ForestWaterSurroundedByG2(int id) {
        super(Assets.forestWaterSurroundedByGrass[1], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
