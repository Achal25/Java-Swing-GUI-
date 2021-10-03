
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.BorderFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sch implements ActionListener {   
              
    JFrame frame= new JFrame();
    JLabel label=new JLabel();
    JLabel label1=new JLabel();


    JButton button= new JButton();
    JButton button2= new JButton();
    JButton button3= new JButton();
    JButton button4= new JButton();
    JButton button5= new JButton();
    JButton button6= new JButton();
    JButton button7= new JButton();




    ImageIcon image=new ImageIcon("img//schdulea.png");
    ImageIcon image1=new ImageIcon("img//odi.jpeg");


    Sch(){ 
        label.setIcon(image);
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
       label.setBounds(0, 0, 1200, 800);

    button2.setBounds(1300, 120, 200, 50);
    button2.addActionListener(this);
    button2.setText("MORE INFO");
    button2.setFocusable(false);
    button2.setHorizontalTextPosition(JButton.CENTER);
    button2.setFont(new Font("Comic Sans",Font.BOLD,25));
    button2.setForeground(Color.DARK_GRAY);




   
    button3.setBounds(1300, 470, 200, 50);
    button3.addActionListener(this);
    button3.setText("MORE INFO");
    button3.setFocusable(false);
    button3.setHorizontalTextPosition(JButton.CENTER);
    button3.setFont(new Font("Comic Sans",Font.BOLD,25));
    button3.setForeground(Color.darkGray);
    



   
    button4.setBounds(1300, 730, 200, 50);
    button4.addActionListener(this);
    button4.setText("MORE INFO");
    button4.setFocusable(false);
    button4.setHorizontalTextPosition(JButton.CENTER);
    button4.setFont(new Font("Comic Sans",Font.BOLD,25));
    

    
    
    button5.setBounds(1300, 350, 200, 50);
    button5.addActionListener(this);
    button5.setText("MORE INFO");
    button5.setFocusable(false);
    button5.setHorizontalTextPosition(JButton.CENTER);
    button5.setFont(new Font("Comic Sans",Font.BOLD,25));

    
    button6.setBounds(1300, 230, 200, 50);
    button6.addActionListener(this);
    button6.setFocusable(false);
    button6.setText("MORE INFO");
    button6.setHorizontalTextPosition(JButton.CENTER);
    button6.setFont(new Font("Comic Sans",Font.BOLD,25));

    button7.setBounds(1300, 600, 200, 50);
    button7.addActionListener(this);
    button7.setFocusable(false);
    button7.setText("MORE INFO");
    button7.setHorizontalTextPosition(JButton.CENTER);
    button7.setFont(new Font("Comic Sans",Font.BOLD,25));
   
       button.setBounds(1300, 0,200, 50);
       button.addActionListener(this);
       button.setText("MORE INFO");
       button.setFocusable(false);
       button.setHorizontalTextPosition(JButton.CENTER);
       button.setFont(new Font("Comic Sans",Font.BOLD,25));

       
   frame.setTitle("Schedule");
   frame.setSize(420,420);
   frame.setVisible(true);
   frame.setLayout(null);
   frame.setIconImage(image1.getImage());
   frame.getContentPane().setBackground(Color.BLUE); 
   frame.add(label1);

       
          frame.setSize(500,500);
          frame.setLayout(null);
          frame.setVisible(true);
          frame.add(label); 





          frame.add(button);
          frame.add(button2);
          frame.add(button3);
          frame.add(button4);
          frame.add(button5);
          frame.add(button6);
          frame.add(button7);
 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){ 
            Info samson = new Info();
        }
          
        
    }
    
}
