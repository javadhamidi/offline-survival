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
        
        GreenfootImage icon = new GreenfootImage(item);
        setImage(icon);
        
        GreenfootImage text = new GreenfootImage(((value > 0) ? "+" + Integer.toString(value) : Integer.toString(value)), 17, Color.GRAY, new Color(0,0,0,0));
        icon.drawImage(text, 0, 34);
    }    
    
    /**
     * Act - do whatever the Inventory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) 
        {
            Notification notification = new Notification("pannel");
            getWorld().addObject(notification,195,300);
        
            ((PlayScreen)getWorld()).health.changeHealth(value);
            Greenfoot.playSound("Item Pickup.wav");
            getWorld().removeObject(this);
        }
    }    
}
