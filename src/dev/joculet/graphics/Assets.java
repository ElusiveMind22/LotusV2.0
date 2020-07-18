package dev.joculet.graphics;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width64=64, height64=64;
    private static final int width=32, height=32;
    private static final int width16=16, height16=16;


    public static BufferedImage grass,grass2,grass3,dirt,rock,lava,flower;
    public static BufferedImage player,player2;
    public static BufferedImage angelicPig;

    public static BufferedImage tree,tree2,shadow;
    public static BufferedImage shadowN,shadowE1,shadowE2,shadowS,shadowW1,shadowW2,shadowNE,shadowNW,shadowSW,shadowSE;
    public static BufferedImage wheel,shiny,money1,money2;

    public static BufferedImage adv2;

    public static BufferedImage test;

    public static BufferedImage background;

    public static BufferedImage[] player_right;
    public static BufferedImage[] player_left;
    public static BufferedImage[] player_idle;
    public static BufferedImage[] player_up;

    public static BufferedImage[] btn_start;
    public static BufferedImage[] btn_play;
    public static BufferedImage[] btn_menu;
    public static BufferedImage[] btn_exit;
    public static BufferedImage[] btn_options;
    public static BufferedImage[] btn_load;
    public static BufferedImage[] btn_back;
    public static BufferedImage[] title;


    public static BufferedImage[] forestCascade;
    public static BufferedImage forestStairs;

    public static BufferedImage[] forestHole;
    public static BufferedImage[] forestRiversA;
    public static BufferedImage[] forestRiversB;
    public static BufferedImage[] forestRiversC;
    public static BufferedImage[] forestRoadsA;
    public static BufferedImage[] forestRoadsB;
    public static BufferedImage[] forestRoadsC;

    public static BufferedImage[] forestGrassSurroundedByDirt;
    public static BufferedImage[] forestGrassSurroundedByWater;
    public static BufferedImage[] forestWaterSurroundedByGrass;
    public static BufferedImage[] forestDesertSurroundedByGrass;
    public static BufferedImage[] forestGrassSurroundedByRoads;
    public static BufferedImage[] forestGrassSurroundedByRiver;
    public static BufferedImage[] forestHillSurroundedByGrass;

    public static BufferedImage house;
    public static void init()
    {

        ///////////////////////////////// TILE SPRITESHEETS ///////////////////////////

        SpriteSheet sheet = new SpriteSheet(ImageLoader.LoadImage("/textures/multeAssets.png"));
        SpriteSheet sheet4= new SpriteSheet(ImageLoader.LoadImage("/textures/Forest.png"));

        ///////////////////////////////// Entity SPRITESHEETS ///////////////////////////

        SpriteSheet sheetHouse=new SpriteSheet(ImageLoader.LoadImage("/textures/house.png"));
        SpriteSheet sheetDungeon=new SpriteSheet(ImageLoader.LoadImage("/textures/Money.png"));
        SpriteSheet sheetAdventurerGirl=new SpriteSheet(ImageLoader.LoadImage("/textures/advFam.png"));
        //////////////////////////////// CHARACTER SPRITESHEETS ///////////////////////

        SpriteSheet sheetAdv= new SpriteSheet(ImageLoader.LoadImage("/textures/adv.png"));
        SpriteSheet sheetAdv2= new SpriteSheet(ImageLoader.LoadImage("/textures/adv2.png"));

        //////////////////////////////// UI SPRITESHEETS /////////////////////////////

        SpriteSheet BackgroundSheet = new SpriteSheet(ImageLoader.LoadImage("/textures/1.png"));
        SpriteSheet TitleSheet = new SpriteSheet(ImageLoader.LoadImage("/textures/Title.png"));

        SpriteSheet playSheet0 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Play.png"));
        SpriteSheet playSheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Play.png"));

        SpriteSheet startSheet0 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Start.png"));
        SpriteSheet startSheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/off/Start.png"));

        SpriteSheet menuSheet0 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Menu.png"));
        SpriteSheet menuSheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/off/Menu.png"));

        SpriteSheet optionsSheet0 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Options.png"));
        SpriteSheet optionsSheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/off/Options.png"));

        SpriteSheet exitSheet0 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Exit.png"));
        SpriteSheet exitSheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/off/Exit.png"));

        SpriteSheet loadSheet0 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Load.png"));
        SpriteSheet loadSheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/off/Load.png"));

        SpriteSheet backSheet0 = new SpriteSheet(ImageLoader.LoadImage("/textures/on/Back.png"));
        SpriteSheet backSheet1 = new SpriteSheet(ImageLoader.LoadImage("/textures/off/Back.png"));

        //////////////////////////////// GRAFICS //////////////////////////////////////

        background = BackgroundSheet.crop(0,0,1920,1080);
        title= new BufferedImage[2];
        title[0] = TitleSheet.crop(0,0,419,145);
        title[1] = TitleSheet.crop(0,0,419,145);

        btn_start= new BufferedImage[2];
        btn_start[0] =startSheet0.crop(0,0,600,200);
        btn_start[1] =startSheet1.crop(0,0,600,200);

        btn_menu= new BufferedImage[2];
        btn_menu[0] =menuSheet0.crop(0,0,600,200);
        btn_menu[1] =menuSheet1.crop(0,0,600,200);

        btn_play= new BufferedImage[2];
        btn_play[0] =playSheet0.crop(0,0,600,200);
        btn_play[1] =playSheet1.crop(0,0,600,200);

        btn_exit = new BufferedImage[2];
        btn_exit[0] =exitSheet0.crop(0,0,600,200);
        btn_exit[1] =exitSheet1.crop(0,0,600,200);

        btn_options= new BufferedImage[2];
        btn_options[0] =optionsSheet0.crop(0,0,600,200);
        btn_options[1] =optionsSheet1.crop(0,0,600,200);

        btn_load= new BufferedImage[2];
        btn_load[0] =loadSheet0.crop(0,0,600,200);
        btn_load[1] =loadSheet1.crop(0,0,600,200);

        btn_back= new BufferedImage[2];
        btn_back[0] =backSheet0.crop(0,0,600,200);
        btn_back[1] =backSheet1.crop(0,0,600,200);





        ///////////////////////////// SOME Temporary TILES ///////////////////////

        player= sheet.crop(4*width,79*height,width,height);
        player2= sheet.crop(7*width,79*height,width,height);
        dirt=sheet.crop(10*width,3*height,width,width);
        shiny=sheet.crop(6*width,0,width,width);
        lava=sheet.crop(0,6*height,width,height);
        grass=sheet.crop(12*width,9*height,width,height);
        grass2=sheet.crop(14*width,9*height,width,height);
        grass3=sheet.crop(15*width,9*height,width,height);
        flower= sheet.crop(26*width,5*height,width,height);
        angelicPig=sheet.crop(2*width,64*height,width,height);
        wheel= sheet.crop(4*width,0,width,height);
        rock=sheet.crop(39*width,2 *height,width,height);
        flower= sheet.crop(26*width,5*height,width,height);



///////////////////////////////////ENTITATI STATICE/////////////////////////////////



        tree=sheet4.crop(4*width,9*height,width64,height64);
        tree2=sheet4.crop(10*width,9*height,width64,height64);

        house=sheetHouse.crop(0,0,width64,height64);
        money1=sheetDungeon.crop(3*width,4*height,width,height);
        money2=sheetDungeon.crop(5*width,4*height,width,height);

        adv2 = sheetAdventurerGirl.crop(0,2*height,width,height);



        ////////////////////////////UMBRE////////////////////////////


        shadow=sheet4.crop(14*width,8*height,width,height);
        shadowN=sheet4.crop(16*width,8*height,width,height);
        shadowE1=sheet4.crop(17*width,9*height,width,height);
        shadowE2=sheet4.crop(17*width,10*height,width,height);
        shadowS=sheet4.crop(16*width,11*height,width,height);
        shadowW1=sheet4.crop(15*width,9*height,width,height);
        shadowW2=sheet4.crop(15*width,10*height,width,height);
        shadowNE=sheet4.crop(17*width,8*height,width,height);
        shadowNW=sheet4.crop(15*width,8*height,width,height);
        shadowSE=sheet4.crop(17*width,11*height,width,height);
        shadowSW=sheet4.crop(15*width,11*height,width,height);



////////////////////////////////////// FOREST TILESETS ////////////////////////

        forestGrassSurroundedByDirt=new BufferedImage[9];
        forestGrassSurroundedByDirt[0] = sheet4.crop(0, 0, width, height);
        forestGrassSurroundedByDirt[1] = sheet4.crop(width, 0, width, height);
        forestGrassSurroundedByDirt[2] = sheet4.crop(2*width, 0, width, height);
        forestGrassSurroundedByDirt[3] = sheet4.crop(0, height, width, height);
        forestGrassSurroundedByDirt[4] = sheet4.crop(width, height, width, height);
        forestGrassSurroundedByDirt[5] = sheet4.crop(2*width, height, width, height);
        forestGrassSurroundedByDirt[6] = sheet4.crop(0, 2*height, width, height);
        forestGrassSurroundedByDirt[7] = sheet4.crop(width, 2*height, width, height);
        forestGrassSurroundedByDirt[8] = sheet4.crop(2*width, 2*height, width, height);

        forestDesertSurroundedByGrass = new BufferedImage[9];
        forestDesertSurroundedByGrass[0] = sheet4.crop(3*width, 0, width, height);
        forestDesertSurroundedByGrass[1] = sheet4.crop(4*width, 0, width, height);
        forestDesertSurroundedByGrass[2] = sheet4.crop(5*width, 0, width, height);
        forestDesertSurroundedByGrass[3] = sheet4.crop(3*width, height, width, height);
        forestDesertSurroundedByGrass[4] = sheet4.crop(4*width, height, width, height);
        forestDesertSurroundedByGrass[5] = sheet4.crop(5*width, height, width, height);
        forestDesertSurroundedByGrass[6] = sheet4.crop(3*width, 2*height, width, height);
        forestDesertSurroundedByGrass[7] = sheet4.crop(4*width, 2*height, width, height);
        forestDesertSurroundedByGrass[8] = sheet4.crop(5*width, 2*height, width, height);

        forestGrassSurroundedByRoads = new BufferedImage[9];
        forestGrassSurroundedByRoads[0] = sheet4.crop(6*width, 0, width, height);
        forestGrassSurroundedByRoads[1] = sheet4.crop(7*width, 0, width, height);
        forestGrassSurroundedByRoads[2] = sheet4.crop(8*width, 0, width, height);
        forestGrassSurroundedByRoads[3] = sheet4.crop(6*width, height, width, height);
        forestGrassSurroundedByRoads[4] = sheet4.crop(7*width, height, width, height);
        forestGrassSurroundedByRoads[5] = sheet4.crop(8*width, height, width, height);
        forestGrassSurroundedByRoads[6] = sheet4.crop(6*width, 2*height, width, height);
        forestGrassSurroundedByRoads[7] = sheet4.crop(7*width, 2*height, width, height);
        forestGrassSurroundedByRoads[8] = sheet4.crop(8*width, 2*height, width, height);


        forestRoadsA = new BufferedImage[9];
        forestRoadsA[0] = sheet4.crop(9*width, 0, width, height);
        forestRoadsA[1] = sheet4.crop(10*width, 0, width, height);
        forestRoadsA[2] = sheet4.crop(11*width, 0, width, height);
        forestRoadsA[3] = sheet4.crop(9*width, height, width, height);
        forestRoadsA[4] = sheet4.crop(10*width, height, width, height);
        forestRoadsA[5] = sheet4.crop(11*width, height, width, height);
        forestRoadsA[6] = sheet4.crop(9*width, 2*height, width, height);
        forestRoadsA[7] = sheet4.crop(10*width, 2*height, width, height);
        forestRoadsA[8] = sheet4.crop(11*width, 2*height, width, height);

        forestRoadsB = new BufferedImage[9];
        forestRoadsB[0] = sheet4.crop(12*width, 0, width, height);
        forestRoadsB[1] = sheet4.crop(13*width, 0, width, height);
        forestRoadsB[2] = sheet4.crop(14*width, 0, width, height);
        forestRoadsB[3] = sheet4.crop(12*width, height, width, height);
        forestRoadsB[4] = sheet4.crop(13*width, height, width, height);
        forestRoadsB[5] = sheet4.crop(14*width, height, width, height);
        forestRoadsB[6] = sheet4.crop(12*width, 2*height, width, height);
        forestRoadsB[7] = sheet4.crop(13*width, 2*height, width, height);
        forestRoadsB[8] = sheet4.crop(14*width, 2*height, width, height);

        forestRoadsC = new BufferedImage[9];
        forestRoadsC[0] = sheet4.crop(15*width, 0, width, height);
        forestRoadsC[1] = sheet4.crop(16*width, 0, width, height);
        forestRoadsC[2] = sheet4.crop(17*width, 0, width, height);
        forestRoadsC[3] = sheet4.crop(15*width, height, width, height);
        forestRoadsC[4] = sheet4.crop(16*width, height, width, height);
        forestRoadsC[5] = sheet4.crop(17*width, height, width, height);
        forestRoadsC[6] = sheet4.crop(15*width, 2*height, width, height);
        forestRoadsC[7] = sheet4.crop(16*width, 2*height, width, height);
        forestRoadsC[8] = sheet4.crop(17*width, 2*height, width, height);


        forestGrassSurroundedByWater=new BufferedImage[9];
        forestGrassSurroundedByWater[0] = sheet4.crop(0, 3*height, width, height);
        forestGrassSurroundedByWater[1] = sheet4.crop(width, 3*height, width, height);
        forestGrassSurroundedByWater[2] = sheet4.crop(2*width, 3*height, width, height);
        forestGrassSurroundedByWater[3] = sheet4.crop(0, 4*height, width, height);
        forestGrassSurroundedByWater[4] = sheet4.crop(width, 4*height, width, height);
        forestGrassSurroundedByWater[5] = sheet4.crop(2*width, 4*height, width, height);
        forestGrassSurroundedByWater[6] = sheet4.crop(0, 5*height, width, height);
        forestGrassSurroundedByWater[7] = sheet4.crop(width, 5*height, width, height);
        forestGrassSurroundedByWater[8] = sheet4.crop(2*width, 5*height, width, height);

        forestWaterSurroundedByGrass=new BufferedImage[9];
        forestWaterSurroundedByGrass[0] = sheet4.crop(3*width, 3*height, width, height);
        forestWaterSurroundedByGrass[1] = sheet4.crop(4*width, 3*height, width, height);
        forestWaterSurroundedByGrass[2] = sheet4.crop(5*width, 3*height, width, height);
        forestWaterSurroundedByGrass[3] = sheet4.crop(3*width, 4*height, width, height);
        forestWaterSurroundedByGrass[4] = sheet4.crop(4*width, 4*height, width, height);
        forestWaterSurroundedByGrass[5] = sheet4.crop(5*width, 4*height, width, height);
        forestWaterSurroundedByGrass[6] = sheet4.crop(3*width, 5*height, width, height);
        forestWaterSurroundedByGrass[7] = sheet4.crop(4*width, 5*height, width, height);
        forestWaterSurroundedByGrass[8] = sheet4.crop(5*width, 5*height, width, height);

        forestGrassSurroundedByRiver = new BufferedImage[9];
        forestGrassSurroundedByRiver[0] = sheet4.crop(6*width, 3*height, width, height);
        forestGrassSurroundedByRiver[1] = sheet4.crop(7*width, 3*height, width, height);
        forestGrassSurroundedByRiver[2] = sheet4.crop(8*width, 3*height, width, height);
        forestGrassSurroundedByRiver[3] = sheet4.crop(6*width, 4*height, width, height);
        forestGrassSurroundedByRiver[4] = sheet4.crop(7*width, 4*height, width, height);
        forestGrassSurroundedByRiver[5] = sheet4.crop(8*width, 4*height, width, height);
        forestGrassSurroundedByRiver[6] = sheet4.crop(6*width, 5*height, width, height);
        forestGrassSurroundedByRiver[7] = sheet4.crop(7*width, 5*height, width, height);
        forestGrassSurroundedByRiver[8] = sheet4.crop(8*width, 5*height, width, height);


        forestRiversA = new BufferedImage[9];
        forestRiversA[0] = sheet4.crop(9*width, 3*height, width, height);
        forestRiversA[1] = sheet4.crop(10*width, 3*height, width, height);
        forestRiversA[2] = sheet4.crop(11*width, 3*height, width, height);
        forestRiversA[3] = sheet4.crop(9*width, 4*height, width, height);
        forestRiversA[4] = sheet4.crop(10*width, 4*height, width, height);
        forestRiversA[5] = sheet4.crop(11*width, 4*height, width, height);
        forestRiversA[6] = sheet4.crop(9*width, 5*height, width, height);
        forestRiversA[7] = sheet4.crop(10*width, 5*height, width, height);
        forestRiversA[8] = sheet4.crop(11*width, 5*height, width, height);

        forestRiversB = new BufferedImage[9];
        forestRiversB[0] = sheet4.crop(12*width, 3*height, width, height);
        forestRiversB[1] = sheet4.crop(13*width, 3*height, width, height);
        forestRiversB[2] = sheet4.crop(14*width, 3*height, width, height);
        forestRiversB[3] = sheet4.crop(12*width, 4*height, width, height);
        forestRiversB[4] = sheet4.crop(13*width, 4*height, width, height);
        forestRiversB[5] = sheet4.crop(14*width, 4*height, width, height);
        forestRiversB[6] = sheet4.crop(12*width, 5*height, width, height);
        forestRiversB[7] = sheet4.crop(13*width, 5*height, width, height);
        forestRiversB[8] = sheet4.crop(14*width, 5*height, width, height);

        forestRiversC = new BufferedImage[9];
        forestRiversC[0] = sheet4.crop(15*width, 3*height, width, height);
        forestRiversC[1] = sheet4.crop(16*width, 3*height, width, height);
        forestRiversC[2] = sheet4.crop(17*width, 3*height, width, height);
        forestRiversC[3] = sheet4.crop(15*width, 4*height, width, height);
        forestRiversC[4] = sheet4.crop(16*width, 4*height, width, height);
        forestRiversC[5] = sheet4.crop(17*width, 4*height, width, height);
        forestRiversC[6] = sheet4.crop(15*width, 5*height, width, height);
        forestRiversC[7] = sheet4.crop(16*width, 5*height, width, height);
        forestRiversC[8] = sheet4.crop(17*width, 5*height, width, height);

        forestHillSurroundedByGrass = new BufferedImage[9];
        forestHillSurroundedByGrass[0] = sheet4.crop(0, 6*height, width, height);
        forestHillSurroundedByGrass[1] = sheet4.crop(width, 6*height, width, height);
        forestHillSurroundedByGrass[2] = sheet4.crop(2*width, 6*height, width, height);
        forestHillSurroundedByGrass[3] = sheet4.crop(0, 7*height, width, height);
        forestHillSurroundedByGrass[4] = sheet4.crop(width, 7*height, width, height);
        forestHillSurroundedByGrass[5] = sheet4.crop(2*width, 7*height, width, height);
        forestHillSurroundedByGrass[6] = sheet4.crop(0, 8*height, width, height);
        forestHillSurroundedByGrass[7] = sheet4.crop(width, 8*height, width, height);
        forestHillSurroundedByGrass[8] = sheet4.crop(2*width, 8*height, width, height);


        forestHole = new BufferedImage[4];
        forestHole[0] = sheet4.crop(3*width,6*height,width,height);
        forestHole[1] = sheet4.crop(4*width,6*height,width,height);
        forestHole[2] = sheet4.crop(3*width,7*height,width,height);
        forestHole[3] = sheet4.crop(4*width,7*height,width,height);

        forestStairs = sheet4.crop(3*width,8*height,width,height);

        forestCascade = new BufferedImage[3];
        forestCascade[0] = sheet4.crop(4*width,8*height,width,height);
        forestCascade[1] = sheet4.crop(5*width,8*height,width,height);
        forestCascade[2] = sheet4.crop(6*width,8*height,width,height);




        ///////////////////// PLAYER ANIMATIONS ////////////////////

        player_idle = new BufferedImage[10];
        player_idle[0]=sheetAdv.crop(0,0,width,height);
        player_idle[1]=sheetAdv.crop(1*width,0,width,height);
        player_idle[2]=sheetAdv.crop(2*width,0,width,height);
        player_idle[3]=sheetAdv.crop(3*width,0,width,height);
        player_idle[4]=sheetAdv.crop(4*width,0,width,height);
        player_idle[5]=sheetAdv.crop(5*width,0,width,height);
        player_idle[6]=sheetAdv.crop(6*width,0,width,height);
        player_idle[7]=sheetAdv.crop(7*width,0,width,height);
        player_idle[8]=sheetAdv.crop(8*width,0,width,height);
        player_idle[9]=sheetAdv.crop(9*width,0,width,height);

        player_up = new BufferedImage[8];
        player_up[0]=sheetAdv2.crop(0,0,width,height);
        player_up[1]=sheetAdv2.crop(1*width,11*height,width,height);
        player_up[2]=sheetAdv2.crop(2*width,11*height,width,height);
        player_up[3]=sheetAdv2.crop(3*width,11*height,width,height);
        player_up[4]=sheetAdv2.crop(4*width,11*height,width,height);
        player_up[5]=sheetAdv2.crop(5*width,11*height,width,height);
        player_up[6]=sheetAdv2.crop(6*width,11*height,width,height);
        player_up[7]=sheetAdv2.crop(7*width,11*height,width,height);


        player_right = new BufferedImage[8];
        player_right[0]=sheetAdv.crop(0,height,width,height);
        player_right[1]=sheetAdv.crop(1*width,height,width,height);
        player_right[2]=sheetAdv.crop(2*width,height,width,height);
        player_right[3]=sheetAdv.crop(3*width,height,width,height);
        player_right[4]=sheetAdv.crop(4*width,height,width,height);
        player_right[5]=sheetAdv.crop(5*width,height,width,height);
        player_right[6]=sheetAdv.crop(6*width,height,width,height);
        player_right[7]=sheetAdv.crop(7*width,height,width,height);


        player_left = new BufferedImage[8];
        player_left[0]=sheetAdv.crop(0,9*height,width,height);
        player_left[1]=sheetAdv.crop(1*width,9*height,width,height);
        player_left[2]=sheetAdv.crop(2*width,9*height,width,height);
        player_left[3]=sheetAdv.crop(3*width,9*height,width,height);
        player_left[4]=sheetAdv.crop(4*width,9*height,width,height);
        player_left[5]=sheetAdv.crop(5*width,9*height,width,height);
        player_left[6]=sheetAdv.crop(6*width,9*height,width,height);
        player_left[7]=sheetAdv.crop(7*width,9*height,width,height);



    }

}
