package Swing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JFrame;
import java.awt.FlowLayout;

// Including things for button
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Calc extends JFrame implements ActionListener{
    JTextField t1 = new JTextField(20);
    JTextField t2 = new JTextField(20);
    JLabel l = new JLabel("Result");
    JButton add = new JButton("Add");
    JButton sub = new JButton("Sub");
    JButton mult = new JButton("Mult");
    JButton div = new JButton("Div");

    public Calc()
    {
        // Setting up the Display all of these are present inside JFrame
        add(t1);
        add(t2);
        add(add);
        add(sub);
        add(mult);
        add(div);
        add(l);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting things up for button
        add.addActionListener(ae ->{
            Integer a = Integer.parseInt(t1.getText());
            Integer b = Integer.parseInt(t2.getText());

            l.setText((a+b)+"");
            
        });
        sub.addActionListener(ae ->{
            Integer a = Integer.parseInt(t1.getText());
            Integer b = Integer.parseInt(t2.getText());

            l.setText((a-b)+"");
            
        });

        mult.addActionListener(this);
        div.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer num1 = Integer.parseInt(t1.getText());
        Integer num2 = Integer.parseInt(t2.getText());
        if(e.getSource() == mult){
            l.setText((num1*num2)+"");
        }
        else if(e.getSource() == div){
            l.setText((num1/num2)+"");
        }
        
    }

    
}
public class AddSub_4 {
    public static void main(String[] args) {
        Calc obj = new Calc();
    }
}
