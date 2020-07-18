package dev.joculet.entity.Creatures;

import dev.joculet.Handler;
import dev.joculet.entity.Entity;
import dev.joculet.graphics.Animation;
import dev.joculet.graphics.Assets;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Creature {

    //ANIMATII

    private Animation animRight,animLeft,animUp,animIdle;

    Rectangle attackRange=  new Rectangle();
    private int lastPos;
    private static int score;
    private int level,xp,xp_up,damage;

    public static boolean isTime=false;
    private static Player self;

    private long lastAttackTimer;
    private final long attackCooldown=800;
    private long attackTimer=attackCooldown;

    private Player(Handler handler , float x, float y, int speed) {
        super(handler,x, y,Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);

        //CollisionBox

        colisionBox.x=16;
        colisionBox.y=32;
        colisionBox.width=32;
        colisionBox.height=32;
        this.speed=speed;

        //Pozitie caracter

        lastPos=2; // s-a uitat in dreapta

        //Animatii

        animRight = new Animation(100,Assets.player_right);
        animLeft = new Animation(100,Assets.player_left);
        animUp = new Animation(100,Assets.player_up);
        animIdle = new Animation(500,Assets.player_idle);


        //Character Stats

        score = 0;
        level = 1;
        xp = 0;
        xp_up = 50;
        damage=5;
    }
    public static Player getSelf(Handler handler, float x, float y, int speed)
    {
        if (self == null)
            self = new Player(handler, x, y, speed);
        return self;
    }

    public static void reset()
    {
        self = null;
    }

    public void gainExp(int xp)
    {
        this.xp += xp;
        if (this.xp >= xp_up)
        {
            level++;
            this.xp = this.xp - xp_up;
            health+= 10;
            score+= 100;
            xp_up += 20;
            damage += 3;
        }
    }

    @Override
    public void tick() {


        //Animatii
        animRight.tick();
        animLeft.tick();
        animIdle.tick();
        animUp.tick();


       getInput();
       move();

        handler.getGameCamera().centerOnEntity(this);

        if (y<0) {
            isTime = true;
            System.out.println("Congratulation, your score is: "+score);

        }
        else
            isTime=false;

        // ATTACK
        checkAttacks();

    }

    private void checkAttacks()
    {
        attackTimer += System.currentTimeMillis()-lastAttackTimer;
        lastAttackTimer=System.currentTimeMillis();
        if(attackTimer<attackCooldown)
            return;



        Rectangle collisionBounds=getCollisionBounds(0,0);
        int attackRangeSize=20;
        attackRange.width=attackRangeSize;
        attackRange.height=attackRangeSize;

        if(handler.getKeyManager().Aup)
        {
            attackRange.x=collisionBounds.x+collisionBounds.width/2-attackRangeSize/2;
            attackRange.y=collisionBounds.y-attackRangeSize;
        }
        else  if(handler.getKeyManager().Adown)
        {
            attackRange.x=collisionBounds.x+collisionBounds.width/2-attackRangeSize/2;
            attackRange.y=collisionBounds.y+collisionBounds.height;
        }
        else  if(handler.getKeyManager().Aleft)
        {
            attackRange.x=collisionBounds.x-attackRangeSize;
            attackRange.y=collisionBounds.y+ collisionBounds.height/2-attackRangeSize/2;
        }
        else  if(handler.getKeyManager().Aright)
        {
            attackRange.x=collisionBounds.x+collisionBounds.width;
            attackRange.y=collisionBounds.y+ collisionBounds.height/2-attackRangeSize/2;
        }
        else
            return;

        attackTimer=0;


        for(Entity e: handler.getWorld().getEntityManager().getEntities()) {
            if (e.equals(this))
                continue;
            if(e.getCollisionBounds(0,0).intersects(attackRange))
            {
                e.takeDamage(damage);
                return;
            }
        }
    }
    public void getInput()
    {
        xMove=0;
        yMove=0;

        if(handler.getKeyManager().up||handler.getKeyManager().up2)
            yMove=-speed;
        if(handler.getKeyManager().down||handler.getKeyManager().down2)
            yMove=speed;
        if(handler.getKeyManager().right||handler.getKeyManager().right2)
            xMove=speed;
        if(handler.getKeyManager().left||handler.getKeyManager().left2)
            xMove=-speed;

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(this.getCurrentAnimationFrame(),(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);


        //Seteaza ca sa vezi colisionBox-ul

           g.setColor(Color.red);
           g.fillRect((int)(x+colisionBox.x-handler.getGameCamera().getxOffset()),
           (int)(y+colisionBox.y-handler.getGameCamera().getyOffset()),
           colisionBox.width,colisionBox.height);

    }


    public void die()
    {
        active = false;
        System.out.println("DEFEATED!");
        System.out.println("Your score was: "+score);
        System.exit(0);
    }

    private BufferedImage getCurrentAnimationFrame() {

        if (xMove < 0) {
            lastPos = 1;
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {
            lastPos = 2;
            return animRight.getCurrentFrame();
        } else if (yMove < 0) {
            lastPos = 3;
            return animUp.getCurrentFrame();
        } else if (yMove > 0) {
            lastPos = 4;
            return animRight.getCurrentFrame();
        } else {
            return animIdle.getCurrentFrame();

        }
    }

    public void setScore(int score) {
        Player.score =score;}
    public int getScore() { return score; }


}
