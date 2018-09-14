import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    public static int health;

    public Health()
    {
        health = 0;
        changeHealth (100);
    } 
    
    public static void changeHealth (int change) 
    {
        health += change;
        
        if (health < 1) { health = 0; }
        if (health > 99) { health = 100; }
    }
    
    public void act() {
        GreenfootImage scr = new GreenfootImage(Integer.toString(health) + "%",20,new Color(130,health*2,50),new Color(0,0,0,0));
        setImage(scr);
    }
}
