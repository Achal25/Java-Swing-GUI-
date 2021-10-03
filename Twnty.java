
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;

public class Twnty { 
       
    JFrame frame= new JFrame();
    JLabel label=new JLabel();

    ImageIcon image2=new ImageIcon("img//t20i.png");



    Twnty(){
        label.setIcon(image2);
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
       label.setBounds(0, 0, 1300, 700);
       
          frame.setSize(420,420);
          frame.setLayout(null);
          frame.setVisible(true);
          frame.add(label);
        

    }
     
    
}
