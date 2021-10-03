

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class News implements ActionListener{     
    JFrame frame= new JFrame();
    JLabel label=new JLabel();
    JLabel label1=new JLabel();


    JButton button= new JButton();
    JButton button2= new JButton();
    JButton button3= new JButton();

    ImageIcon image=new ImageIcon("img//stand.png"); 
    ImageIcon image2=new ImageIcon("img//venue.png"); 
    ImageIcon image3=new ImageIcon("img//achal.png"); 


    News(){ 
         
    button.setBounds(600, 300, 250, 150);
    button.addActionListener(this);
    button.setFocusable(false);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setFont(new Font("Comic Sans",Font.BOLD,25));
    button.setForeground(Color.blue);
    button.setIcon(image);


    button2.setBounds(600, 500, 250, 150);
    button2.addActionListener(this);
    button2.setFocusable(false);
    button2.setHorizontalTextPosition(JButton.CENTER);
    button2.setFont(new Font("Comic Sans",Font.BOLD,25));
    button2.setForeground(Color.DARK_GRAY);
    button2.setIcon(image2);


    button3.setBounds(600, 100, 250, 150);
    button3.addActionListener(this);
    button3.setText("T20 GOATS");
    button3.setFocusable(false);
    button3.setHorizontalTextPosition(JButton.CENTER);
    button3.setFont(new Font("Comic Sans",Font.BOLD,25));
    button3.setForeground(Color.darkGray);
    button3.setIcon(image3);






          frame.setSize(500,500);
          frame.setLayout(null);
          frame.setVisible(true);
          frame.add(button);
          frame.add(button2);
          frame.add(button3);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==button){ 
            Stand abc = new Stand();
    
        } else if(e.getSource()==button2){ 
              Venue rahu = new Venue();
        }   else if(e.getSource()==button3){ 
            Alltime chuth= new Alltime();
    }
    
    }
}