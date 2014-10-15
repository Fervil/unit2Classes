import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class CityObject
{
    public double x=0;
    public double y=0;
    public double w=300;
    public double h=300;
    
     /*
     * @param ,x,y,w,h
     * takes parameters x,y,w,h
     * this is a base class that I based all my objects in the city off of.
     */
    public CityObject(double x,double y,double w,double h){
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
    
     /*
     * @param ,g
     * @return void
     * base metod to override for drawing
     */
    public void draw(Graphics z){
        Graphics2D g = (Graphics2D) z;
        //Ellipse2D.Double ov = new Ellipse2D.Double(x+(j/2),y+(j/2),(size-j)+50,(size-j)+50); 
    }

}
