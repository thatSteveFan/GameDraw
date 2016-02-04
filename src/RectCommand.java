

import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class OvalCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectCommand implements GameCommand
{
    // instance variables - replace the example below with your own
    private int xPos;
    private int yPos;
    private int h;
    private int w;
    Color c = Color.black;
    RectCommand(int x, int y, int width, int height)
    {
        xPos = x;
        yPos = y;
        h = height;
        w= width;
    }
    
    RectCommand(int x, int y, int width, int height, Color color)
    {
        xPos = x;
        yPos = y;
        h = height;
        w= width;
        c = color;
    }

    public void doCommand(Graphics2D g)
    {
        g.setColor(c);
        g.drawRect(xPos, yPos, w, h);
    }
    
    public int getX()
    {
        return xPos;
    }
    
    public int getY()
    {
        return yPos;
    }
    
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