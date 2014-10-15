import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Building extends CityObject{
     /*
     * @param ,x,y,w,h
     * takes parameters x,y,w,h passes it to its super object CityObject
     */
     public Building(double x,double y,double w,double h){
        super(x,y,w,h);
    }
     /*
     * @param ,x,y,w,h
     * @return void
     * draw building based on x,y,w,h
     * w,h  corrospond to the size of the building and the number of windows
     * **sidenote gave up on indentation
     */
    public void draw(Graphics z){
       Graphics2D g = (Graphics2D) z;
       g.setColor(Color.GRAY);
       Rectangle2D.Double ov = new Rectangle2D.Double(x-30,y-30,(50*w)+30,(60*h)+30);
       g.fill(ov);
       Random r = new Random();
       
     
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                  if(r.nextInt(2)==0){
       g.setColor(Color.YELLOW);
      }else{
          g.setColor(Color.LIGHT_GRAY);
        }
               Rectangle2D.Double ov2 = new Rectangle2D.Double((j*50)+x,(i*60)+y,30,30);
               g.fill(ov2);
           }
       }
       
    }

}
