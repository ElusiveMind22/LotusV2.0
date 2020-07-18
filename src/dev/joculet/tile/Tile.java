package dev.joculet.tile;


import dev.joculet.tile.Forest.Cascade.*;
import dev.joculet.tile.Forest.Land.ForestDesertSurroundedByG.*;
import dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRiver.*;
import dev.joculet.tile.Forest.Land.ForestGrassSurroundedByRoads.*;
import dev.joculet.tile.Forest.Land.ForestGrassSurroundedByW.*;
import dev.joculet.tile.Forest.Land.ForestGrassSurroundedByD.*;
import dev.joculet.tile.Forest.Land.ForestHillSurroundedByGrass.*;
import dev.joculet.tile.Forest.*;
import dev.joculet.tile.Forest.Land.ForestHole.*;
import dev.joculet.tile.Forest.Land.ForestRiversA.*;
import dev.joculet.tile.Forest.Land.ForestRiversB.*;
import dev.joculet.tile.Forest.Land.ForestRiversC.*;
import dev.joculet.tile.Forest.Land.ForestRoadsA.*;
import dev.joculet.tile.Forest.Land.ForestRoadsB.*;
import dev.joculet.tile.Forest.Land.ForestRoadsC.*;
import dev.joculet.tile.Forest.Land.ForestWaterSurroundedByG.*;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {


    //STATIC

    public static Tile[] tiles=new Tile[256];
    public static Tile grassTile= new GrassTile(0);
    public static Tile grassTile2= new GrassTile2(1);
    public static Tile grassTile3=new GrassTile3(2);
    public static Tile dirtTile=new DirtTile(3);
    public static Tile rockTile=new RockTile(4);
    public static Tile lavaTile=new LavaTile(5);

    public static Tile flowerTile=new FlowerTile(6);
    public static Tile wheelTile=new WheelTile(7);

    public static Tile forestGrassSurroundedByDirt1=new ForestGrassSurroundedByD1(11);
    public static Tile forestGrassSurroundedByDirt2=new ForestGrassSurroundedByD2(12);
    public static Tile forestGrassSurroundedByDirt3=new ForestGrassSurroundedByD3(13);
    public static Tile forestGrassSurroundedByDirt4=new ForestGrassSurroundedByD4(14);
    public static Tile forestGrassSurroundedByDirt5=new ForestGrassSurroundedByD5(15);
    public static Tile forestGrassSurroundedByDirt6=new ForestGrassSurroundedByD6(16);
    public static Tile forestGrassSurroundedByDirt7=new ForestGrassSurroundedByD7(17);
    public static Tile forestGrassSurroundedByDirt8=new ForestGrassSurroundedByD8(18);
    public static Tile forestGrassSurroundedByDirt9=new ForestGrassSurroundedByD9(19);

    public static Tile forestDesertSurroundedByGrass1=new ForestDesertSurroundedByG1(21);
    public static Tile forestDesertSurroundedByGrass2=new ForestDesertSurroundedByG2(22);
    public static Tile forestDesertSurroundedByGrass3=new ForestDesertSurroundedByG3(23);
    public static Tile forestDesertSurroundedByGrass4=new ForestDesertSurroundedByG4(24);
    public static Tile forestDesertSurroundedByGrass5=new ForestDesertSurroundedByG5(25);
    public static Tile forestDesertSurroundedByGrass6=new ForestDesertSurroundedByG6(26);
    public static Tile forestDesertSurroundedByGrass7=new ForestDesertSurroundedByG7(27);
    public static Tile forestDesertSurroundedByGrass8=new ForestDesertSurroundedByG8(28);
    public static Tile forestDesertSurroundedByGrass9=new ForestDesertSurroundedByG9(29);

    public static Tile forestGrassSurroundedByRoads1=new ForestGrassSurroundedByRoads1(31);
    public static Tile forestGrassSurroundedByRoads2=new ForestGrassSurroundedByRoads2(32);
    public static Tile forestGrassSurroundedByRoads3=new ForestGrassSurroundedByRoads3(33);
    public static Tile forestGrassSurroundedByRoads4=new ForestGrassSurroundedByRoads4(34);
    public static Tile forestGrassSurroundedByRoads5=new ForestGrassSurroundedByRoads5(35);
    public static Tile forestGrassSurroundedByRoads6=new ForestGrassSurroundedByRoads6(36);
    public static Tile forestGrassSurroundedByRoads7=new ForestGrassSurroundedByRoads7(37);
    public static Tile forestGrassSurroundedByRoads8=new ForestGrassSurroundedByRoads8(38);
    public static Tile forestGrassSurroundedByRoads9=new ForestGrassSurroundedByRoads9(39);

    public static Tile roadsA1=new ForestRoadsA1(41);
    public static Tile roadsA2=new ForestRoadsA2(42);
    public static Tile roadsA3=new ForestRoadsA3(43);
    public static Tile roadsA4=new ForestRoadsA4(44);
    public static Tile roadsA5=new ForestRoadsA5(45);
    public static Tile roadsA6=new ForestRoadsA6(46);
    public static Tile roadsA7=new ForestRoadsA7(47);
    public static Tile roadsA8=new ForestRoadsA8(48);
    public static Tile roadsA9=new ForestRoadsA9(49);

    public static Tile roadsB1=new ForestRoadsB1(51);
    public static Tile roadsB2=new ForestRoadsB2(52);
    public static Tile roadsB3=new ForestRoadsB3(53);
    public static Tile roadsB4=new ForestRoadsB4(54);
    public static Tile roadsB5=new ForestRoadsB5(55);
    public static Tile roadsB6=new ForestRoadsB6(56);
    public static Tile roadsB7=new ForestRoadsB7(57);
    public static Tile roadsB8=new ForestRoadsB8(58);
    public static Tile roadsB9=new ForestRoadsB9(59);

    public static Tile roadsC1=new ForestRoadsC1(61);
    public static Tile roadsC2=new ForestRoadsC2(62);
    public static Tile roadsC3=new ForestRoadsC3(63);
    public static Tile roadsC4=new ForestRoadsC4(64);
    public static Tile roadsC5=new ForestRoadsC5(65);
    public static Tile roadsC6=new ForestRoadsC6(66);
    public static Tile roadsC7=new ForestRoadsC7(67);
    public static Tile roadsC8=new ForestRoadsC8(68);
    public static Tile roadsC9=new ForestRoadsC9(69);

    public static Tile forestGrassSurroundedByWater1=new ForestGrassSurroundedByW1(71);
    public static Tile forestGrassSurroundedByWater2=new ForestGrassSurroundedByW2(72);
    public static Tile forestGrassSurroundedByWater3=new ForestGrassSurroundedByW3(73);
    public static Tile forestGrassSurroundedByWater4=new ForestGrassSurroundedByW4(74);
    public static Tile forestGrassSurroundedByWater5=new ForestGrassSurroundedByW5(75);
    public static Tile forestGrassSurroundedByWater6=new ForestGrassSurroundedByW6(76);
    public static Tile forestGrassSurroundedByWater7=new ForestGrassSurroundedByW7(77);
    public static Tile forestGrassSurroundedByWater8=new ForestGrassSurroundedByW8(78);
    public static Tile forestGrassSurroundedByWater9=new ForestGrassSurroundedByW9(79);

    public static Tile getForestGrassSurroundedByWater1=new ForestWaterSurroundedByG1(81);
    public static Tile getForestGrassSurroundedByWater2=new ForestWaterSurroundedByG2(82);
    public static Tile getForestGrassSurroundedByWater3=new ForestWaterSurroundedByG3(83);
    public static Tile getForestGrassSurroundedByWater4=new ForestWaterSurroundedByG4(84);
    public static Tile getForestGrassSurroundedByWater5=new ForestWaterSurroundedByG5(85);
    public static Tile getForestGrassSurroundedByWater6=new ForestWaterSurroundedByG6(86);
    public static Tile getForestGrassSurroundedByWater7=new ForestWaterSurroundedByG7(87);
    public static Tile getForestGrassSurroundedByWater8=new ForestWaterSurroundedByG8(88);
    public static Tile getForestGrassSurroundedByWater9=new ForestWaterSurroundedByG9(89);

    public static Tile forestGrassSurroundedByRiver1=new ForestGrassSurroundedByRiver1(91);
    public static Tile forestGrassSurroundedByRiver2=new ForestGrassSurroundedByRiver2(92);
    public static Tile forestGrassSurroundedByRiver3=new ForestGrassSurroundedByRiver3(93);
    public static Tile forestGrassSurroundedByRiver4=new ForestGrassSurroundedByRiver4(94);
    public static Tile forestGrassSurroundedByRiver5=new ForestGrassSurroundedByRiver5(95);
    public static Tile forestGrassSurroundedByRiver6=new ForestGrassSurroundedByRiver6(96);
    public static Tile forestGrassSurroundedByRiver7=new ForestGrassSurroundedByRiver7(97);
    public static Tile forestGrassSurroundedByRiver8=new ForestGrassSurroundedByRiver8(98);
    public static Tile forestGrassSurroundedByRiver9=new ForestGrassSurroundedByRiver9(99);


    public static Tile riversA1=new ForestRriversA1(101);
    public static Tile riversA2=new ForestRriversA2(102);
    public static Tile riversA3=new ForestRriversA3(103);
    public static Tile riversA4=new ForestRriversA4(104);
    public static Tile riversA5=new ForestRriversA5(105);
    public static Tile riversA6=new ForestRriversA6(106);
    public static Tile riversA7=new ForestRriversA7(107);
    public static Tile riversA8=new ForestRriversA8(108);
    public static Tile riversA9=new ForestRriversA9(109);

    public static Tile riversB1=new ForestRriversB1(111);
    public static Tile riversB2=new ForestRriversB2(112);
    public static Tile riversB3=new ForestRriversB3(113);
    public static Tile riversB4=new ForestRriversB4(114);
    public static Tile riversB5=new ForestRriversB5(115);
    public static Tile riversB6=new ForestRriversB6(116);
    public static Tile riversB7=new ForestRriversB7(117);
    public static Tile riversB8=new ForestRriversB8(118);


    public static Tile riversC1=new ForestRriversC1(121);
    public static Tile riversC2=new ForestRriversC2(122);
    public static Tile riversC3=new ForestRriversC3(123);
    public static Tile riversC4=new ForestRriversC4(124);
    public static Tile riversC5=new ForestRriversC5(125);
    public static Tile riversC6=new ForestRriversC6(126);
    public static Tile riversC7=new ForestRriversC7(127);
    public static Tile riversC8=new ForestRriversC8(128);
    public static Tile riversC9=new ForestRriversC9(129);


    public static Tile forestHillSurroundedByGrass1=new ForestHillSurroundedByGrass1(131);
    public static Tile forestHillSurroundedByGrass2=new ForestHillSurroundedByGrass2(132);
    public static Tile forestHillSurroundedByGrass3=new ForestHillSurroundedByGrass3(133);
    public static Tile forestHillSurroundedByGrass4=new ForestHillSurroundedByGrass4(134);
    public static Tile forestHillSurroundedByGrass5=new ForestHillSurroundedByGrass5(135);
    public static Tile forestHillSurroundedByGrass6=new ForestHillSurroundedByGrass6(136);
    public static Tile forestHillSurroundedByGrass7=new ForestHillSurroundedByGrass7(137);
    public static Tile forestHillSurroundedByGrass8=new ForestHillSurroundedByGrass8(138);
    public static Tile forestHillSurroundedByGrass9=new ForestHillSurroundedByGrass9(139);



    public static Tile forestCascade1= new ForestCascade1(146);
    public static Tile forestCascade2= new ForestCascade2(147);
    public static Tile forestCascade3= new ForestCascade3(148);
    public static Tile forestStairs = new ForestStairs(145);

    public static Tile forestHole1= new ForestHole1(141);
    public static Tile forestHole2= new ForestHole2(142);
    public static Tile forestHole3= new ForestHole3(143);
    public static Tile forestHole4 = new ForestHole4(144);

    public static Tile test=new TestTile(200);
    ////CLASS


    public static final int TILEWIDTH=64,TILEHEIGHT=64;
    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture,int id)
    {
        this.texture=texture;
        this.id=id;

        tiles[id]=this;
    }

    public void tick()
    {

    }

    public void render(Graphics g, int x, int y)
    {
        g.drawImage(texture,x,y,TILEWIDTH,TILEHEIGHT,null);


    }

    public boolean isSolid()
    {
        return false;
    }

    public int getId() {
        return id;
    }
}
