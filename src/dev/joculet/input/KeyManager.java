package dev.joculet.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys;
    public boolean up,left,right,down;
    public boolean up2,left2,right2,down2;
    public boolean Aup,Adown,Aright,Aleft;
    public boolean one,two,escape;
    public KeyManager() {

        keys = new boolean[256];

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    public void tick()
    {

        escape=keys[KeyEvent.VK_ESCAPE];

        one=keys[KeyEvent.VK_1];
        two=keys[KeyEvent.VK_2];

        up2=keys[KeyEvent.VK_U];
        left2=keys[KeyEvent.VK_J];
        down2=keys[KeyEvent.VK_H];
        right2=keys[KeyEvent.VK_K];

        Aup=keys[KeyEvent.VK_UP];
        Adown=keys[KeyEvent.VK_DOWN];
        Aleft=keys[KeyEvent.VK_LEFT];
        Aright=keys[KeyEvent.VK_RIGHT];


        up=keys[KeyEvent.VK_W];;
        left=keys[KeyEvent.VK_A];
        down=keys[KeyEvent.VK_S];
        right=keys[KeyEvent.VK_D];

    }

    @Override
    public void keyPressed(KeyEvent e) {

        keys[e.getKeyCode()]=true;


    }

    @Override
    public void keyReleased(KeyEvent e) {

        keys[e.getKeyCode()]=false;

    }
}
