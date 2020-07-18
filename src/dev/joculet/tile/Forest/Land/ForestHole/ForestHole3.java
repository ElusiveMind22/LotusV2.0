package dev.joculet.tile.Forest.Land.ForestHole;


import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

public class ForestHole3 extends Tile {
    public ForestHole3(int id) {
        super(Assets.forestHole[2], id);
    }
    @Override
    public boolean isSolid() {
        return true;
    }
}