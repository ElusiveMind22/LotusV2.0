package dev.joculet.states;

import dev.joculet.Handler;
import dev.joculet.graphics.Assets;
import dev.joculet.ui.ClickListener;
import dev.joculet.ui.UIImageButton;
import dev.joculet.ui.UIManager;

import java.awt.*;

public class MenuState extends State {

    private UIManager uiManager;

    public MenuState(Handler handler) {

        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUIManager(uiManager);
        uiManager.addObject(new UIImageButton(handler.getGame().getWidth() / 3, 0, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.title, null));
        uiManager.addObject(new UIImageButton(handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 3, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_start, new ClickListener() {

            public void onClick() {

                State.setState(handler.getGame().gameState);

            }
        }));
        uiManager.addObject(new UIImageButton(handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 2, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_load, new ClickListener() {

            public void onClick() {



            }
        }));
        uiManager.addObject(new UIImageButton(handler.getGame().getWidth() / 3, 4*handler.getGame().getHeight() / 6, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_options, new ClickListener() {

            public void onClick() {

                State.setState(handler.getGame().settingsState);

            }
        }));
        uiManager.addObject(new UIImageButton(handler.getGame().getWidth() / 3, 5*handler.getGame().getHeight() / 6, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_exit, new ClickListener() {

            public void onClick() {

                System.out.println("EXIT!!!");

            }
        }));

    }
    @Override
    public void tick() {

       uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.black);
        g.drawImage(Assets.background, 0, 0, 1280, 720, null);
     //   g.fillRect(handler.getGame().getWidth()/3,handler.getGame().getHeight()/5, handler.getGame().getWidth()*2/10, 3*handler.getGame().getHeight()/5);

        uiManager.render(g);

        g.drawImage(Assets.wheel,handler.getMouseManager().getMouseX(),handler.getMouseManager().getMouseY(),8,8,null);

    }
}
