import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * This version of Cinna is to show an animation of Cinna in the Title screen of the game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CinnaTitle extends Actor
{
    
    GreenfootImage[] animate= new GreenfootImage[4];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public void act()
    {
        animateCinna();
    }

    public CinnaTitle()
    {
        for(int i = 0; i<animate.length; i++)
        {
            animate[i] = new GreenfootImage("images/cinna_animate/cinna" + i + ".png");

        }
        
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateCinna()
    {
        // Cinna's animation
        if(animationTimer.millisElapsed()<150)
        {
            return;
        }
        animationTimer.mark();
        setImage(animate[imageIndex]);
        imageIndex = (imageIndex + 1) % animate.length;
    }
}
