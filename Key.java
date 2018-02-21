import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Robot
{
    public enum Keys{
        LEFT,CENTER,RIGHT,UNKNOWN
    }
    public Keys key=Keys.UNKNOWN;
    public Key(){
        while(key==Keys.UNKNOWN){
            int rand = (int) Math.ceil(Math.random()*3);
            if(rand == 1){
                key=Keys.LEFT;
            }else if(rand== 2){
                key=Keys.CENTER;
            }else if(rand== 3){
                key=Keys.RIGHT;
            }
        }
        GreenfootImage keys = new GreenfootImage("Key: " + key,25,greenfoot.Color.BLACK,greenfoot.Color.WHITE);
        setImage(keys);
    }
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
