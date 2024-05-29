import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cinna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cinna extends Actor
{
    double gravity = .8;
    double downY = 0;
    double boost = -8.0;
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
            CinnaWorld world = (CinnaWorld) getWorld();
            world.gameOver();
            Greenfoot.stop();
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
            CinnaWorld world = (CinnaWorld) getWorld();
            world.gameOver();
            Greenfoot.stop();
        }
    }
}
