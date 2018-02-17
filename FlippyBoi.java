import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Belt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlippyBoi extends Robot
{
    /**
     * Act - do whatever the Belt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage blocks = new GreenfootImage("Block 2:" + block2 + "\nBlock 1:" + block1, 25,greenfoot.Color.BLACK,greenfoot.Color.WHITE);
        setImage(blocks);
    }    
}
