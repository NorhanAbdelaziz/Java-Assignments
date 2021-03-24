import java.awt.*; 
import java.applet.*; 
  
public class CrazyBall extends Applet implements Runnable {  
    private int x;
	private int y; 
	private int flag =0;
	private int flag2 =0;
    Thread t; 
  
    
    public void init() 
    { 
        x = 100; 
        y = 150; 
        Thread th = new Thread(this);  
        th.start(); 
    } 
  
        public void paint(Graphics g) 
    {   int a =40;
		int b =40;
	    g.setColor(Color.red);
	    g.fillOval( x, y, a , b);
        g.drawOval( x, y, a , b);

		if(x+a >= getWidth()){
			flag = 1;
			x--;}
		
		else if(x+a < getWidth() & x > 0)
		{ if(flag == 0)
			{x++;}
		  else
		  {x--;}
		}
		else
		{ x++;
		flag = 0;}
		
		if(y+b >= getHeight()){
			flag2 = 1;
			y--;}
		
		else if(y+b < getHeight() & y > 0)
		{ if(flag2 == 0)
			{y++;}
		
		else
		{y--;}
		}
		else
		{ y++;
		flag2 = 0;}	
    }
  
    
    public void run() 
    { 
  
        while (true) { 
  
            repaint(); 
      
            try { 
  
                Thread.sleep(5); 
            } 
            catch (InterruptedException ie) { 
                System.out.println(ie); 
            } 
        } 
    } 
  
 
}