import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.Button;
import java.awt.Event;
import java.awt.event.*;
import java.applet.*;
import java.awt.*; 

public class MovableBall  extends Applet implements Runnable { 
   Button btnMove;
   Button btnStop;
   private int x;
	private int y; 
	private int flag =0;
	private int flag2 =0;
    Thread th; 
  
	public void init() {
	th = new Thread(this); 
	th.start();
   th.suspend();
   x = 100; 
   y = 150;
   btnMove = new Button("Move");
   btnStop = new Button("Stop");
   //MoveListener MListener = new MoveListener();
   //StopListener SListener = new StopListener();
   btnMove.addActionListener (new MoveListener());
   add(btnMove);
   btnStop.addActionListener (new StopListener());
   add(btnStop);
   
     }
	 
    public void paint(Graphics g) 
    {   int a =40;
		int b =40;
	    g.setColor(Color.red);
	    g.fillOval( x, y, a , b);
        g.drawOval( x, y, a , b);

		if(x+3*a >= getWidth()){
			flag = 1;
			x-=6;}
		
		else if(x+3*a < getWidth() & x > a)
		{ if(flag == 0)
			{x+=6;}
		  else
		  {x--;}
		}
		else
		{ x+=6;
		flag = 0;}
		
		if(y+3*b >= getHeight()){
			flag2 = 1;
			y--;}
		
		else if(y+3*b < getHeight() & y > b)
		{ if(flag2 == 0)
			{y+=6;}
		
		else
		{y-=6;}
		}
		else
		{ y+=6;
		flag2 = 0;}	
    }
  
    
    public void run() 
    { 
  
        while (true) { 
  
            repaint(); 
      
            try { 
  
                Thread.sleep(10); 
            } 
            catch (InterruptedException ie) { 
                System.out.println(ie); 
            } 
        } 
    }		
  
   class MoveListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
	 th.resume();   
   }
  }
  
  class StopListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
   th.suspend();
  }
  }
  }