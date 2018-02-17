import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReloadButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReloadButton extends Robot
{
    boolean Press1 = false;
    boolean Press2 = false;
    /**
     * Act - do whatever the ReloadButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this)){
           reload();
           getWorld().removeObject(getWorld().getObjects(FlippyBoi.class).get(0));
           getWorld().addObject(new FlippyBoi(),500,50);
       }
       if(Greenfoot.isKeyDown("1")){
            if(!Press1){
                Press1 = true;
                reload(Blocks.TAN);
            }
        }else{
            Press1 = false;
       }   
       if(Greenfoot.isKeyDown("2")){
            if(!Press2){
                Press2 = true;
                reload(Blocks.GREY);
            }
        }else{
            Press2 = false;
       }   
    }    
}
