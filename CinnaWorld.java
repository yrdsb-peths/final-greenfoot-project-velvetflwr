import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CinnaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CinnaWorld extends World
{
    GreenfootSound pointSound = new GreenfootSound("points.mp3");
    GreenfootSound music1Sound = new GreenfootSound("music1.mp3");
    int count = 0;
    int cinnaCount = 0;
    int GAP_DISTANCE = 20;
    int score = 0;
    int FIRST_PIPE = 231;
    Score scoreCin = null;
    int highScore = 0;

    /**
     * Constructor for objects of class CinnaWorld.
     * 
     */
    public CinnaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        setPaintOrder(TryAgain.class, GameOver.class, Instructions.class, Logo.class, Cinna.class, Score.class, Tube2.class, Tube.class);
        // Create a Cinnamoroll
        Cinna cinna = new Cinna();
        addObject(cinna, 100, getHeight()/2);
        
        //Create a Logo
        Logo logoObject = new Logo();
        addObject (logoObject, getWidth()/2, getHeight()*1/3);
        
        //Create instructions
        Instructions instructions = new Instructions("Click \u2191 to make Cinna jump!", 30);
        addObject(instructions, getWidth()/2, 250);
        
        Instructions instructions2 = new Instructions("♡ Obtain as many points as you can! ♡", 25);
        addObject(instructions2, getWidth()/2, 290);
        
        //Create score
        scoreCin = new Score(0, 80);
        scoreCin.setValue(0);
        addObject(scoreCin, 50, 50);
    }
    
    
    
    public void act()
    {
        //Background music!
        music1Sound.playLoop();
        count++;
        //Create a tube every 100 pixels
        if(count%100==0)
        {
            buildTube();
        }
        
        //Gain points everytime you pass through a tube   
        if(count>=FIRST_PIPE)
        {
            if(cinnaCount%100==0)
            {
                score++;
                scoreCin.setValue(score);
                pointSound.play();
            }
            cinnaCount++;
        }
    }
    
    public void buildTube()
    {
        //Create two twin tubes for Cinna to pass through, where he dies if he hits them.
        Tube tube = new Tube();
            
        int randomY = Greenfoot.getRandomNumber(200)-50;
        GreenfootImage image = tube.getImage();
        addObject(tube, getWidth(), getHeight()/2 - image.getHeight()/2 - randomY);
            
        Tube2 tube2 = new Tube2();
        GreenfootImage image2 = tube2.getImage();
        addObject(tube2, getWidth(), getHeight()/2 + image2.getHeight()/2 - randomY +200);
    }
    
    public void gameOver()
    {
        //Create gameover. Program starts until you click reset
        GameOver gameover = new GameOver();
        addObject(gameover, getWidth()/2, getHeight()*1/3);
        TryAgain tryagain = new TryAgain("SCORE: " + score, 50);
        addObject(tryagain, 320, 290);
        Greenfoot.stop();
    }
    
}
