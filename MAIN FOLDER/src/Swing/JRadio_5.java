package Swing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFrame;

import java.awt.FlowLayout;

class RadioDemo extends JFrame{
    JTextField t1;
        JButton b;
        JRadioButton r1,r2;
        JLabel l;
    public RadioDemo()
    {
        t1 = new JTextField(15);
        b = new JButton("Ok");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l =  new JLabel("Greeting");
        
        // By default radio doesn't work for making it work we use the below code
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //  Get the label text in Java
        String labelText = l.getText();
        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(l);

        // Ading features to the button
        b.addActionListener(ae ->{
            String name = t1.getText();

            if(r1.isSelected()){
                name = "Mr "+ name;
            }
            else{
                name = "Ms "+ name;
            }

            l.setText(name);
        });
        setLayout(new FlowLayout());
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class JRadio_5 {
    public static void main(String[] args) {
        RadioDemo r1 = new RadioDemo();
    }
}
