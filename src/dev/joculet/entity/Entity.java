package dev.joculet.entity;

import dev.joculet.Handler;

import java.awt.*;

public abstract class Entity {

    protected boolean active=true;
    protected float x,y;
    protected int width,height;
    protected int health;
    public static final int DEFAULT_HEALTH=50;
    protected Rectangle colisionBox;

    protected Handler handler;

    public Entity(Handler handler, float x, float y, int width, int height)
    {
        this.health=DEFAULT_HEALTH;
        this.handler=handler;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        colisionBox=new Rectangle(0,0,width,height);
    }

    //HELPERE

    public boolean checkEntityCollision(float xOffset, float yOffset)
    {
        for(Entity e: handler.getWorld().getEntityManager().getEntities())
        {
            if(e.equals(this))
                continue;
            if(e.getCollisionBounds(0f,0f).intersects(getCollisionBounds(xOffset,yOffset)))
            {
                return true;
            }
        }

        return false;
    }

    public Rectangle getCollisionBounds(float xOffset, float yOffset)
    {
        return new Rectangle((int)(x+colisionBox.x+xOffset),(int)(y+colisionBox.y+yOffset),colisionBox.width,colisionBox.height);
    }



    public  void takeDamage(int dmg)
    {
        health-=dmg;
        if(health<=0) {
            active = false;
            die();
        }
    }






    public void setX(float x)
    {
        this.x=x;
    }
    public void setY(float y)
    {
        this.y=y;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public void setHealth(int health)
    {
        this.health=health;
    }
    public void setActive(boolean active) { this.active=active; }

    /// GETERE

    public float getX()
    {
        return this.x;
    }
    public float getY()
    {
        return this.y;
    }
    public int getWidth()
    {
        return this.width;
    }
    public int getHeight()
    {
        return this.height;
    }

    public int getHealth()
    {
        return this.health;
    }
    public boolean getActive()
    {
        return this.active;
    }




    public abstract void die();
    public abstract void tick();
    public abstract void render(Graphics g);

}
