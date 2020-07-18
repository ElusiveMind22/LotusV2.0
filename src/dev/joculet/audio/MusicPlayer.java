package dev.joculet.audio;

import javax.sound.sampled.*;
import java.io.File;
import java.util.ArrayList;

public class MusicPlayer implements Runnable{

    private ArrayList<String> musicFiles;
    private int currentSongIndex;

    public MusicPlayer(String ... files)
    {
        musicFiles = new ArrayList<String>();
        for(String file:files)
        {

            musicFiles.add("./Res/Audio/"+file);
        }
    }


    private void playSound(String filename)
    {
        try {

            File soundFile = new File(filename);
            AudioInputStream ais= AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class,format);
            Clip clip = (Clip)AudioSystem.getLine(info);
            clip.open(ais);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-10);
            clip.start();
            clip.loop(clip.LOOP_CONTINUOUSLY);


        }catch(Exception e)
             {
                e.printStackTrace();
             }
    }

    public static void setVolume(Clip song, int volume)
    {
        FloatControl control = (FloatControl) song.getControl(FloatControl.Type.MASTER_GAIN);
        float range = control.getMinimum();
        float result = range * (1 - volume / 100.0f);
        control.setValue(result);
    }

    @Override
    public void run() {
        playSound(musicFiles.get(currentSongIndex));


    }
}
