import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{   
    String buttonType;
    static boolean sound;
    
    public Button(String type) 
    { 
        buttonType = type; 
        
        if (buttonType == "PlayButton") {
            GreenfootImage scr = new GreenfootImage("home_play_button.png");
            setImage(scr);
        }
        
        if (buttonType == "VolumeButton") {
            GreenfootImage scr = new GreenfootImage("home_volume_on.png");
            setImage(scr);
            sound = true;
        }
        
        if (buttonType == "InfoButton") {
            GreenfootImage scr = new GreenfootImage("home_info_button.png");
            setImage(scr);
        }
    } 
    
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (buttonType == "PlayButton") {
            if (Greenfoot.mouseClicked(this)) 
            {
                PlayScreen ps = new PlayScreen();
                Greenfoot.setWorld(ps);
                if (sound) { Greenfoot.playSound("Button Release.wav"); }
            }
            
            if (Greenfoot.mousePressed(this)) 
            {
                GreenfootImage scr = new GreenfootImage("home_play_button_pressed.png");
                setImage(scr);
                if (sound) { Greenfoot.playSound("Button Press.wav"); }
            }
        }
        
        if (buttonType == "VolumeButton") {
            if (Greenfoot.mouseClicked(this)) 
            {
                sound = !sound;
                
                if (sound) {
                    GreenfootImage scr = new GreenfootImage("home_volume_on.png");
                    setImage(scr);
                }
                
                if (sound == false) {
                    GreenfootImage scr = new GreenfootImage("home_volume_off.png");
                    setImage(scr);
                }
            }
        }
        
        if (buttonType == "InfoButton") {
            if (Greenfoot.mouseClicked(this)) 
            {
                // change world
            }
        }
    }    
}
