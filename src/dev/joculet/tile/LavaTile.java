package dev.joculet.tile;

import dev.joculet.graphics.Assets;

public class LavaTile extends Tile{
    public LavaTile(int id) {
        super(Assets.lava, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
