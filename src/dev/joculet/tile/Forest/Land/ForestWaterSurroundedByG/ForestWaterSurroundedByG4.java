package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG4 extends Tile {
    public ForestWaterSurroundedByG4(int id) {
        super(Assets.forestWaterSurroundedByGrass[3], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
