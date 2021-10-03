
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


public class Statistics implements ActionListener { 
    JFrame frame= new JFrame();
    JLabel label=new JLabel();
    JLabel label1=new JLabel();

    JRadioButton tt=new JRadioButton("Highest Run Scorer in T20s ");
    JRadioButton ff=new JRadioButton("Highest Run Scorer in odis");
    JRadioButton test=new JRadioButton("Highest Run Scorer in test");


     ImageIcon t20 =new ImageIcon("img//icc.png");
    
 
 Statistics(){  
         
    ButtonGroup grp = new ButtonGroup();
    grp.add(tt);
    grp.add(ff);
    grp.add(test);
    tt.addActionListener(this);
    tt.setBounds(1000, 100, 200, 200);
    ff.addActionListener(this);
    ff.setBounds(1000, 300, 200, 200);
    test.addActionListener(this);
    test.setBounds(1000, 500, 200, 200);

    frame.add(tt);
   frame.add(ff);
   frame.add(test);
   frame.add(label);

   label.setIcon(t20);
   label.setOpaque(true);   
  label.setBounds(100, 100, 800, 500);



 }

@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==ff){ 
        Statsis paru =new Statsis();
 } else if(e.getSource()==tt ){
        Statsis1 orrisa= new Statsis1();
 } else if(e.getSource()==test){
        Statsis2 raghut = new Statsis2();
 }     
    
}   
    
}
