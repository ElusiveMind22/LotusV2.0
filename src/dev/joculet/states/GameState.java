package dev.joculet.states;

import dev.joculet.Handler;
import dev.joculet.entity.Creatures.Player;
import dev.joculet.worlds.World;

import java.awt.*;

public class GameState extends State{

    private final World world;



    public GameState(Handler handler){
        super(handler);
        world= World.getSelf(handler,"Res/Worlds/world2.txt");
        handler.setWorld(world);


    }

    private void DrawScore(Graphics s)
    {
        int Score= handler.getWorld().getEntityManager().getPlayer().getScore();
        String temp= String.valueOf(Score);
        s.setColor(Color.black);
        s.drawString("SCORE: " + temp,30,10);

    }

    @Override
    public void tick() {
        world.tick();
        if  (handler.getKeyManager().two|| Player.isTime) {

            handler.getWorld().nextWorld("res/worlds/world1.txt");
        }


    }

    @Override
    public void render(Graphics g) {

        world.render(g);
        DrawScore(g);


    }
}
