package dev.joculet.entity.Statics;

import dev.joculet.Handler;
import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

import java.awt.*;

public class Adventurer2 extends StaticEntity {

    public Adventurer2(Handler handler,float x, float y)
    {
        super(handler,x,y, Tile.TILEWIDTH,Tile.TILEHEIGHT);



        colisionBox.x=16;
        colisionBox.y=32;
        colisionBox.width=32;
        colisionBox.height=32;

        health=1111;

    }

    @Override
    public void die()
    {
        active = false;
   }

    @Override
    public void tick() {

    }


    @Override
    public void render(Graphics g) {

        g.drawImage(Assets.adv2,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);


        //Seteaza ca sa vezi colisionBox-ul

        //  g.setColor(Color.red);
        //  g.fillRect((int)(x+colisionBox.x-handler.getGameCamera().getxOffset()), (int)(y+colisionBox.y-handler.getGameCamera().getyOffset()), colisionBox.width,colisionBox.height);
    }
}
