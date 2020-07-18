package dev.joculet.entity.Creatures;

import dev.joculet.Handler;
import dev.joculet.graphics.Animation;
import dev.joculet.graphics.Assets;

import java.awt.*;



public class Mimic extends Creature {

    Animation animRight,animLeft,animUp,animIdle;


    int damage;
    int health;

    public Mimic(Handler handler, float x, float y, int width, int height)
    {
        super(handler,x,y,width,height);

        animRight = new Animation(100, Assets.player_right);
        animLeft = new Animation(100,Assets.player_left);
        animUp = new Animation(100,Assets.player_up);
        animIdle = new Animation(500,Assets.player_idle);
        damage=5;
        health=20;
    }

    @Override
    public void die() {

    }

    @Override
    public void tick() {

        animIdle.tick();
        animUp.tick();
        animLeft.tick();
        animRight.tick();


    }

    double distance()
    {
        return Math.sqrt((x-handler.getWorld().getEntityManager().getPlayer().getX())*(x-handler.getWorld().getEntityManager().getPlayer().getX())+(x-handler.getWorld().getEntityManager().getPlayer().getX())*(x-handler.getWorld().getEntityManager().getPlayer().getX()));
    }

    @Override
    public void render(Graphics g) {


    }


}
