import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.Button;
import java.awt.Event;
import java.awt.event.*;
import java.applet.*;
import java.awt.*; 

public class DragBall  extends Applet implements Runnable { 
   private int x;
	private int y; 
    Thread th; 
  
	public void init() {
	th = new Thread(this); 
	th.start();
   th.suspend();
   x = 100; 
   y = 150;
  	addMouseListener(new Click());
	addMouseMotionListener (new Drag());
   
     }
	 
    public void paint(Graphics g) 
    {   int a =40;
		int b =40;
	    g.setColor(Color.red);
	    g.fillOval( x, y, a , b);
        g.drawOval( x, y, a , b);

			
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
  
class Click implements MouseListener{
			public void mousePressed (MouseEvent e){
				x= e.getX();
				y= e.getY();
			}
			public void mouseClicked (MouseEvent e){}
			public void mouseReleased  (MouseEvent e){}
			public void mouseEntered (MouseEvent e){}
			public void mouseExited (MouseEvent e){}
		}
		
		class Drag implements MouseMotionListener{
			public void mouseDragged (MouseEvent e){
				x= e.getX();
				y= e.getY();
				repaint();
			}
			public void mouseMoved (MouseEvent e){}
		}
  }