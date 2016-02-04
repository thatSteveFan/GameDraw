

import javax.swing.JFrame;
import java.awt.GraphicsConfiguration;
/**
 * A class that makes JFrames using a GamePanel. Essentially a JFrame with a Game panel.
 * They all have EXIT_ON_CLOSE as their default close operation.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameFrame extends JFrame
{
    GamePanel panel;

    /**
     * Makes a new GameFrame and sets it visible.
     */
    public GameFrame()
    {
        this(new GamePanel());
    }
    
    /**
     * Makes a new GameFrame arround the given GamePanel.
     * @param gp the GamePanel to use.
     */
    public GameFrame(GamePanel gp)
    {
        super("GameFrame");
        setVisible(true);
        add(gp);
        panel = gp;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    /**
     * Makes a new GameFrame with the given name as the window title.
     * @param name the name of the widow.
     */
    public GameFrame(String name)
    {
        super(name);
        setVisible(true);
        panel = new GamePanel();
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    /**
     * Makes a new GameFrame of the given size with the given name as the window title.
     * @param name the name of the widow.
     * @param width the width of the window.
     * @param height the height of the widow.
     */
    public GameFrame(String name, int width, int height)
    {
        super(name);
        setVisible(true);
        panel = new GamePanel();
        add(panel);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public GameFrame(GraphicsConfiguration gc)
    {
        super(gc);
        setVisible(true);
    }
    
    public GameFrame(String name, GraphicsConfiguration gc)
    {
        super(name, gc);
        setVisible(true);
    }

    /**
     * @return the panel of this frame.
     */
    public GamePanel getPanel()
    {
        return panel;
    }
    
}
