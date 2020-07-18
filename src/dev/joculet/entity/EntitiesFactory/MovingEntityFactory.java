package dev.joculet.entity.EntitiesFactory;

import dev.joculet.Handler;
import dev.joculet.entity.Entity;

public class MovingEntityFactory implements EntityFactory {

    @Override
    public Entity MakeMovingEntity(Handler handler, float x, float y, boolean moveType, MovingEntityType type) {

        switch(type)
        {

            default: return null;
        }
    }
    @Override
    public Entity MakeStaticEntity(Handler handler, float x, float y, StaticEntityType type)
    {
        return null;
    }

}
