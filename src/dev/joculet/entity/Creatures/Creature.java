package dev.joculet.entity.Creatures;

import dev.joculet.Handler;
import dev.joculet.entity.Entity;
import dev.joculet.tile.Tile;

import java.awt.*;

public abstract class Creature extends Entity {


    protected float speed;

    public static final float DEFAULT_SPEED=3f;
    public static final int DEFAULT_CREATURE_WIDTH=64;
    public static final int DEFAULT_CREATURE_HEIGHT=64;

    protected float xMove,yMove;

    public Creature(Handler handler, float x, float y, int width, int height) {

        super(handler,x, y,width,height);

        speed=DEFAULT_SPEED;

        xMove=0;
        yMove=0;
    }

    public void move()
    {
        if(!checkEntityCollision(xMove,0f))
             moveX();
        if(!checkEntityCollision(0f,yMove))
             moveY();
    }

    public void moveX()
    {


        int tyu = (int) (y + colisionBox.y)/Tile.TILEHEIGHT;                               //y sus
        int tyd = (int) (y + colisionBox.y+ colisionBox.height)/Tile.TILEHEIGHT;           //y jos


        if(xMove>0)             ///MERG DREAPTA
        {
            int txr = (int) (x + xMove + colisionBox.x + colisionBox.width )/ Tile.TILEWIDTH; //x dreapta
            if (!collisionWithTiles(txr,tyu) && (!collisionWithTiles(txr,tyd)))  //dreapta sus si dreapta jos
            {
                x += xMove;
            }
            else
            {
                x=txr*Tile.TILEWIDTH-colisionBox.x-colisionBox.width-1;
            }
        }
        else if(xMove<0)        ///MERG STANGA
        {
            int txl = (int) (x + xMove + colisionBox.x )/ Tile.TILEWIDTH; //x dreapta
            if (!collisionWithTiles(txl,tyu) && (!collisionWithTiles(txl,tyd)))  //stanga sus si stanga jos

            {
                x += xMove;
            }
            else{
               x=txl*Tile.TILEWIDTH-colisionBox.x+Tile.TILEWIDTH;
            }

        }


    }
    public void moveY()
    {

        int txl = (int) (x  + colisionBox.x)/ Tile.TILEWIDTH; //x stanga
        int txr = (int) (x  + colisionBox.x + colisionBox.width )/ Tile.TILEWIDTH; //x dreapta


        if(yMove>0)     /// Merg jos
        {
            int tyd = (int) (y +yMove+ colisionBox.y+ colisionBox.height)/Tile.TILEHEIGHT;           //y jos

            if(!collisionWithTiles(txl,tyd) && (!collisionWithTiles(txr,tyd)))  //stanga jos si dreapta jos
            {
                y+=yMove;
            }
            else
            {
                y=tyd * Tile.TILEHEIGHT-colisionBox.y-colisionBox.height-1;
            }

        }
        else if(yMove<0)    /// Merg sus
        {
            int tyu = (int) (y + yMove+colisionBox.y)/Tile.TILEHEIGHT;                               //y sus

            if(!collisionWithTiles(txl,tyu) && (!collisionWithTiles(txr,tyu)))  //stanga sus si dreapta sus
            {
                y+=yMove;
            }
            else
            {
                y=tyu*Tile.TILEHEIGHT-colisionBox.y+Tile.TILEHEIGHT;
            }
        }


    }
    public void takeDamage(int damage) {
        if (damage > 0) //if it's damage that has to be stopped by armor
        {

            health -= damage;

            if (health <= 0) {
                health = 0;
                active = false;
                die();
            }

        }
    }

    protected boolean collisionWithTiles(int x,int y)
    {
        return handler.getWorld().getTile(x,y).isSolid();
    }

    //////////////

    public float getxMove()
    {
        return this.xMove;
    }
    public float getyMove()
    {
        return this.yMove;
    }
    public void setxMove(float xMove)
    {
        this.xMove=xMove;
    }
    public void setyMove(float yMove)
    {
        this.yMove=yMove;
    }

    public int getHealth()
    {
        return health;
    }
    public float getSpeed()
    {
        return speed;
    }
    public void setHealth()
    {
        this.health=health;
    }
    public void setSpeed()
    {
        this.speed=speed;
    }


    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {

    }
}
