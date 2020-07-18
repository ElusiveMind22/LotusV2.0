package dev.joculet.states;

import dev.joculet.Handler;
import dev.joculet.graphics.Assets;
import dev.joculet.ui.ClickListener;
import dev.joculet.ui.UIImageButton;
import dev.joculet.ui.UIManager;

import java.awt.*;

public class SettingsState extends State {
    private UIManager uiManager2;

    public SettingsState(Handler handler) {

        super(handler);
        uiManager2 = new UIManager(handler);
        handler.getMouseManager().setUIManager(uiManager2);
        uiManager2.addObject(new UIImageButton(handler.getGame().getWidth() / 3f, 0, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_menu, null));
        uiManager2.addObject(new UIImageButton(handler.getGame().getWidth() / 3f, handler.getGame().getHeight() / 3f, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_start, new ClickListener() {

            public void onClick() {

                State.setState(handler.getGame().gameState);

            }
        }));
        uiManager2.addObject(new UIImageButton(handler.getGame().getWidth() / 3f, handler.getGame().getHeight() / 2f, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_load, new ClickListener() {

            public void onClick() {



            }
        }));
        uiManager2.addObject(new UIImageButton(handler.getGame().getWidth() / 3f, 4*handler.getGame().getHeight() / 6f, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_options, new ClickListener() {

            public void onClick() {

                State.setState(handler.getGame().settingsState);

            }
        }));
        uiManager2.addObject(new UIImageButton(handler.getGame().getWidth() / 3f, 5*handler.getGame().getHeight() / 6f, handler.getGame().getWidth() / 3, handler.getGame().getHeight() / 6, Assets.btn_exit, new ClickListener() {

            public void onClick() {

                System.exit(0);

            }
        }));

    }
    @Override
    public void tick() {

        uiManager2.tick();
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.black);
        g.drawImage(Assets.background, 0, 0, 1280, 720, null);
        //   g.fillRect(handler.getGame().getWidth()/3,handler.getGame().getHeight()/5, handler.getGame().getWidth()*2/10, 3*handler.getGame().getHeight()/5);

        uiManager2.render(g);

        g.drawImage(Assets.wheel,handler.getMouseManager().getMouseX(),handler.getMouseManager().getMouseY(),8,8,null);

    }
}
