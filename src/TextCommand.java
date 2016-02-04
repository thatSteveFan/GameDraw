
import java.awt.*;

/**
 * Write a description of class TextCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextCommand implements GameCommand
{
    // instance variables - replace the example below with your own
    private int x;

    private int xPos;
    private int yPos;
    private int s;
    Color c = Color.black;
    String text = "";
    Font f;
    TextCommand(int x, int y, int size)
    {
        xPos = x;
        yPos = y;
        f = new Font("Serif", Font.PLAIN, size);
    }
    
    TextCommand(int x, int y)
    {
        xPos = x;
        yPos = y;
        f = new Font("Serif", Font.PLAIN, 12);
    }

    TextCommand(int x, int y, Font f)
    {
        xPos = x;
        yPos = y;
        this.f = f;
    }
    
    TextCommand(int x, int y, int size, Color color)
    {
        xPos = x;
        yPos = y;
        c = color;
        f = new Font("Serif", Font.PLAIN, size);
    }
    
    TextCommand(String str, int x, int y, int size)
    {
        xPos = x;
        yPos = y;
        f = new Font("Serif", Font.PLAIN, size);
        text = str;
    }
    
    TextCommand(String str, int x, int y)
    {
        xPos = x;
        yPos = y;
        f = new Font("Serif", Font.PLAIN, 12);
        text = str;
    }

    TextCommand(String str, int x, int y, Font f)
    {
        xPos = x;
        yPos = y;
        this.f = f;
        text = str;
    }
    
    TextCommand(String str, int x, int y, int size, Color color)
    {
        xPos = x;
        yPos = y;
        c = color;
        f = new Font("Serif", Font.PLAIN, size);
        text = str;
    }

    @Override
    public void doCommand(Graphics2D g)
    {
        g.setColor(c);
        g.setFont(f);
        g.drawString(text, xPos, yPos);
    }
    
    public void setFont(Font f)
    {
        this.f = f;
    }
    
    
    
    public void setFont(int x)
    {
        f = new Font("Serif", Font.PLAIN, x);
    }
    
    @Override
    public int getX()
    {
        return xPos;
    }
    
    @Override
    public int getY()
    {
        return yPos;
    }
    
    @Override
    public void move(int x, int y)
    {
        xPos += x;
        yPos += y;
    }
    
    public void setX(int x)
    {
        xPos = x;
    }
    
    public void setY(int y)
    {
        yPos = y;
    }
    
    @Override
    public void setLocation(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    
    /**
     * @return the <code>Color</code> of this oval
     */
    @Override
    public Color getColor()
    {
        return c;
    }

    /**
     * @param c the <code>Color</code> to set
     */
    @Override
    public void setColor(Color c)
    {
        this.c = c;
    }
}
