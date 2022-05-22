

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLights implements ActionListener
{
     JFrame jf;
     JRadioButtonMenuItem r1, r2, r3;
     JLabel L1;
    
     TrafficLights()
     {
          jf = new JFrame();
         
          jf.setSize(350,200);
          jf.setTitle("Traffic Lights");
         
          FlowLayout FL = new FlowLayout(FlowLayout.CENTER,20,20);
          jf.setLayout(FL);
         
          Font f1 = new Font("Arial", Font.BOLD, 50);
          Font f2 = new Font("Verdana", Font.BOLD, 30);
          Dimension d1 = new Dimension(250,50);
          Dimension d2 = new Dimension(95,100);

         
          L1 = new JLabel("",SwingConstants.CENTER);
          L1.setFont(f1);
          L1.setPreferredSize(d1);
                  
          r1 = new JRadioButtonMenuItem("Red");
          r2 = new JRadioButtonMenuItem("Yellow");
          r3 = new JRadioButtonMenuItem("Green");
         
          r1.setFont(f2);
          r2.setFont(f2);
          r3.setFont(f2);
          r1.setPreferredSize(d2);
          r2.setPreferredSize(d2);
          r3.setPreferredSize(d2);

          ButtonGroup bg = new ButtonGroup();
          bg.add(r1);
          bg.add(r2);
          bg.add(r3);
                  
          jf.add(L1);
         
          jf.add(r1);
          jf.add(r2);
          jf.add(r3);
         
          r1.addActionListener(this);
          r2.addActionListener(this);
          r3.addActionListener(this);
             
          jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public void actionPerformed(ActionEvent ae)
     {
          Color c1 = Color.black;
          String str = "";
                  
          if(r1.isSelected())
          {  
              str = "Stop";
              c1 = Color.red;
          }
          if(r2.isSelected())
          {
              str = "Ready";
              c1 = Color.yellow;
          }
          if(r3.isSelected())
          {
              str = "Go";
              c1 = Color.green;
          }
         
             
          L1.setText(str);
          L1.setForeground(c1);   
         
     }
     public static void main(String as[])
     {
          new TrafficLights();
     }
}
