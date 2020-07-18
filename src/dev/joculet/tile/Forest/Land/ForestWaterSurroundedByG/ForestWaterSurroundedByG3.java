package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG3 extends Tile {
    public ForestWaterSurroundedByG3(int id) {
        super(Assets.forestWaterSurroundedByGrass[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
