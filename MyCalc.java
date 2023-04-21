// This is a calculator program
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

class Myframe1 extends JFrame implements ActionListener 
{
    private java.awt.Container c;
    private JTextField t;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,beq,bdel,bdec,badd,bsub,bmul,bdiv,bclr;
    static double a=0,b=0,result=0;
    static int operator=0;
    Myframe1()
    {
        
        setTitle("Simple Calculator");
        setSize(310,420);
        setLocation(20,20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        

         c = getContentPane();
         c.setLayout(null);

         t = new JTextField();
         t.setBounds(40,40,215,50);
         t.setFont(new Font("Verdana", Font.PLAIN, 20));
         c.add(t);


         b1 = new JButton("1");
         b1.setFont(new Font("Verdana", Font.PLAIN, 20));

         b2 = new JButton("2");
         b2.setFont(new Font("Verdana", Font.PLAIN, 20));

         b3 = new JButton("3");
         b3.setFont(new Font("Verdana", Font.PLAIN, 20));

         b4 = new JButton("4");
         b4.setFont(new Font("Verdana", Font.PLAIN, 20));

         b5 = new JButton("5");
         b5.setFont(new Font("Verdana", Font.PLAIN, 20));

         b6 = new JButton("6");
         b6.setFont(new Font("Verdana", Font.PLAIN, 20));

         b7 = new JButton("7");
         b7.setFont(new Font("Verdana", Font.PLAIN, 20));

         b8 = new JButton("8");
         b8.setFont(new Font("Verdana", Font.PLAIN, 20));

         b9 = new JButton("9");
         b9.setFont(new Font("Verdana", Font.PLAIN, 20));

         b0 = new JButton("0");
         b0.setFont(new Font("Verdana", Font.PLAIN, 20));

         badd = new JButton("+");
         badd.setFont(new Font("Verdana", Font.PLAIN, 20));

         bsub = new JButton("-");
         bsub.setFont(new Font("Verdana", Font.PLAIN, 20));

         bdiv = new JButton("/");
         bdiv.setFont(new Font("Verdana", Font.PLAIN, 20));

         bmul = new JButton("*");
         bmul.setFont(new Font("Verdana", Font.PLAIN, 20));

         bdec = new JButton(".");
         bdec.setFont(new Font("Verdana", Font.PLAIN, 20));

         bdel = new JButton("Delete");
         bdel.setFont(new Font("Arial", Font.PLAIN, 20));

         bclr = new JButton("Clear");
         bclr.setFont(new Font("Arial", Font.PLAIN, 20));

         beq = new JButton("=");
         beq.setFont(new Font("Verdana", Font.PLAIN, 20));

         b7.setBounds(40,100,50,40);
         b8.setBounds(95,100,50,40);
         b9.setBounds(150,100,50,40);
         bdiv.setBounds(204,100,50,40);

         b4.setBounds(40,150,50,40);
         b5.setBounds(95,150,50,40);
         b6.setBounds(150,150,50,40);
         bmul.setBounds(204,150,50,40);

         b1.setBounds(40,200,50,40);
         b2.setBounds(95,200,50,40);
         b3.setBounds(150,200,50,40);
         bsub.setBounds(204,200,50,40);

         bdec.setBounds(40,250,50,40);
         b0.setBounds(95,250,50,40);
         beq.setBounds(150,250,50,40);
         badd.setBounds(204,250,50,40);

         bdel.setBounds(40,300,104,40);
         bclr.setBounds(148,300,105,40);

         c.add(b1);
         c.add(b2);
         c.add(b3);
         c.add(b4);
         c.add(b5);
         c.add(b6);
         c.add(b7);
         c.add(b8);
         c.add(b9);
         c.add(b0);
         c.add(badd);
         c.add(bsub);
         c.add(bdiv);
         c.add(bmul);
         c.add(bdec);
         c.add(bdel);
         c.add(bclr);
         c.add(beq);
    

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bdec.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        beq.addActionListener(this);
        


         setVisible(true);

    }
    // public void actionPerformed(ActionEvent e)
    // {
            

    // }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) 
    {
        if(e.getSource()==bclr)
        {
            t.setText("");
        }
        if(e.getSource()==bdel)
        {
            String s = t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            {
                t.setText(t.getText()+s.charAt(i));
            }
        }
        if(e.getSource()==b1)
        {
            t.setText(t.getText().concat("1"));
        }
        if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
        }
        if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
        }
        if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
        }
        if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
        }
        if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
        }
        if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
        }
        if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));
        }
        if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
        }
        if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
        }
        if(e.getSource()==bdec)
        {
            t.setText(t.getText().concat("."));
        }
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
            switch(operator)
            {
               case 1: 
               result=a+b;
               break;
               case 2: 
               result=a-b;
               break;
               case 3: 
               result=a*b;
               break;
               case 4: 
               result=a/b;
               break;
            }
              
            t.setText(""+result);
        }

       

        
    }
}

public class MyCalc 
{
    public static void main(String[] args) 
    {
        Myframe1 frame = new Myframe1();
        
    }
}
