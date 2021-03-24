import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.Button;
import java.awt.Event;
import java.awt.event.*;

public class Counter  extends Applet  { 
   Button btnInc;
   Button btnDec;
   
   public void init() {
   btnInc = new Button("+");
   btnDec = new Button("-");
   IncListener Listener = new IncListener();
   DecListener DListener = new DecListener();
   btnInc.addActionListener (Listener);
   add(btnInc);
   btnDec.addActionListener (DListener);
   add(btnDec);
   
     }

   private int counter=0;


   public void paint (Graphics g ) {
  
     g.drawString("click counts"+ counter , getWidth()/2 ,getHeight()/2);

  }
   class IncListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   counter++;
   repaint();
   
   /*Thread th = new Thread(new Runnable()
   {public void run(){} }
   th.start();*/
	   
   }
  
  
  
  
  }
  class DecListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   counter--;
   repaint();
  }
  }
  
  }