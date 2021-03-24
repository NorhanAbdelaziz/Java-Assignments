import java.awt.*; 
import java.applet.*; 
  
public class Ball extends Applet implements Runnable {  
    private int x;
	private int y;
	private int mx;
	private int my; 
    Thread t; 
  
    
    public void init() 
    { 
        x = 50; 
        y = 50; 
		mx = 5;
		my = 5;
        Thread th = new Thread(this);  
        th.start(); 
    } 
  
    public void update() 
    {      
	   if(x >= getWidth())
		   mx =-5;
       if (x < 0)	
            mx = 5;
		x = x + mx;
       if (y >= getHeight())
           my =-5;		   
	   if (y < 0)
		   my=5;
	   y = y + my;    
    } 
  
    
    public void run() 
    { 
  
        while (true) { 
  
            repaint(); 
            update(); 
            try { 
  
                Thread.sleep(5); 
            } 
            catch (InterruptedException ie) { 
                System.out.println(ie); 
            } 
        } 
    } 
  
    public void paint(Graphics g) 
    {   
	    g.setColor(Color.red);
	    g.fillOval( x, y, 40 , 40);
        g.drawOval( x, y, 40 , 40); 
    } 
}