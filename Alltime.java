
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;


public class Alltime {   
          
    JFrame frame= new JFrame();
    JLabel label=new JLabel();

    ImageIcon image=new ImageIcon("img//Alltime.png");


    Alltime(){ 

        label.setIcon(image);
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
       label.setBounds(0, 0, 1600, 800);
       
          frame.setSize(500,500);
          frame.setLayout(null);
          frame.setVisible(true);
          frame.add(label);

     

    }

    
}
