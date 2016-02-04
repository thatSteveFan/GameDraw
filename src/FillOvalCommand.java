

import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class OvalCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FillOvalCommand implements GameCommand
{
    // instance variables - replace the example below with your own
    private int xPos;
    private int yPos;
    private int h;
    private int w;
     private Color c;
    
    /**
     * draws a filled oval.
     * @param x the x-pos of this oval
     * @param y the y-pos of this oval
     * @param width the width of this oval
     * @param height the height of this oval
     */
    FillOvalCommand(int x, int y, int width, int height)
    {
        xPos = x;
        yPos = y;
        h = height;
        w= width;
        c = Color.black;
    }

    /**
     * draws a filled oval with the given color.
     * @param x the x-pos of this oval
     * @param y the y-pos of this oval
     * @param width the width of this oval
     * @param height the height of this oval
     * @param color the color of this oval
     */
    FillOvalCommand(int x, int y, int width, int height, Color color)
    {
        xPos = x;
        yPos = y;
        h = height;
        w= width;
        c=color;
    }
    
    /**
     * @param g the <code>Graphics2D</code> to draw to
     */
    @Override
    public void doCommand(Graphics2D g)
    {
        g.setColor(getColor());
        g.fillOval(xPos, yPos, w, h);
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
