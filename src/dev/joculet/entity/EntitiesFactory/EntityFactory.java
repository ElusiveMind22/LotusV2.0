package dev.joculet.entity.EntitiesFactory;


import dev.joculet.Handler;
import dev.joculet.entity.Entity;

public interface EntityFactory {
    public Entity MakeStaticEntity(Handler handler, float x, float y, StaticEntityType type);
    public Entity MakeMovingEntity(Handler handler, float x, float y, boolean moveType, MovingEntityType type);
}
