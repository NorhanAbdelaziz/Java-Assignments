import java.applet.Applet;
import java.awt.Graphics;
import java.applet.Applet; 
import java.awt.Graphics; 
import java.awt.Button;
import java.awt.Event;
import java.awt.event.*;
import java.applet.*;
import java.awt.*; 


public class MoveText extends Applet implements Runnable {
	//Thread th;
	int x;
	int y;
	

	
	
	public void init(){
		//th = new Thread(this);
		//th.start();
		x = getWidth()/2;
		y = getHeight()/2;
		

		addKeyListener(new Key());

	}
	
	
	
	public void paint(Graphics g) {
		int Keyy;
		Keyy = 0;
		int key =keyy.toString();
		
		switch(Key){
		case "VK_KP_UP":
		y++;
		break;
		
		case "VK_KP_DOWN":
		y--;
		break;
		
		case "VK_KP_RIGHT":
		x++;
		break;
		
		case "VK_KP_Left":
		x--;
		break;
	}	 
		String title = "Move me";
		g.drawString(title, x,y);
		//g.drawRect(0, getHeight() ,getWidth()/10,getHeight()/10);
		
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
	
	   class Key implements KeyListener{
  public void keyPressed (KeyEvent e){
	 keyy = e.getKeyCode();
	 
		
   }
  }

}	
		