import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cinna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cinna extends Actor
{
    int gravity = 1;
    int downY = 0;
        public void act()
    {
        setLocation(getX(), (int)(getY() + downY));
        downY = gravity + downY;
        
        // Make Cinna jump
        if(Greenfoot.isKeyDown("up"))
        {
            downY=-8;
        }
    }
}
