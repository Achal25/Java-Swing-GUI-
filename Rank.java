import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rank implements ActionListener{    
       JFrame frame= new JFrame();
       JLabel label=new JLabel();
       JLabel label1=new JLabel();

       JRadioButton tt=new JRadioButton("T20 TEAM RANKINGS");
       JRadioButton ff=new JRadioButton("ODI TEAM RANKINGS");
       JRadioButton test=new JRadioButton("TEST TEAM RANKINGS");


       
       JRadioButton ttplayer=new JRadioButton("T20 PLAYERS RANKINGS");
       JRadioButton odiplayer=new JRadioButton("ODI PLAYERS RANKINGS");
       JRadioButton testplayer=new JRadioButton("TEST PLAYERS RANKINGS");
     
       ImageIcon image1=new ImageIcon("img//odi.jpeg");
       Border border=BorderFactory.createLineBorder(Color.BLUE, 5);
       ImageIcon t20 =new ImageIcon("img//icc.png");
    

        
Rank(){  
  
       ButtonGroup grp = new ButtonGroup();
        grp.add(tt);
        grp.add(ff);
        grp.add(test);
        grp.add(ttplayer);
        grp.add(odiplayer);
        grp.add(testplayer);


        tt.addActionListener(this);
        tt.setBounds(1000, 100, 200, 200);
        ff.addActionListener(this);
        ff.setBounds(1000, 300, 200, 200);
        test.addActionListener(this);
        test.setBounds(1000, 500, 200, 200);
        ttplayer.addActionListener(this);
        ttplayer.setBounds(1200, 100, 200, 200);
        odiplayer.addActionListener(this);
        odiplayer.setBounds(1200, 300, 200, 200);
        testplayer.addActionListener(this);
        testplayer.setBounds(1200, 500, 200, 200);



   
   frame.setTitle("RANKINGS");
   frame.setSize(420,420);
   frame.setVisible(true);
   frame.setLayout(null);
   frame.setIconImage(image1.getImage());
   frame.getContentPane().setBackground(Color.BLUE); 
   frame.add(label1);

   frame.add(tt);
   frame.add(ff);
   frame.add(test);
   frame.add(label);
   frame.add(ttplayer);
   frame.add(odiplayer);
   frame.add(testplayer);

   label.setIcon(t20);
   label.setOpaque(true);   
  label.setBounds(100, 100, 800, 500);

       

}



@Override
public void actionPerformed(ActionEvent e) {
       if(e.getSource()==ff){ 
              Odi rth =new Odi();
       } else if(e.getSource()==tt ){
              Twnty obama = new Twnty();
       } else if(e.getSource()==test){
              Test virat = new Test();
       }else if (e.getSource()==ttplayer){
              TTply rohit = new TTply();
       }else if (e.getSource()==odiplayer){ 
              Odiply rahul=new Odiply();
       }else if(e.getSource()==testplayer){
              Testply kane=new Testply();
       }
       
}


    
}
