package dev.joculet;

import dev.joculet.display.Display;
import dev.joculet.graphics.Assets;
import dev.joculet.graphics.GameCamera;
import dev.joculet.input.KeyManager;
import dev.joculet.input.MouseManager;
import dev.joculet.states.*;

import java.awt.*;
import java.awt.image.BufferStrategy;


public class Game implements Runnable {

    private Display display;

    private String title;
    private int width,height;

    private Thread thread;
    boolean running=false;

    private BufferStrategy bs;
    private Graphics g;

    //STATES

    public State gameState;
    public State menuState;
    public State settingsState;

    //INPUT

    private KeyManager keyManager;
    private MouseManager mouseManager;

    //CAMERA

    private GameCamera gameCamera;

    //Handler

    private Handler handler;



    public Game(String title,int width, int height)
    {
       this.width=width;
       this.height=height;
       this.title=title;
       keyManager=new KeyManager();
       mouseManager=new MouseManager();

    }

    private void init()
    {
        display=new Display(title,width,height);
        display.getFrame().addKeyListener(keyManager);
        display.getFrame().addMouseListener(mouseManager);
        display.getFrame().addMouseMotionListener(mouseManager);
        display.getCanvas().addMouseListener(mouseManager);
        display.getCanvas().addMouseMotionListener(mouseManager);
        Assets.init();
        handler=new Handler(this);
        gameCamera=new GameCamera(handler,0,0);


        gameState=new GameState(handler);
        menuState=new MenuState(handler);

        State.setState(menuState);
    }



    private void update()
    {

        keyManager.tick();
        if(State.getState()!=null)
            State.getState().tick();

    }

    private void render()
    {

        bs=display.getCanvas().getBufferStrategy();
        if(bs==null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g=bs.getDrawGraphics();


        // Clear Screen

        g.clearRect(0,0,width,height);

        // Start Drawing

        if(State.getState()!=null)
            State.getState().render(g);



        // Stop Drawing


        bs.show();
        g.dispose();

    }

    public void run() {

        init();

        running = true;
        int FPS=60;
        double timePerTick=1000000000/FPS;
        double delta=0;
        long now;
        long lastTime=System.nanoTime();
        long timer=0;
        int ticks=0;

        while (running)
        {
            now=System.nanoTime();
            delta=delta+(now-lastTime)/timePerTick;
            timer=timer+ (now-lastTime);
            lastTime=now;

            if(delta>=1) {
                update();
                render();
                delta--;
                ticks++;
            }
            if(timer>= 1000000000)
            {
               // System.out.println("FPS: "+ticks);
                ticks=0;
                timer=0;
            }
        }

        stop();

    }


    public MouseManager getMouseManager(){return mouseManager;}
    public KeyManager getKeyManager()
    {
        return keyManager;
    }
    public GameCamera getGameCamera()
    {
        return gameCamera;
    }

    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }


    public synchronized void stop()
    {
        if(!running)
            return;

        running=false;

        try{

            thread.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
