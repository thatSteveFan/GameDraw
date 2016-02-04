

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout; 
import java.util.*;
/**
 * A panel that helps draw things on screen. Has a list of GameCommands that it draws.
 * All of the unspecified constructors use a double-buffered panel.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamePanel extends JPanel
{
    List<GameCommand> list;

    /**
     * Constructs a GamePanel.
     */
    public GamePanel()
    {
        super(true);
        list = new ArrayList<GameCommand>();
        setBackground(Color.white);
    }
    
    /**
     * Constructs a GamePanel of given size.
     * @param height the height of this panel.
     * @param width the width of this panel.
     */
    public GamePanel(int height, int width)
    {
        this();
        setSize(height, width);
    }
    
    /**
     * Constructs a GamePanel with the given double buffering setting.
     * @param b wether the panel should be double buffered.
     */
    public GamePanel(boolean b)
    {
        super(b);
        list = new ArrayList<GameCommand>();
        setBackground(Color.white);
    }
    
    public synchronized void paint(Graphics g)
    {
        super.paint(g);
        synchronized(list)
        {
            GameCommand gc;
            for(Iterator<GameCommand> i = list.iterator(); i.hasNext(); gc.doCommand((Graphics2D)g))
            {
                gc = i.next();
            }
        }
    }
    
    /**
     * adds the given command to the list of commands to draw.
     * @param command the command to add.
     */
    public synchronized void addCommand(GameCommand command)
    {
        synchronized(list)
        {
            list.add(command);
        }
    }
    
    /**
     * @return The name of the removed object.
     */
    public synchronized GameCommand remove(GameCommand command)
    {
        synchronized(list)
        {
            list.remove(command);
        }
        return command;
    }
    
    
    

}
