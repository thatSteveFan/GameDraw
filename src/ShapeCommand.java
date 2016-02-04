
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Shape;

/**
 * Write a description of class ShapeCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShapeCommand implements GameCommand
{
    private int xPos;
    private int yPos;
    private Shape s;
    private Color c;

    /**
     * Constructor for objects of class ShapeCommand
     */
    public ShapeCommand(Shape s, int x, int y)
    {
        this.s = s;
        xPos = x;
        yPos = y;
    }
    
    public ShapeCommand(Shape s, int x, int y, Color c)
    {
        this.s = s;
        xPos = x;
        yPos = y;
    }
    
    public void doCommand(Graphics2D g)
    {
        g.setColor(c);
    }

    public int getX()
    {
        return xPos;
    }
    
    public int getY()
    {
        return yPos;
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

    public void move(int x, int y)
    {
        xPos += x;
        yPos += y;
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
