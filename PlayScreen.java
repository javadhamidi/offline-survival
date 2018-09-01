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
    public static Health health;
    
    public static Health getHealthIndicator() { return health; }
    
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
        
        System.out.println(storyMap.get(1));
        
        prepare();
    }

    public List<Object> mapPassages(String passage) 
    {
        List<Object> map = new ArrayList<Object>();
        map.add(passage.split("\" name=\"")[0]);
        map.add(passage.split("name=")[1].split("tags=")[0]);
        map.add(passage.split("tags=")[1].split("position=")[0]);
        map.add(passage.split("position=")[1].split("size=")[0]);
        map.add(passage.split("size=")[1].split(">")[0]);
        map.add(passage.split("\">")[1].split("\\[\\[")[0].replace("&#39;","'"));
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
        
        health = new Health();
        addObject(health,340,45);
        
        Inventory water = new Inventory("inventory_water.png", 10);
        addObject(water,50,600);
        
        Inventory food = new Inventory("inventory_food.png", 10);
        addObject(food,125,600);
        
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
