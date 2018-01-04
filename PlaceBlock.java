import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlockSpawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlaceBlock extends Robot
{
    boolean leftPress = false;
    boolean centerPress = false;
    boolean rightPress = false;
    /**
     * Act - do whatever the BlockSpawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("1")){
            if(!leftPress){
                leftPress = true;
                blockCheck(Columns.LEFT);
            }
        }else{
            leftPress = false;
        }    
        if(Greenfoot.isKeyDown("2")){
            if(!centerPress){
                centerPress = true;
                blockCheck(Columns.CENTER);
            }
        }else{
            centerPress = false;
        }
        if(Greenfoot.isKeyDown("3")){
            if(!rightPress){
                rightPress = true;
                blockCheck(Columns.RIGHT);
            }
        }else{
            rightPress = false;
        }
    }    
}
