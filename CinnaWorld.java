import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CinnaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CinnaWorld extends World
{

    /**
     * Constructor for objects of class CinnaWorld.
     * 
     */
    public CinnaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create a Cinnamoroll
        Cinna cinna = new Cinna();
        addObject(cinna, 100, getHeight()/2);
        
    }
    public void gameOver()
    {
        GameOver gameover = new GameOver();
        addObject(gameover, getWidth()/2, getHeight()/2);
    }
}
