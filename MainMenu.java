import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    GreenfootSound music = new GreenfootSound("Marimba Boy.wav");

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 640, 1); 
        
        if (PlayScreen.isWebMode == false)
        {
            GreenfootImage text = new GreenfootImage(" Connection could not be established ", 15, Color.GRAY, new Color(0,0,0,100));
            getBackground().drawImage(text, 180, 620);
        }
        
        prepare();
    }

    public void started()
    {
        music.playLoop();
    }

    public void stopped()
    {
        music.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playbutton = new PlayButton();
        addObject(playbutton,200,440);
    }
}
