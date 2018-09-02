import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prompt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prompt extends Actor
{
    private String prompt;
    private String destination;
    private int destinationPid;
    
    public Prompt(String promptDetails)
    {
        prompt = promptDetails.split("-&gt;")[0];
        destination = promptDetails.split("-&gt;")[1];
        
        for (int i = 0; i <= PlayScreen.storyMap.size() - 1; ++i) {
            if (PlayScreen.storyMap.get(i).get(1) == destination) {
                destinationPid = Integer.valueOf((String)PlayScreen.storyMap.get(i).get(0));
                break;
            }
        }
        
        // need to convert destination name into PID
        
        GreenfootImage scr = new GreenfootImage(prompt,20,Color.BLUE,new Color(0,0,0,0));
        setImage(scr);
    }

    /**
     * Act - do whatever the Prompt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            //fix!!!
            //((PlayScreen)getWorld()).setScene(1);
        }
    }    
}
