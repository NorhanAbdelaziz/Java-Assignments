import java.awt.event.*;
import java.applet.*;
import java.awt.*; 

public class DrawLine extends Applet{
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	
	public void init(){
		addMouseListener(new Click());
		addMouseMotionListener (new Drag());
	}
	public void paint(Graphics g){
			g.drawLine(x1,y1,x2,y2);
		
}
class Click implements MouseListener{
			public void mousePressed (MouseEvent e){
				x1= e.getX();
				y1= e.getY();
			}
			public void mouseClicked (MouseEvent e){}
			public void mouseReleased  (MouseEvent e){}
			public void mouseEntered (MouseEvent e){}
			public void mouseExited (MouseEvent e){}
		}
		
		class Drag implements MouseMotionListener{
			public void mouseDragged (MouseEvent e){
				x2= e.getX();
				y2= e.getY();
				repaint();
			}
			public void mouseMoved (MouseEvent e){}
		}
			
}	