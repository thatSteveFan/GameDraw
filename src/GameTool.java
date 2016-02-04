
import java.awt.*;
import java.util.*;
/**
 * This is a class based on GPDraw's DrawingTool. I based the code off off that and added a few things.
 * Every draw command requires a String. That String can later be used to refer to that drawn object and move it around.
 * In addition, also adds a <code>setFont(int)</code> method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameTool implements AutoCloseable
{
    private GamePanel panel;
    private Color color;
    //private int xPos;
    //private int yPos;
    //private boolean down;
    //private double direction;
    private HashMap<String, GameCommand> commands = new HashMap<String, GameCommand>();
    Font f = new Font("Serif", Font.PLAIN, 12);
    
    /**
     * Makes a new <a href = "GamePanel.html">GamePanel</a> with a new <a href = "GameFrame.html">GameFrame</a>, then makes a new 
     * GameTool on the panel.
     */
    public GameTool()
    {
        this(new GameFrame(new GamePanel()));
        
    }
    
    
    /**
     * Makes a new GameTool on the panel.
     * @param gp the panel to draw on.
     */
    public GameTool(GamePanel gp)
    {
        panel = gp;
    }
    
    /**
     * Makes a new GameTool on the GamePanel in the given GameFrame.
     * @param gf the GameFrame to pull the GamePanel from.
     */
    public GameTool(GameFrame gf)
    {
        this(gf.getPanel());
        
    }
    
    /**
     * removes all of the GameCommands that this list made from the underlying frame.
     * @see GamePanel#remove(GameCommand)
     */
    @Override
    public void close()
    {
        for(GameCommand gc : commands.values())
        {
            panel.remove(gc);
        }
    }
    
    /**
     * removes all of the GameCommands that this list made from the underlying frame.
     * @see GamePanel#remove(GameCommand)
     */
    public void clear()
    {
        for(GameCommand gc : commands.values())
        {
            panel.remove(gc);
        }
    }
    
    /**
     * adds a new RectangleCommand to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left
     * @param y the y-pos of the top left
     * @param height the Height of the rectangle
     * @param width the width of the rectangle
     * @see #fillRect(String, int, int, int, int)
     * @see RectCommand
     */
    public void drawRect(String name, int x, int y, int height, int width)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with that name in this tool");
        }
        GameCommand command = new RectCommand(x, y, height, width);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new FillRectangleCommand to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left
     * @param y the y-pos of the top left
     * @param height the Height of the rectangle
     * @param width the width of the rectangle
     * @see #drawRect(String, int, int, int, int)
     * @see FillRectCommand
     */
    public void fillRect(String name, int x, int y, int height, int width)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with that name in this tool");
        }
        GameCommand command = new FillRectCommand(x, y, height, width);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new OvalCommand to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left of the bounding box
     * @param y the y-pos of the top left of the bounding box
     * @param height the height of the bounding box
     * @param width the width of the bounding box
     * @see #fillOval(String, int, int, int, int)
     * @see OvalCommand
     */
    public void drawOval(String name, int x, int y, int height, int width)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with that name in this tool");
        }
        GameCommand command = new OvalCommand(x, y, height, width);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new FillOvalCommand to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left of the bounding box
     * @param y the y-pos of the top left of the bounding box
     * @param height the height of the bounding box
     * @param width the width of the bounding box
     * @see #drawOval(String, int, int, int, int)
     * @see FillOvalCommand
     */
    public void fillOval(String name, int x, int y, int height, int width)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with that name in this tool");
        }
        GameCommand command = new FillOvalCommand(x, y, height, width);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new RectangleCommand of the given color to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left
     * @param y the y-pos of the top left
     * @param height the Height of the rectangle
     * @param width the width of the rectangle
     * @param c the color to make the rectangle
     * @see #fillRect(String, int, int, int, int, Color)
     * @see RectCommand
     */
    public void drawRect(String name, int x, int y, int height, int width, Color c)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with that name in this tool");
        }
        GameCommand command = new RectCommand(x, y, height, width, c);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new FillRectangleCommand of the given color to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left
     * @param y the y-pos of the top left
     * @param height the Height of the rectangle
     * @param width the width of the rectangle
     * @param c the color to make the rectangle
     * @see #drawRect(String, int, int, int, int, Color)
     * @see FillRectCommand
     */
    public void fillRect(String name, int x, int y, int height, int width, Color c)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with that name in this tool");
        }
        GameCommand command = new FillRectCommand(x, y, height, width, c);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new OvalCommand of the given color to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left of the bounding box
     * @param y the y-pos of the top left of the bounding box
     * @param height the height of the bounding box
     * @param width the width of the bounding box
     * @param c the color to make the rectangle
     * @see #fillOval(String, int, int, int, int, Color)
     * @see OvalCommand
     */
    public void drawOval(String name, int x, int y, int height, int width, Color c)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with the name"  + name +  " in this tool");
        }
        GameCommand command = new OvalCommand(x, y, height, width, c);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new TextCommand to this tool with the given string as a name. 
     * The baseline of the leftmost character is at position (x, y) in this graphics context's coordinate system.
     * @param name the name of this new command
     * @param str the string to draw
     * @param x the x-pos of the baseline of the leftmost character
     * @param y the y-pos of the baseline of the leftmost character
     */
    public void drawString(String name, String str, int x, int y)
    {
        if(commands.containsKey(name))
        {
            
            throw new IllegalArgumentException("There is already an object with the name "  + name +  " in this tool");
        }
        TextCommand command = new TextCommand(str, x, y, f);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * adds a new FillOvalCommand of the given color to this tool with the given string as a name.
     * @param name the name of this new command
     * @param x the x-pos of the top left of the bounding box
     * @param y the y-pos of the top left of the bounding box
     * @param height the height of the bounding box
     * @param width the width of the bounding box
     * @param c the color of the oval
     * @see #drawOval(String, int, int, int, int, Color)
     * @see FillOvalCommand
     */
    public void fillOval(String name, int x, int y, int height, int width, Color c)
    {
        if(commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is already an object with the name"  + name +  " in this tool");
        }
        GameCommand command = new FillOvalCommand(x, y, height, width, c);
        commands.put(name, command);
        panel.addCommand(command);
        panel.repaint();
    }
    
    /**
     * returns the x-pos of the GameCommand with the given name.
     * @param name the name of the GameCommand that was asked for.
     * @return the x-pos of the GameCommand with the given name.
     * @throws IllegalArgumentException if the key is not in this tool.
     * @see GameCommand#getX()
     */
     public int getX(String name)
    {
        if(!commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is no object with that name in this tool");
        }
        
        return commands.get(name).getX();
        
    }
    
    /**
     * returns the y-pos of the GameCommand with the given name.
     * @param name the name of the GameCommand that was asked for.
     * @return the y-pos of the GameCommand with the given name.
     * @throws IllegalArgumentException if the key is not in this tool.
     */
    public int getY(String name)
    {
        if(!commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is no object with that name in this tool");
        }
        
        return commands.get(name).getY();
        
    }
    
    /**
     * moves the GameCommand with the given name.
     * @param name the name of the GameCommand that was asked for.
     * @param x the number of units to move the command forward by.
     * @param y the number of units to move the command down by.
     * @return the moved command.
     * @throws IllegalArgumentException if the key is not in this tool.
     */
    public GameCommand move(String name, int x, int y)
    {
        if(!commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is no object with that name in this tool");
        }
        
        commands.get(name).move(x, y);
        panel.repaint();
        return commands.get(name);
        
    }
    
    /**
     * sets the location of the GameCommand with the given name to the given cords.
     * @param name the name of the GameCommand that was asked for.
     * @param x the new x-pos of the GameCommand 
     * @param y the new y-pos of the GameCommand 
     * @return the moved command.
     * @throws IllegalArgumentException if the key is not in this tool.
     */
    public GameCommand setLocation(String name, int x, int y)
    {
        if(!commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is no object with that name in this tool");
        }
        
        commands.get(name).setLocation(x, y);
        panel.repaint();
        return commands.get(name);
        
    }
    
    /**
     * removes the GameCommand with that name.
     * @param name the name of the GameCommand that was asked for.
     * @return the removed command.
     * @throws IllegalArgumentException if the key is not in this tool.
     */
    public GameCommand remove(String name) throws IllegalArgumentException
    {
        if(!commands.containsKey(name))
        {
            throw new IllegalArgumentException("There is no object with that name in this tool");
        }
        panel.remove(commands.get(name));
        panel.repaint();
        return commands.remove(name);
        
    }
    
    /**
     * returns the panel of this tool
     * @return the panel that this tool is made of.
     */
    public GamePanel getPanel()
    {
        return panel;
    }
    
    /**
     * sets the font of this tool to the given size.
     * @param n the new size of the font.
     */
    public void setFont(int n)
    {
        f = new Font("Serif", Font.PLAIN, n);
    }
    
    /**
     * returns if this contains the given name.
     * @param s the name to look up.
     * @return if this name is in this table.
     */
    public boolean contains(String s)
    {
        synchronized(commands)
        {
            return commands.containsKey(s);
        }
    }
    
}
