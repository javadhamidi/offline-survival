import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    public static String title;
    
    // don't like using act
    public void act()
    {
        GreenfootImage scr = new GreenfootImage(title,20,Color.GRAY,new Color(0,0,0,0));
        setImage(scr);
    }
}
