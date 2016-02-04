

import java.awt.Color;
import java.awt.Graphics2D;
/**
 * A interface for drawing figures. 
 * 
 * @author Pramukh Naduthota
 * @version 1.0
 */
public interface GameCommand
{
    
    /**
     * uses the <code> Graphics2D </code> to draw a figure.
     * @param graphics2d The <code> Graphics2D </code> used to draw.
     */
    public abstract void doCommand(Graphics2D graphics2d);
    /**
     * returns a int correspoding to the y-pos of the figure. This may be the corner of 
     * a bounding box, the center of the figure or one side.
     * @return the y-value of this command
     */
    public abstract int getY();
    /**
     * returns a int correspoding to the x-pos of the figure. This may be the corner of 
     * a bounding box, the center of the figure or one side.
     * @return the x-value of this command
     */
    public abstract int getX();
    /**
     * shifts the figure over by the passed in amounts.
     * @param x the number of units to shift the figure right.
     * @param y the number of units to shift the figure down.
     */
    public abstract void move(int x, int y);
    /**
     * sets the location of this figure to the given params.
     * @param x the x-pos to set the figure
     * @param y the y-pos to set the figure
     */
    public abstract void setLocation(int x, int y);
    
    /**
     * sets the color of this to the given <code>Color</code>
     * @param c the new color of this object
     * @throws UnsupportedOperationException if the <code>GameCommand</code> does not support changing color
     */
    public abstract void setColor(Color c) throws UnsupportedOperationException;
    
    /**
     * @return the color of this <code>GameCommand</code>. <code>null</code> if this 
     * <code>GameCommand</code> does not have a color
     */
    public abstract Color getColor();
}
