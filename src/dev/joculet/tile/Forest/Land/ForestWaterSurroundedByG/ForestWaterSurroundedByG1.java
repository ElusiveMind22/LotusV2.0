package dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG;

import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestWaterSurroundedByG1 extends Tile {
    public ForestWaterSurroundedByG1(int id) {
        super(Assets.forestWaterSurroundedByGrass[0], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}
