import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

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
    public static List<List<Object>> storyMap = new ArrayList<List<Object>>();
    public static int mapLength;
    public static int currentRound;
    public static List<Object> currentScene;
    
    public static Health health;
    
    public static boolean isWebMode;
    
    //private static String[] prompts;
    
    public PlayScreen()
    {     
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 640, 1); 
        
        //webMode();
        
        if (isWebMode == false) {
            InputStream storyMapDoc = getClass().getClassLoader().getResourceAsStream("story/Offline Survival.html");
            java.util.Scanner storyMapStream = new java.util.Scanner(storyMapDoc).useDelimiter("\\A");
            String storyMapScanner = storyMapStream.next();
            String[] storyMapList = storyMapScanner.split("pid=\"");
            mapLength = storyMapList.length - 1;
           
            for (int i = 1; i <= mapLength; ++i) {
                storyMap.add(mapPassages(storyMapList[i]));
            }
        }
        
        
        for (int i = 0; i < PlayScreen.mapLength; ++i) {
            if (((String)PlayScreen.storyMap.get(i).get(1)).contains("Welcome")) {
                setScene(Integer.valueOf((String)PlayScreen.storyMap.get(i).get(0)));
                break;
            }
        }
        //System.out.println(storyMap.get(2).get(0));

        prepare();
    }

    private InputStream webMode()
    {
        try {
            URL url = new URL("https://prhps.github.io/twine-repo/Offline%20Survival.html");
    
            // Get the input stream through web connection
            URLConnection connection = url.openConnection();
            InputStream input = connection.getInputStream();
    
            java.util.Scanner storyMapStream = new java.util.Scanner(input).useDelimiter("\\A");
            String storyMapScanner = storyMapStream.next();
            
            if (storyMapScanner.contains("ifid=\"AD13D101-1603-4C5C-8F57-DD0D389F8F94\""))
            {
                //System.out.println(storyMapScanner);
                String[] storyMapList = storyMapScanner.split("pid=\"");
                mapLength = storyMapList.length - 1;
                isWebMode = true;
            } 
            
            else { isWebMode = false; }
            
            return input;
        
        } catch (Exception IOException) {
            isWebMode = false;
            return null;
        }
    }
    
    public void setScene(int scene)
    {
        removeObjects(getObjects(Prompt.class));
            
            scene -= 1;
            currentRound = scene;

            currentScene = storyMap.get(currentRound);

            createPrompts();

            Title.title = ((String)PlayScreen.storyMap.get(currentRound).get(1)).replace("\"","");

            Story.ChangeStory();
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
        try {
            map.add("[[" + passage.split("\\[\\[", 2)[1].split("</tw-passagedata>")[0]);
        } catch (Exception e) {}
        
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
        
        Inventory food = new Inventory("inventory_food.png", -50);
        addObject(food,125,600);
        
        Inventory matches = new Inventory("inventory_matches.png", 0);
        addObject(matches,200,600);
        
        Title title = new Title();
        addObject(title,140,45);
        
        
        
        createPrompts();
    }
    
    public void createPrompts()
    {
        //try {
            String[] prompts = String.valueOf(PlayScreen.currentScene.get(6)).split("\\]\\]");
            
            for (int i = 0; i <= prompts.length - 1; ++i) {
            if (prompts[i].contains("[")) {
                addObject(new Prompt(prompts[i].replace("[", "")),200,420+i*40);
            } 
        }
        //} 
        //catch (Exception IndexOutOfBoundsException) {}
   }
}
