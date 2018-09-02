import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends Actor
{
    public static String story;
    
    public static void ChangeStory() 
    {
        //story = text.split("\">")[1].split("\\[\\[")[0].replace("&#39;","'");
        //story = PlayScreen.currentScene[6];
        //System.out.println(story);
        //?
        story = String.valueOf(PlayScreen.currentScene.get(5));
    }
    
    public Story()
    {
        ChangeStory();
    } 
    
    // don't like using act
    public void act()
    {
        GreenfootImage scr = new GreenfootImage(story,20,Color.GRAY,new Color(0,0,0,0));
        setImage(scr);
    }
}
