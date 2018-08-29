import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.InputStream;

/**
 * Write a description of class PlayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayScreen extends World
{

    /**
     * Constructor for objects of class PlayScreen.
     * 
     */

    InputStream storyMapDoc = getClass().getClassLoader().getResourceAsStream("story/Offline Survival.html");
    java.util.Scanner storyMapStream = new java.util.Scanner(storyMapDoc).useDelimiter("\\A");
    String storyMap = storyMapStream.next();
    String[] storyMapList = storyMap.split("pid=\"");

    public static String round;
    public static String scene;

    public static String story;
    public static String[] prompts;

    public PlayScreen()
    {     
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 640, 1); 

        System.out.println(storyMapList[1].split("\">")[1]);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Story story = new Story();
        addObject(story,181,450);
        Prompt prompt = new Prompt();
        addObject(prompt,176,370);
    }
}
