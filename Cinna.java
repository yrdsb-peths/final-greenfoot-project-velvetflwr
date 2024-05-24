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
        
        if(getY()>getWorld().getHeight())
        {
            CinnaWorld world = (CinnaWorld) getWorld();
            world.gameOver();
        }
    }
}
