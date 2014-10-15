


import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Car extends CityObject
{
    public Color c=null;
    public double x=50;
    
     /*
     * @param ,x,y,w,h
     * takes parameters x,y,w,h passes it to its super object CityObject
     * picks a random color for car sets it to variable c
     */
     public Car(double x,double y,double w,double h){
        super(x,y,w,h);
        this.x=x;
        Random r = new Random();
        c=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
    }
    
    /*
     * @param Graphics z
     * @return void
     * draws car based on x, y+450
     */
    public void draw(Graphics z){
        Graphics2D g = (Graphics2D) z;
        g.setColor(c);
        Rectangle2D.Double ov = new Rectangle2D.Double(x,450+y,90,30);
        g.fill(ov);
        g.setColor(Color.BLACK);
        Ellipse2D.Double ov2 = new Ellipse2D.Double(x,465+y,30,30);
        g.fill(ov2);
        g.setColor(Color.BLACK);
        Ellipse2D.Double ov3 = new Ellipse2D.Double(x+60,465+y,30,30);
        g.fill(ov3);
        x+=60;
    }

}
