import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{   
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) 
        {
            PlayScreen ps = new PlayScreen();
            Greenfoot.setWorld(ps);
            Greenfoot.playSound("Button Release.wav");
        }
        
        if (Greenfoot.mousePressed(this)) 
        {
            GreenfootImage scr = new GreenfootImage("home_play_button_pressed.png");
            setImage(scr);
            Greenfoot.playSound("Button Press.wav");
        }
    }    
}
