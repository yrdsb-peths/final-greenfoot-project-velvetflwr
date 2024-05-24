import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cinna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cinna extends Actor
{
    int gravity = 2;
    int downY = 0;
        public void act()
    {
        setLocation(getX(), getY() + downY);
        downY = gravity + downY;
        
        // Make Cinna jump
        
    }
}
