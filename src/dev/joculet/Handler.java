package dev.joculet;

import dev.joculet.graphics.GameCamera;
import dev.joculet.input.KeyManager;
import dev.joculet.input.MouseManager;
import dev.joculet.worlds.World;

public class Handler {


    private Game game;
    private World world;

    public Handler(Game game)
    {
        this.game=game;
    }


    public MouseManager getMouseManager(){return game.getMouseManager();}
    public GameCamera getGameCamera()
    {
        return game.getGameCamera();
    }
    public KeyManager getKeyManager()
    {
        return game.getKeyManager();
    }
    public int getWidth()
    {
        return game.getWidth();
    }
    public int getHeight()
    {
        return game.getHeight();
    }




    /// Getters and setters World and Game



    public World getWorld() {
        return world;
    }
    public void setWorld(World world) {
        this.world = world;
    }

    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }
}
