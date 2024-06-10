import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvisibleCollider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvisibleCollider extends Actor
{
    /**
     * Act - do whatever the InvisibleCollider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int PIPE_SPEED = 4;
    public void act()
    {
        setLocation(getX() - PIPE_SPEED, getY());
        getImage().setTransparency(0); 
    }
}
