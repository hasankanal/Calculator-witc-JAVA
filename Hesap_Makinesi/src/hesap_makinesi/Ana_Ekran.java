/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesap_makinesi;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author yalba
 */
public class Ana_Ekran extends JFrame  implements ActionListener {
    
    
  public JTextField girdi=new JTextField();  
  String veri="";
  public   JButton[]  tuslar;
  double ilkgiris,ikincigiris,sonuc,donusum;
  char simge;
  int nokta;
  public String [] buttons={
        "Cls", "Bck","±", "Close",
        "7", "8", "9", "/", 
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"  };

    
    public Ana_Ekran(){
      setLayout(new BorderLayout());
      JPanel kuzey =new JPanel(new GridLayout(1,1,5,5));
      JPanel guney =new JPanel(new GridLayout(5,5,10,10));
      girdi.setFont(new java.awt.Font("Times New Roman",0, 20)); // NOI18N
      kuzey.add(girdi);
      tuslar=new JButton[buttons.length];   
      
      for (int i=0; i <buttons.length; i++)
      {  
      tuslar[i]=new JButton(buttons[i]);
      tuslar[i].addActionListener(this);
      guney.add(tuslar[i],i);    
      }  
     
     
        
        
      add(kuzey,BorderLayout.NORTH);
      add(guney,BorderLayout.CENTER);  
      kuzey.setBorder(BorderFactory.createEmptyBorder(15, 10, 1, 10));//yukradan assa bosluk,soldansaga,ykoord genisle,x koord gnsle


    guney.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
      setTitle("Hesap Makinesi");
      setSize(350,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
      setResizable(false);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==tuslar[12])
          {
              veri+=1;  
              girdi.setText(veri); 
          }
      else if(e.getSource()==tuslar[13]) {
          veri+=2;
          girdi.setText(veri);
      }
      else if(e.getSource()==tuslar[14]) {veri+=3;
girdi.setText(veri); }
      else if(e.getSource()==tuslar[8]) {veri+=4;
girdi.setText(veri); }
      else if(e.getSource()==tuslar[9]){veri+=5;
girdi.setText(veri); }
      else if(e.getSource()==tuslar[10]) {veri+=6;
girdi.setText(veri); }
      else if(e.getSource()==tuslar[4]) {veri+=7;
girdi.setText(veri); }
      else if(e.getSource()==tuslar[5]) {veri+=8;
girdi.setText(veri); }
      else if(e.getSource()==tuslar[6]) {veri+=9;
girdi.setText(veri); }
      else if(e.getSource()==tuslar[16]) {veri+=0;
girdi.setText(veri); }

        
        else if(e.getSource()==tuslar[7])
             {
             ilkgiris = Double.parseDouble( girdi.getText() );
             
nokta=0;
simge = '/';
veri="";
girdi.setText("" +veri);
             }
         
       else if(e.getSource()==tuslar[11])
             {
             ilkgiris = Double.parseDouble( girdi.getText() );
                 nokta=0;
                simge = '*';
                veri="";
                    girdi.setText("" +veri);
             }
         else if(e.getSource()==tuslar[19])
             {
             ilkgiris = Double.parseDouble( girdi.getText() );
    nokta=0;
    simge = '+';
    veri="";
    girdi.setText("" +veri);
             }
if(simge=='+')
    girdi.setText(veri);
        
        
        
    }

    }


