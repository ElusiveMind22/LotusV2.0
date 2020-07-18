package dev.joculet.entity.Statics;

import dev.joculet.Handler;
import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

import java.awt.*;

public class House extends StaticEntity {

    public House(Handler handler,float x, float y)
    {
        super(handler,x,y, Tile.TILEWIDTH,Tile.TILEHEIGHT);


         height =100;
         width = 130;

        colisionBox.x=30;
        colisionBox.y=30;
        colisionBox.width=70;
        colisionBox.height=50;

        health =1000;

    }

    @Override
    public void tick() {

    }
    @Override
    public void die()
    {

    }

    @Override
    public void render(Graphics g) {

        g.drawImage(Assets.house,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);


        //Seteaza ca sa vezi colisionBox-ul

     //    g.setColor(Color.red);
     //   g.fillRect((int)(x+colisionBox.x-handler.getGameCamera().getxOffset()), (int)(y+colisionBox.y-handler.getGameCamera().getyOffset()), colisionBox.width,colisionBox.height);
    }
}
