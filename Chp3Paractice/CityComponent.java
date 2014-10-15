import java.awt.*;
import javax.swing.*;
import java.util.*;

public class CityComponent extends JComponent{
    
    ArrayList<CityObject> cityObjects= new ArrayList<CityObject>();
    
    /*
     * @parm, none
     * This constructor adds all of my city objects to the rendering list, and 
     * starts my repainting thread
     */
    public CityComponent(){ 
        cityObjects.add(new Rect(0,0,700,700,Color.CYAN));
        cityObjects.add(new Rect(0,350,700,400,Color.GREEN));
        cityObjects.add(new Building(100,100,4,5));
        cityObjects.add(new Building(500,150,2,5));
        cityObjects.add(new Road(0,0,0,0));
        cityObjects.add(new Car(60,25,0,0));
        reDraw rd = new reDraw();
        rd.start();

    }
    /*
     * @Param, Graphics g
     * This method takes all of the items in my city objects list and paints them on the screen
     */
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        for(int i=0;i<cityObjects.size();i++){
           cityObjects.get(i).draw(g2);
        }
        
    }
   /*
    * This is a thread that repaints the screen every one second, and makes a 20% chance 
    * that a new car will be created
    */ 
    class reDraw extends Thread{
        public void run(){
           while(true){
               try{
               Thread.sleep(1000);
            }catch(Exception e){
            }
            Random r = new Random();
            if(r.nextInt(100)>80){
                cityObjects.add(new Car(60,25+r.nextInt(100),0,0));
            }
               repaint();
           }
        }
    }

}
