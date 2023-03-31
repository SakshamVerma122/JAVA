package Swing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import java.awt.FlowLayout;

class Addition extends JFrame implements ActionListener
{
    // Creating textFields to get the input
    // 20 here represents the sixe of input bits
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);

    // Creating a button --> by default button is dumb
    JButton b = new JButton("OK");
    JButton b2 = new JButton("OK");

    // Label
    JLabel l = new JLabel("Result");
    public Addition()
    {
        
        add(t1);
        add(t2);
        add(b);
        add(b2);
        add(l);
        
        // 1st way to add button
        // inside the addActionListener we pass an object of type ActionListener
        // ActionListener is an interface
        // Thus needs to implement ActionListener
        // ActionListener contains a method by the name of actionPerformed
        b.addActionListener(this);

        // 2nd way to use button
        // ActionListener anotherway anonymous class
        // ActionListener extends EventListener
        ActionListener a1 = new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
        
                
                l.setText((num1+num2)+"");
            }
        };

        // 3rd way to use button
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
        
                
                l.setText((num1+num2)+"");
            }
        
        });

        // 4th way

        // This is a repetative code hence it's better to create a template out of it
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        // t1.getText() gives text as an input to convert it to integer
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        // setText takes String as a input
        l.setText((num1+num2)+"");
        
    }
}
public class AddNumber_2 {
    public static void main(String[] args) {

        Addition obj = new Addition();
        
    }
}
