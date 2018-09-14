import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Notification here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notification extends Actor
{
    private String element;
    private GreenfootImage pannel;
    
    public Notification (String type) {
        element = type;
        
        if (element == "pannel")
        {
            pannel = new GreenfootImage("notification.png");
            setImage(pannel);
            /*
            if (getWorld() != null) {
                Notification text = new Notification("Notification Text");
                getWorld().addObject(text,140,45);
                
                Notification button_one = new Notification("Button 1");
                getWorld().addObject(button_one,140,45);
                
                Notification button_two = new Notification("Button 2");
                getWorld().addObject(button_two,140,45);
            }*/
        }
    }
    
    /**
     * Act - do whatever the Notification wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (element == "Notification Text") 
        {
            GreenfootImage scr = new GreenfootImage("qwerty",20,Color.RED,new Color(0,0,0,0));
            setImage(scr);
        }
        /*
        if (element == "Button 1") 
        {
        
        }
        
        if (element == "Button 2") 
        {
        
        }
        
         */
    }    
}
