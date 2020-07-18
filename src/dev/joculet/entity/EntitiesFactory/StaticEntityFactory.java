package dev.joculet.entity.EntitiesFactory;


import dev.joculet.Handler;
import dev.joculet.entity.Entity;
import dev.joculet.entity.Statics.Adventurer2;
import dev.joculet.entity.Statics.House;
import dev.joculet.entity.Statics.Money1;
import dev.joculet.entity.Statics.Money2;
import dev.joculet.entity.Statics.Tree.Tree;
import dev.joculet.entity.Statics.Tree.Tree2;

public class StaticEntityFactory implements EntityFactory {

    @Override
    public Entity MakeStaticEntity(Handler handler, float x, float y, StaticEntityType type) {
        switch(type)
        {
            case TREE1: return new Tree(handler, x, y);
            case TREE2: return new Tree2(handler, x, y);
            case MONEY1:return new Money1(handler,x,y);
            case MONEY2:return new Money2(handler,x,y);
            case HOUSE:return new House(handler,x,y);
            case ADV2:return new Adventurer2(handler,x,y);
            default: return null;
        }
    }

    public Entity MakeMovingEntity(Handler handler, float x, float y, boolean moveType, MovingEntityType type) {

        return null;
    }
}
