import javax.swing.*;    
import java.awt.event.*;

public class CityScreen extends JFrame{

    CityComponent comp = null;
    /*
     * create JFrame and the paint component and start the program
     */
    public CityScreen(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,700);
        comp = new CityComponent();
        this.add(comp);
        setVisible(true);
    }
    /*
     * initiate the constructor to start program
     */
    public static void main(String args[]){
        new CityScreen();
    }
    
}
