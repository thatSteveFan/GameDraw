
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * WIP
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LineCommand implements GameCommand
{
    private int x1, y1, x2, y2;
    private Color c = Color.black;
    LineCommand(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this .x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void doCommand(Graphics2D g)
    {
        g.setColor(getColor());
        g.drawLine(x1,y1,x2,y2);
    }
    
    @Override
    public int getX()
    {
        return (x1 + x2)/2;
    }
    
    @Override
    public int getY()
    {
        return (y1 + y2)/2;
    }
    
    @Override
    public void setLocation(int x, int y)
    {
        x1 = x;
        y1 = y;
    }
    
    @Override
    public void move(int x, int y)
    {
        x1 += x;
        y1 += y;
        x2 += x;
        y2 += y;
    }
    
    public void setX(int x)
    {
    }
    
    public void setY(int y)
    {
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
