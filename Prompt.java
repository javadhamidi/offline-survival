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
    
    void PromptPrepare()
    {
        //prompts = prompt.split("\">")[1].split("\\[\\[")[1].split("-&gt;")[0].split("</tw-passagedata>");
        //System.out.println(prompts[0]);
        //destination = Integer.parseInt(prompts[0].split("~")[1]);
        
        //prompts = String.valueOf(PlayScreen.currentScene.get(6)).replace("[[", "").split("\\]\\]");
        
        
        //currentScene = currentSceneString.substring(1, currentSceneString.length()-1).split(",");
        
        //GreenfootImage scr = new GreenfootImage(prompts[0].split("-&gt;")[0],20,Color.BLUE,new Color(0,0,0,0));
        //setImage(scr);
    }
    
    public Prompt(String promptDetails)
    {
        prompt = promptDetails.split("-&gt;")[0];
        destination = promptDetails.split("-&gt;")[1];
        
        GreenfootImage scr = new GreenfootImage(prompt,20,Color.BLUE,new Color(0,0,0,0));
        setImage(scr);
        
        //PromptPrepare();
        //PromptPrepare(PlayScreen.storyMapList[scene]);
        //System.out.println(PlayScreen.storyMapList[scene]);
    }

    /**
     * Act - do whatever the Prompt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //GreenfootImage scr = new GreenfootImage(prompts[0]);
        
        
        //GreenfootImage scr = new GreenfootImage(prompts[0].split("~")[0],20,Color.BLUE,new Color(0,0,0,0));
        
        /*if (Greenfoot.mouseClicked(this)) {
            PromptPrepare(PlayScreen.storyMapList[destination]);
            Story.ChangeStory(PlayScreen.storyMapList[destination]);
        }*/
    }    
}
