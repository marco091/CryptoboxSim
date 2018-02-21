import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CryptoBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CryptoBox extends Actor
{
    public static int box[][] = new int[4][3]; //box is 4 rows by 3 columns
    /**
     * Act - do whatever the CryptoBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        String matrix = "";
        for(int i = 0; i < box.length; i++){
            for(int j = 0; j < box[i].length;j++){
                matrix = matrix + box[3-i][j];
            }
            matrix = matrix + "\n";
        }
        GreenfootImage box = new GreenfootImage("Box Matrix\n" + matrix,25,Color.BLACK,Color.WHITE);
        setImage(box);
    }    
}
