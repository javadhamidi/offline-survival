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
    
    public static void ChangeStory(String text) 
    {
        story = text.split("\">")[1].split("\\[\\[")[0].replace("&#39;","'");
    }
    
    public Story()
    {
        ChangeStory(PlayScreen.storyMapList[1]);
    } 
    
    // don't like using act
    public void act()
    {
        GreenfootImage scr = new GreenfootImage(story,20,Color.GRAY,new Color(0,0,0,0));
        setImage(scr);
    }
}
