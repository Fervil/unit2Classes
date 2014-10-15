import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Rect extends CityObject{
    Color c = null;
    /*
     * @param ,x,y,w,h
     * takes parameters x,y,w,h passes it to its super object CityObject
     * also takes color
     */
     public Rect(double x,double y,double w,double h,Color c){
        super(x,y,w,h);
        this.c=c;
    }
    
    /*
     * @param, z
     * @return void
     * This takes x,y,w,h and draws a rectangle based on that and sets the color based on "c"
     */
    public void draw(Graphics z){
        Graphics2D g = (Graphics2D) z;
        g.setColor(c);
        Rectangle2D.Double ov = new Rectangle2D.Double(x,y,w,h);
        g.fill(ov);
    }

}
