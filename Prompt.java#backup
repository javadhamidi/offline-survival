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
        if (promptDetails.contains("-&gt;")) 
        {
            prompt = promptDetails.split("-&gt;")[0];
            destination = promptDetails.split("-&gt;")[1];
        
            for (int i = 0; i < PlayScreen.mapLength; ++i) {
                if (((String)PlayScreen.storyMap.get(i).get(1)).replace("\"", "").contains(destination)) {
                    destinationPid = Integer.valueOf((String)PlayScreen.storyMap.get(i).get(0));
                    break;
                }
            }
            
            GreenfootImage scr = new GreenfootImage(prompt,20,Color.BLUE,new Color(0,0,0,0));
            setImage(scr);
        }
    }

    /**
     * Act - do whatever the Prompt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            //System.out.println(destinationPid);
            ((PlayScreen)getWorld()).setScene(destinationPid);
            Greenfoot.playSound("Mouse Click.wav");
        }
    }    
}
