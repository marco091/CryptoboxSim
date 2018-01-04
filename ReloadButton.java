import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReloadButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReloadButton extends Robot
{
    /**
     * Act - do whatever the ReloadButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
           reload();
           getWorld().removeObject(getWorld().getObjects(Belt.class).get(0));
           getWorld().addObject(new Belt(),500,50);
       }
    }    
}
