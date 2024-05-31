import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CinnaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CinnaWorld extends World
{
    int count = 0;
    int GAP_DISTANCE = 20;

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
    
    public void act()
    {
        count++;
        if(count==100)
        {
            //Create pipe
            Tube topPipe = new Tube();
            Tube bottomPipe = new Tube();
            //int randomY = Greenfoot.getRandomNumber(100)-50;
            GreenfootImage image = topPipe.getImage();
            GreenfootImage bottomImage = bottomPipe.getImage();
            addObject(topPipe, bottomPipe.getX(), bottomPipe.getY() - bottomPipe.getImage().getHeight() - GAP_DISTANCE);
            addObject(bottomPipe, getWidth(), getHeight() + bottomPipe.getImage().getHeight()/2 - Greenfoot.getRandomNumber(300));
            count = 0;
        }
    }
    
    public void buildTube()
    {
        Tube top = new Tube();
        Tube bottom = new Tube();
        
        GreenfootImage image = bottom.getImage();
        
        addObject(bottom, getWidth(), getHeight() + bottom.getImage().getHeight()/2 - Greenfoot.getRandomNumber(300));
        
    }
    public void gameOver()
    {
        //Create gameover
        GameOver gameover = new GameOver();
        addObject(gameover, getWidth()/2, getHeight()/2);
    }
}
