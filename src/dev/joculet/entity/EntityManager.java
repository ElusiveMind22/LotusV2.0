package dev.joculet.entity;

import dev.joculet.Handler;
import dev.joculet.entity.Creatures.Player;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

public class EntityManager {

    private Handler handler;
    private Player player;

    private ArrayList<Entity> entities;
    private Comparator<Entity> renderSorter=new Comparator<Entity>()
    {

        @Override
        public int compare(Entity o1, Entity o2) {
            if(o1.getY()+o1.getHeight()<o2.getY()+o2.getHeight())
                return -1;
            else
                return 1;
        }
    };

    //Singleton
    private static EntityManager self;

    private EntityManager(Handler handler, Player player)
    {

        this.handler=handler;
        this.player=player;

        entities=new ArrayList<Entity>();
        addEntity(player);


    }
    public static EntityManager getSelf(Handler handler, Player player )
    {
        if(self == null)
            self = new EntityManager(handler, player);
        return self;
    }
    public static void reset()
    {
        self = null;
    }


    public void tick()
    {

        ListIterator<Entity> iter = entities.listIterator();
        while(iter.hasNext())
        {
            Entity entity = iter.next();
            entity.tick();
            if(!entity.getActive())
                iter.remove();
        }

        entities.sort(renderSorter);



    }
    public void render(Graphics g)
    {

        for(Entity e : entities)
        {
            e.render(g);
        }

////////////VEZI

    }

    public void addEntity(Entity e)
    {
        entities.add(e);
    }

    public void removeEntity(Entity entity)
    {
        entities.remove(entity);
    }

    public void clearManager()
    {
        entities.clear();
    }


    //Getters and Setters

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
}
