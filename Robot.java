import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Robot extends Actor
{
    public enum Blocks{
        TAN,GREY,EMPTY
    }
    public enum Columns{
        LEFT,CENTER,RIGHT
    }
    public static Blocks block1=Blocks.EMPTY;
    public static Blocks block2=Blocks.EMPTY;
    public static int leftStack = 0;
    public static int centerStack = 0;
    public static int rightStack = 0;
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void reload(){
        if(block1==Blocks.EMPTY){
            if(Math.ceil(Math.random()*2)==1){
                block1=Blocks.TAN;
            }else{
                block1=Blocks.GREY;
            }
        }
        if(block2==Blocks.EMPTY){
            if(Math.ceil(Math.random()*2)==1){
                block2=Blocks.TAN;
            }else{
                block2=Blocks.GREY;
            }
        }
    }
    public void placeBlock(Columns column){
        if(block1==Blocks.TAN){
            if(column == Columns.LEFT){
                getWorld().addObject(new TanBlock(),265,158);
                if(leftStack < 4){
                    CryptoBox.box[leftStack][0]=1;
                    leftStack++;
                }
            }else if(column == Columns.RIGHT){
                getWorld().addObject(new TanBlock(),325,158);
                if(rightStack < 4){
                    CryptoBox.box[rightStack][2]=1;
                    rightStack++;
                }
            }else{
                getWorld().addObject(new TanBlock(),295,158);
                if(centerStack < 4){
                    CryptoBox.box[centerStack][1]=1;
                    centerStack++;
                }
            }
        }else if(block1==Blocks.GREY){
            if(column == Columns.LEFT ){
                getWorld().addObject(new GreyBlock(),265,158);
                if(leftStack < 4){
                    CryptoBox.box[leftStack][0]=2;
                    leftStack++;
                }
            }else if(column == Columns.RIGHT){
                getWorld().addObject(new GreyBlock(),325,158);
                if(rightStack < 4){
                    CryptoBox.box[rightStack][2]=2;
                    rightStack++;
                }
            }else{
                getWorld().addObject(new GreyBlock(),295,158);
                if(centerStack < 4){
                    CryptoBox.box[centerStack][1]=2;
                    centerStack++;
                }
            }
        }
        block1 = block2;
        block2 = Blocks.EMPTY;
    }
    public static void reset(){
        leftStack=0;
        centerStack=0;
        rightStack=0;
        if(Math.ceil(Math.random()*2)==1){
            block1=Blocks.TAN;
        }else{
            block1=Blocks.GREY;
        }
        if(Math.ceil(Math.random()*2)==1){
            block2=Blocks.TAN;
        }else{
            block2=Blocks.GREY;
        }
    }
}
