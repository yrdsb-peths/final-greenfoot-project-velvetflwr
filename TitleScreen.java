import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Logo logoObject = new Logo();
        addObject (logoObject, getWidth()/2, getHeight()*1/3);
        
        //Create instructions
        Instructions instructions = new Instructions("Click \u2191 to make Cinna jump!", 30);
        addObject(instructions, getWidth()/2, 250);
        
        Instructions instructions2 = new Instructions("♡ Obtain as many points as you can! ♡", 25);
        addObject(instructions2, getWidth()/2, 290);
    }
}
