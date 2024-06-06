import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tube2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tube2 extends Actor
{
    int PIPE_SPEED = 4;
    public void act()
    {
        setLocation(getX() - PIPE_SPEED, getY());
    }
}
