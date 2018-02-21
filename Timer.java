import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    boolean init = false;
    long startTime;
    long currentTime;
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!init){
            startTime = System.currentTimeMillis();
            init=!init;
        }else{
            if(Greenfoot.isKeyDown("3")){
                Greenfoot.stop();
            }
            currentTime = System.currentTimeMillis();
            long time = currentTime - startTime;
            GreenfootImage timer = new GreenfootImage("Time:" + (time/1000) + "s " + (time%1000), 25,greenfoot.Color.BLACK,greenfoot.Color.WHITE);
            setImage(timer);
        }
    }    
}
