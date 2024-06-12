import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWon extends World
{

    /**
     * Constructor for objects of class YouWon.
     * 
     */
    public YouWon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Instructions youWon = new Instructions("Great Job! You Won!!" , 80);
        addObject(youWon, 300, 100);
        
    }
}
