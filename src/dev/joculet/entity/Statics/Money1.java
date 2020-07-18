package dev.joculet.entity.Statics;

import dev.joculet.Handler;
import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

import java.awt.*;

public class Money1 extends StaticEntity {

    public Money1(Handler handler,float x, float y)
    {
        super(handler,x,y, Tile.TILEWIDTH,Tile.TILEHEIGHT);


        height =32;
        width = 32;

        colisionBox.x=8;
        colisionBox.y=8;

        colisionBox.width=16;
        colisionBox.height=8;

        health=1;

    }

    @Override
    public void die()
    {
        active = false;
       handler.getWorld().getEntityManager().getPlayer().setScore(handler.getWorld().getEntityManager().getPlayer().getScore() + 25);
    }

    @Override
    public void tick() {

    }


    @Override
    public void render(Graphics g) {

        g.drawImage(Assets.money1,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);


        //Seteaza ca sa vezi colisionBox-ul

        //  g.setColor(Color.red);
        //  g.fillRect((int)(x+colisionBox.x-handler.getGameCamera().getxOffset()), (int)(y+colisionBox.y-handler.getGameCamera().getyOffset()), colisionBox.width,colisionBox.height);
    }
}
