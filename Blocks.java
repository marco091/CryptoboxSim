import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blocks extends Actor
{
    /**
     * Act - do whatever the Blocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    }    
    public void fall(){
        Ground ground = (Ground)getOneIntersectingObject(Ground.class);
        Blocks blocks = (Blocks)getOneIntersectingObject(Blocks.class);
        if(ground != null){}else if((blocks != null)){}else{
            setLocation(getX(),getY()+4);
        }
    }
}
