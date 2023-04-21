import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyFirstFrame 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
      

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First Frame");
        

        Container c = frame.getContentPane();
        c.setLayout(null);
        
        JLabel label1 = new JLabel("Username");
        label1.setBounds(50, 50, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(50, 100, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);

        JButton btn = new JButton("Login");
        btn.setBounds(150,150,90,40);



        c.add(label1);
        c.add(t1);
        c.add(label2);
        c.add(t2);
        c.add(btn);
        frame.setSize(400,300);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setVisible(true);
        //Fix the Size of the JFrame  
        frame.setResizable(false);


    
    }
}
