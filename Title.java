import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    public String mainTitle = "";
    public static String title;
    
    // don't like using act
    public void act()
    {

        if (title.contains("Day") && title.contains(":"))
        {
            String dayTitle = title;
            title = dayTitle.split(":")[1];
            mainTitle = dayTitle.split(":")[0] + ":";
        }
        GreenfootImage subheading = new GreenfootImage("\n" + title,20,Color.GRAY,new Color(0,0,0,0));
        setImage(subheading);
        
        GreenfootImage heading = new GreenfootImage(mainTitle, 20,Color.GRAY,new Color(0,0,0,0));
        subheading.drawImage(heading, 0, 0);
        
        
        
        
        
        
    }
}
