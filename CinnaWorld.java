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
        
        //Create score
        Score score = new Score();
        addObject(score, 100, 100);
        
    }
    
    public void act()
    {
        count++;
        if(count%100==0)
        {
            //Create pipe
            Tube tube = new Tube();
            
            int randomY = Greenfoot.getRandomNumber(200)-50;
            GreenfootImage image = tube.getImage();
            addObject(tube, getWidth(), getHeight()/2 - image.getHeight()/2 - randomY);
            
            Tube2 tube2 = new Tube2();
            GreenfootImage image2 = tube2.getImage();
            addObject(tube2, getWidth(), getHeight()/2 + image2.getHeight()/2 - randomY +200);
        }
    }
    
    public void gameOver()
    {
        //Create gameover
        GameOver gameover = new GameOver();
        addObject(gameover, getWidth()/2, getHeight()/2);
    }
}
