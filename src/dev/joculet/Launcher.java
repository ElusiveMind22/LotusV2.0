package dev.joculet;

import dev.joculet.audio.MusicPlayer;
import dev.joculet.utils.ThreadPool;

public class Launcher {

    public static void main(String[] args)
    {

        ThreadPool pool = new ThreadPool(2);
        Game game=new Game("Lotus Quest",1280,720);


        MusicPlayer player =new MusicPlayer("overcome.wav");

        pool.runTask(player);
        pool.runTask(game);
        pool.join();


    }

}

