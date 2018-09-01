import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory extends Actor
{
    private int value;
    
    public Inventory(String item, int val) 
    {
        value = val; 
        
        GreenfootImage scr = new GreenfootImage(item);
        setImage(scr);
    }    
    
    /**
     * Act - do whatever the Inventory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) 
        {
            PlayScreen.getHealthIndicator().changeHealth(value);
            getWorld().removeObject(this);
        }
    }    
}
