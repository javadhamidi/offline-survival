import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prompt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prompt extends Actor
{
    private static String[] prompts;
    //private static int destination;
    
    void PromptPrepare(String prompt)
    {
        prompts = prompt.split("\">")[1].split("\\[\\[")[1].split("-&gt;")[0].split("</tw-passagedata>");
        System.out.println(prompts[0]);
        //destination = Integer.parseInt(prompts[0].split("~")[1]);
        
        GreenfootImage scr = new GreenfootImage(prompts[0]);
        
        //GreenfootImage scr = new GreenfootImage(prompts[0].split("~")[0],20,Color.BLUE,new Color(0,0,0,0));
        setImage(scr);
    }
    
    public Prompt(int scene)
    {
        PromptPrepare(PlayScreen.storyMapList[scene]);
        //System.out.println(PlayScreen.storyMapList[scene]);
    }

    /**
     * Act - do whatever the Prompt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /*if (Greenfoot.mouseClicked(this)) {
            PromptPrepare(PlayScreen.storyMapList[destination]);
            Story.ChangeStory(PlayScreen.storyMapList[destination]);
        }*/
    }    
}
