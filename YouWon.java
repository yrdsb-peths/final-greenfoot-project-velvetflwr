import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWon extends World
{

    GreenfootSound yaySound = new GreenfootSound("yay.mp3");
    public YouWon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //adding you won!!!
        Instructions youWon = new Instructions("Great Job! You Won!!" , 40);
        addObject(youWon, 400, 50);
        
        Instructions again = new Instructions("Play AGAIN?" , 30);
        addObject(again, 500, 100);
        
        
    }
    
    public void act()
    {
        yaySound.play();
        Greenfoot.stop();
    }
}
