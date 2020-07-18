package dev.joculet.entity.Statics.Tree;

import dev.joculet.Handler;
import dev.joculet.entity.Statics.StaticEntity;
import dev.joculet.graphics.Assets;
import dev.joculet.tile.Tile;

import java.awt.*;

public class Tree extends StaticEntity {

    public Tree(Handler handler,float x, float y)
    {
        super(handler,x,y, Tile.TILEWIDTH,Tile.TILEHEIGHT);


        height=128;
        width=128;

        colisionBox.x=25;
        colisionBox.y=32;
        colisionBox.width=64;
        colisionBox.height=64;

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

        g.drawImage(Assets.tree,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);


        //Seteaza ca sa vezi colisionBox-ul

       //  g.setColor(Color.red);
       //  g.fillRect((int)(x+colisionBox.x-handler.getGameCamera().getxOffset()), (int)(y+colisionBox.y-handler.getGameCamera().getyOffset()), colisionBox.width,colisionBox.height);
    }
}
