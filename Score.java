import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public Score()
    {
        GreenfootImage newImage = new GreenfootImage(100, 50);
        newImage.setColor(Color.blue);
        setImage(newImage);
    }
    
    public void addScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        newImage.drawString(""+ score, 30, 30);
        setImage(newImage);
    }
}
