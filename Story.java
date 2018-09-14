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
        story = String.valueOf(PlayScreen.currentScene.get(5));
        
        int rowLength = story.split("").length / 38;
        String[] splitStory = story.split(" ");
        
        for (int i = 0; i >= rowLength; i++) 
        {
            //
        }
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
