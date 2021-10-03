
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;



public class Info {  
        
    JFrame frame= new JFrame();
    JLabel label=new JLabel();
    JLabel label1=new JLabel();

    ImageIcon image=new ImageIcon("img//wipak.png"); 
    ImageIcon image2=new ImageIcon("img//wipks.png"); 


    Info(){ 
        
        label.setIcon(image);
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
       label.setBounds(0, 0, 1500, 750);



       label1.setIcon(image2);
       label1.setBounds(900, 0, 500, 500);
       
          frame.setSize(500,500);
          frame.setLayout(null);
          frame.setVisible(true);
          frame.add(label);
          frame.add(label1);

    }
    
}
