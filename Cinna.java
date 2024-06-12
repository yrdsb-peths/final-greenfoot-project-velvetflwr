import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cinna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cinna extends Actor
{
    double gravity = .6;
    double downY = 0;
    double boost = -7.0;
    public void act()
    {
        setLocation(getX(), (int)(getY() + downY));
        downY = gravity + downY;
        
           
        // Make Cinna jump
        if(Greenfoot.isKeyDown("up"))
        {
            downY=boost;
        }
        
        //Game Over when Cinna falls out of the world
        if(getY()>getWorld().getHeight())
        {
            gameOverSign();
        }
        
        //Rotation animation
        if(-10<downY&&10>downY)
        {
            setRotation(-20);
        }
        else if(10<downY)
        {
            setRotation(20);
        }
        
        if(getOneIntersectingObject(Tube.class) != null)
        {
            gameOverSign();
        }
        
        if(getOneIntersectingObject(Tube2.class) != null)
        {
            gameOverSign();
        }
        //This makes sure Cinnamoroll can't pass out of the world up
        if ((int)getY() <= 0){
            setLocation(getX(), 0+20);
            downY = 0;
        }  
    }
    
    private void gameOverSign()
    {
        CinnaWorld world = (CinnaWorld) getWorld();
        world.gameOver();
        Greenfoot.stop();
    }
}
