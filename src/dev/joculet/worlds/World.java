package dev.joculet.worlds;

import dev.joculet.Handler;
import dev.joculet.entity.EntitiesFactory.EntityFactory;
import dev.joculet.entity.EntitiesFactory.MovingEntityFactory;
import dev.joculet.entity.EntitiesFactory.StaticEntityFactory;
import dev.joculet.entity.Entity;
import dev.joculet.entity.EntityManager;
import dev.joculet.entity.Creatures.Player;

import dev.joculet.tile.Tile;
import dev.joculet.utils.Utils;

import java.awt.*;

public class World {

    private Handler handler;
    private int width,height;
    private int spawnX,spawnY;
    private int [][] tiles;

    //ENTITATI

    private EntityManager entityManager;
    private static EntityFactory Walking;
    private static EntityFactory Static;
    private int world_nr;

    //Singleton

    private static World self;

    private World(Handler handler, String path)
    {
        this.handler = handler;
        entityManager = EntityManager.getSelf(handler, Player.getSelf(handler, 600, 600, 3));
        loadWorld(path);
        Static = new StaticEntityFactory();
        Walking = new MovingEntityFactory();
        WorldEntities.map1(handler, entityManager, Static, Walking);
        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);
        world_nr = 1;
    }




    public static World getSelf(Handler handler, String path)
    {
        if (self == null)
            self = new World(handler, path);
        return self;
    }

    public static void reset()
    {
        self = null;
    }

    public void tick()
    {

        entityManager.tick();
        if (world_nr == 2) //trebuie asa neaparat, altfel va da exceptie ConcurrentModificationException
        {
            world_nr = 1;
            WorldEntities.map2(handler, entityManager, Static, Walking);
        }

    }

    public void render(Graphics g)
    {
        int xStart=(int)Math.max(0,handler.getGameCamera().getxOffset()/Tile.TILEWIDTH);
        int xEnd=(int)Math.min(width,((handler.getGameCamera().getxOffset()+handler.getWidth())/Tile.TILEWIDTH+1));
        int yStart=(int)Math.max(0,handler.getGameCamera().getyOffset()/Tile.TILEHEIGHT);
        int yEnd=(int)Math.min(height,((handler.getGameCamera().getyOffset()+handler.getHeight())/Tile.TILEHEIGHT)+1);

        for(int y=yStart;y<yEnd;y++)
            for(int x=xStart;x<xEnd;x++)
            {
                getTile(x,y).render(g,(int)(x*Tile.TILEWIDTH-handler.getGameCamera().getxOffset()),(int)(y*Tile.TILEHEIGHT-handler.getGameCamera().getyOffset()));

            }

        //Entitati

        entityManager.render(g);
    }

    public Tile getTile(int x, int y)
    {
        if(x< 0 || y < 0 || x >=width || y>=height)
            return Tile.grassTile;
        Tile t = Tile.tiles[tiles[x][y]];

        if (t == null)
            return Tile.dirtTile;
        return t;
    }




    public void loadWorld(String path)
    {

        String file= Utils.loadFileAsString(path);
        String[] tokens =file.split("\\s+");

        width=Utils.parseInt(tokens[0]);
        height=Utils.parseInt(tokens[1]);

        spawnX=Utils.parseInt(tokens[2]);
        spawnY=Utils.parseInt(tokens[3]);

        tiles=new int[width][height];

        for(int y=0;y<height;y++) {
            for(int x=0;x<width;x++) {
                tiles[x][y] = Utils.parseInt(tokens[x+y*width+4]);
            }
        }

    }



    public void nextWorld(String path)
    {
        for (int i = 0; i< entityManager.getEntities().size(); i++)
        {
            Entity entity = entityManager.getEntities().get(i);
            if (!entity.equals(entityManager.getPlayer()))
                entity.setActive(false);
        }

        // Curatam entitatile de pe prima mapa

        world_nr = 2;
        tiles = null;
        loadWorld(path);
        Player.getSelf(handler, 100, 100, 4).setX(spawnX);
        Player.getSelf(handler, 100, 100, 4).setY(spawnY);



    }


    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public int getSpawnX() {
        return spawnX;
    }
    public int getSpawnY() {
        return spawnY;
    }

    public static EntityFactory getMoving() {
        return Walking;
    }
    public static void setMoving(EntityFactory walking) {
        Walking = walking;
    }

    public static EntityFactory getStaying() { return Static; }
    public static void setStaying(EntityFactory stat) {
        Static = stat;
    }
}
