import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CryptoboxSim extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CryptoboxSim()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        CryptoboxEdge cryptoboxedge = new CryptoboxEdge();
        addObject(cryptoboxedge,250,205);
        CryptoboxEdge cryptoboxedge2 = new CryptoboxEdge();
        addObject(cryptoboxedge2,280,205);
        CryptoboxEdge cryptoboxedge3 = new CryptoboxEdge();
        addObject(cryptoboxedge3,310,205);
        CryptoboxEdge cryptoboxedge4 = new CryptoboxEdge();
        addObject(cryptoboxedge4,340,205);
        Ground ground = new Ground();
        addObject(ground,300,250);
        Belt belt = new Belt();
        addObject(belt,500,50);
        ReloadButton reloadbutton = new ReloadButton();
        addObject(reloadbutton,500,300);
        PlaceBlock placeblock = new PlaceBlock();
        addObject(placeblock,550,300);
        Robot.reset();
        Key key = new Key();
        addObject(key,100,50);
        CryptoBox cryptobox = new CryptoBox();
        addObject(cryptobox,100,200);
    }
}
