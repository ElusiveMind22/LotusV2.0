package dev.joculet.graphics;

import dev.joculet.Handler;
import dev.joculet.entity.Entity;
import dev.joculet.tile.Tile;

public class GameCamera {

    private Handler handler;
    private float xOffset,yOffset;

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }

    public GameCamera(Handler handler,float xOffset, float yOffset)
    {
        this.handler=handler;
        this.xOffset=xOffset;
        this.yOffset=yOffset;
    }

    public void checkBlankSpace() {
        //Behave differently if the world is smaller than the window otherwise there will be camera clamping issues
        if (handler.getWidth() > handler.getWorld().getWidth() * Tile.TILEWIDTH) {
            //Check if mapwidth is less than window width
            xOffset = -(handler.getWidth() - handler.getWorld().getWidth() * Tile.TILEWIDTH) / 2;
            //Center map on the screen
        } else {
            if (xOffset < 0) {
                xOffset = 0;
            } else if (xOffset > handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth()) {
                xOffset = handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth();
            }
        }
        if (handler.getHeight() > handler.getWorld().getHeight() * Tile.TILEHEIGHT) {
            yOffset = -(handler.getHeight() - handler.getWorld().getHeight() * Tile.TILEHEIGHT) / 2;

        } else {
            if (yOffset < 0) {
                yOffset = 0;
            } else if (yOffset > handler.getWorld().getHeight() * Tile.TILEHEIGHT - handler.getHeight()) {
                yOffset = handler.getWorld().getHeight() * Tile.TILEHEIGHT - handler.getHeight();
            }
        }
    }

    public void centerOnEntity(Entity e)
    {
        xOffset=e.getX()-handler.getWidth()/2+e.getWidth()/2;
        yOffset=e.getY()-handler.getHeight()/2+e.getHeight()/2;
        checkBlankSpace();
    }

    public void move(float xAmt, float yAmt)
    {
        xOffset+=xAmt;
        yOffset+=yAmt;
        checkBlankSpace();
    }


}
