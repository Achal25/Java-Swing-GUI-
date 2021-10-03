import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.color.*;

public class gui implements ActionListener  {  
    JButton button= new JButton();
    JButton button2= new JButton();
    JButton button3= new JButton();
    JButton button4= new JButton();
    JButton button5= new JButton();
    JButton button6= new JButton();
    JButton button7= new JButton();
    JLabel label = new JLabel();
    JFrame frame = new JFrame(); 



    ImageIcon image2=new ImageIcon("img//pink.jpeg");
    Border border=BorderFactory.createLineBorder(Color.red, 5);

    ImageIcon image3=new ImageIcon("img//final.png");
    ImageIcon image4=new ImageIcon("img//hhh.jpeg");
    ImageIcon image5 =new ImageIcon("img//ran.jpeg");
    ImageIcon image6=new ImageIcon("img//news.jpeg");
    ImageIcon image7=new ImageIcon("img//quiz.jpeg");
    ImageIcon image8=new ImageIcon("img//login.png");
    ImageIcon image9=new ImageIcon("img//");

    
   gui()  {   
    button.setBounds(600, 300, 250, 150);
    button.addActionListener(this);
    button.setText("STATISTICS");
    button.setFocusable(false);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setFont(new Font("Comic Sans",Font.BOLD,25));
    button.setForeground(Color.blue);
    button.setIcon(image3);


   
    button2.setBounds(600, 500, 250, 150);
    button2.addActionListener(this);
    button2.setText("SCHEDULE");
    button2.setFocusable(false);
    button2.setHorizontalTextPosition(JButton.CENTER);
    button2.setFont(new Font("Comic Sans",Font.BOLD,25));
    button2.setForeground(Color.DARK_GRAY);
    button2.setIcon(image4);



   
    button3.setBounds(600, 100, 250, 150);
    button3.addActionListener(this);
    button3.setText("RANKINGS");
    button3.setFocusable(false);
    button3.setHorizontalTextPosition(JButton.CENTER);
    button3.setFont(new Font("Comic Sans",Font.BOLD,25));
    button3.setForeground(Color.darkGray);
    button3.setIcon(image5);



   
    button4.setBounds(1000, 100, 250, 150);
    button4.addActionListener(this);
    button4.setText("ICC EVENTS");
    button4.setFocusable(false);
    button4.setHorizontalTextPosition(JButton.CENTER);
    button4.setFont(new Font("Comic Sans",Font.BOLD,25));
    button4.setForeground(Color.RED);
    button4.setIcon(image6);


    
    
    button5.setBounds(1000, 300, 250, 150);
    button5.addActionListener(this);
    button5.setText("Quiz");
    button5.setFocusable(false);
    button5.setHorizontalTextPosition(JButton.CENTER);
    button5.setFont(new Font("Comic Sans",Font.BOLD,25));
    button5.setForeground(Color.RED);
    button5.setIcon(image7);


    
    button6.setBounds(1000, 500, 250, 150);
    button6.addActionListener(this);
    button6.setFocusable(false);
    button6.setHorizontalTextPosition(JButton.CENTER);
    button6.setFont(new Font("Comic Sans",Font.BOLD,25));
    button6.setForeground(Color.RED);
    button6.setIcon(image8);



    
    button7.setBounds(1000, 500, 250, 150);
    button7.addActionListener(this);
    button7.setFocusable(false);
    button7.setHorizontalTextPosition(JButton.CENTER);
    button7.setFont(new Font("Comic Sans",Font.BOLD,25));
    button7.setForeground(Color.RED);
    button7.setIcon(image9);
       
       label.setText("Cricinfo");
       label.setIcon(image2);
       label.setHorizontalTextPosition(JLabel.CENTER);
       label.setForeground(Color.DARK_GRAY);
       label.setFont(new Font ("MV Boli",Font.PLAIN,50));
       label.setIconTextGap(-25);
       label.setOpaque(true);
       label.setBackground(Color.BLACK);
       label.setBorder(border);
       label.setVerticalAlignment(JLabel.CENTER);
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setBounds(100, 100, 350, 350);
         
         frame.setTitle("Welcome to Cricinfo");
         frame.setSize(420,420);
         frame.setVisible(true);
         frame.setLayout(null);
         ImageIcon image =new ImageIcon("img//pink.jpeg"); 
         frame.setIconImage(image.getImage());
         frame.getContentPane().setBackground(Color.BLACK); 
         frame.add(label);
         frame.add(button);
         frame.add(button2);
         frame.add(button3);
         frame.add(button4);
         frame.add(button5);
         frame.add(button6);


     }

@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button3){ 
        Rank abc = new Rank();

    } else if(e.getSource()==button2){ 
          Sch labc = new Sch();
    }   else if(e.getSource()==button5){ 
        Quiz cid= new Quiz();
    } else if(e.getSource()==button4){ 
         News badhiya = new News();
    } else if(e.getSource()==button){ 
        Statistics achhuu = new Statistics();
    }    
     
}

}
