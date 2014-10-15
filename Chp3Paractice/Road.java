import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class Road extends CityObject
{
     /*
     * @param ,x,y,w,h
     * takes parameters x,y,w,h passes it to its super object CityObject
     */
     public Road(double x,double y,double w,double h){
        super(x,y,w,h);
    }
    
       /*
     * @param g
     * @return void
     * draws road exactly where I want to draw the road, x,y,w,h mean nothing
     * you have no control
     * goodbye
     */
    
    public void draw(Graphics z){
        Graphics2D g = (Graphics2D) z;
        g.setColor(Color.DARK_GRAY);
        Rectangle2D.Double ov = new Rectangle2D.Double(0,500,700,100);
        g.fill(ov);
        for(int i=0;i<10;i++){
        
        }
    }

}
