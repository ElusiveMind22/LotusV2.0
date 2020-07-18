package dev.joculet.worlds;

import dev.joculet.Handler;
import dev.joculet.entity.EntitiesFactory.EntityFactory;
import dev.joculet.entity.EntitiesFactory.StaticEntityType;
import dev.joculet.entity.EntityManager;


public class WorldEntities {


    public static void map1(Handler handler, EntityManager entityManager, EntityFactory Static, EntityFactory Walking)
    {

        //Static
        entityManager.addEntity(Static.MakeStaticEntity(handler, 637, 834, StaticEntityType.MONEY2));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 252, 830, StaticEntityType.MONEY2));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 1111, 1113, StaticEntityType.MONEY2));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 1545, 59, StaticEntityType.MONEY2));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 262, 114, StaticEntityType.MONEY2));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 850, 336, StaticEntityType.MONEY2));

        entityManager.addEntity(Static.MakeStaticEntity(handler, 1468, 864, StaticEntityType.MONEY1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 1286, 960, StaticEntityType.MONEY1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 111, 368, StaticEntityType.MONEY1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 1264, 224, StaticEntityType.MONEY1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 840, 161, StaticEntityType.MONEY1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 621, 555, StaticEntityType.MONEY1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 1149, 562, StaticEntityType.MONEY1));

        entityManager.addEntity(Static.MakeStaticEntity(handler, 50, 970, StaticEntityType.HOUSE));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 481, 522, StaticEntityType.TREE1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 481+2*70, 522, StaticEntityType.TREE1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 481+70, 522, StaticEntityType.TREE1));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 481+3*70, 522, StaticEntityType.TREE1));

        entityManager.addEntity(Static.MakeStaticEntity(handler, 30, 700, StaticEntityType.TREE1));

        //Moving:


  }


    public static void map2(Handler handler, EntityManager entityManager, EntityFactory Static, EntityFactory Walking)
    {

        entityManager.addEntity(Static.MakeStaticEntity(handler, 1067, 97, StaticEntityType.HOUSE));
        entityManager.addEntity(Static.MakeStaticEntity(handler, 986, 163, StaticEntityType.ADV2));


         }
}
