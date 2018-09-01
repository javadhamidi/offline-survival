import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

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
    
    public static String[] storyMapList;
    
    public static List<Object> storyMap = new ArrayList<Object>();

    public static String round;
    public static String scene;
    
    
    public PlayScreen()
    {     
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 640, 1); 
        
        InputStream storyMapDoc = getClass().getClassLoader().getResourceAsStream("story/test.html");
        java.util.Scanner storyMapStream = new java.util.Scanner(storyMapDoc).useDelimiter("\\A");
        String storyMapScanner = storyMapStream.next();
        storyMapList = storyMapScanner.split("pid=\"");
        
        for (int i = 1; i <= storyMapList.length - 1; ++i) {
            storyMap.add(mapPassages(storyMapList[i]));
        }
        
        scene = storyMapList[1].split("name=\"")[1].split("\" tags=")[0];
        
        //System.out.println(storyMap.get(0));
        
        prepare();
    }

    public String[] mapPassages(String passage) 
    {
        String PID = passage.split("\" name=\"")[0];
        String NAME = passage.split("name=")[1].split("tags=")[0];
        String TAGS = passage.split("tags=")[1].split("position=")[0];
        String POSITION = passage.split("position=")[1].split("size=")[0];
        String SIZE = passage.split("size=")[1].split(">")[0];
        String TEXT = passage.split("\">")[1].split("\\[\\[")[0].replace("&#39;","'");
        String[] map = {PID, NAME, TAGS, POSITION, SIZE, TEXT};
        return map;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Story story = new Story();
        addObject(story,200,270);
        
        Health health = new Health();
        addObject(health,340,45);
        
        createPrompts();
    }
    
    public void createPrompts()
    {
        
        
        /*
        for (int i = 1; i < storyMapList.length; i++)
        {
            Prompt prompt = new Prompt(i);
            addObject(prompt,200,450);
        }
        */
    }
}
