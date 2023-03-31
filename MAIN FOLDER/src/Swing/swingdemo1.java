package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

// swing package belong to javax package
// JFrame is a class that belongs to javax swing 
class Abc extends JFrame{

    //  JFrame follows card layout i.e. when you see a card from the deck of card your are only able to see the top most card all the underlieng cardsthough present are not visible

    /*By default JFrame is Card layout thiugh we can change it after world*/
    public Abc()
    {
       
        // This helps in setting up layout for your app
        // Flow Layout puts all the labels in the middle
        setLayout(new FlowLayout());
        
        // Creates label which we will put on the gui
        JLabel l = new JLabel("Hello World");
        JLabel l2 = new JLabel("Hello World j2");
        
        // Adds the label to the frame
        add(l);

        add(l2);
        
        /*These Functions are present inside the JFrame hence you can just call them without 'this.' as these are inherited drom JFrame to the current class and hence are the member functions*/

        // Will have a dioalog box visible which by default is false
        this.setVisible(true);
        
        // Giving size to the dialog box
        this.setSize(400,400);

        // If you don't include this then after clicking the red cross then though the frame will not be visible still then the programe will be running in the background
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     
}
public class swingdemo1 {

    public static void main(String[] args) {
        
        // We are creating an object 
        Abc obj = new Abc();
        
    }

}
