import java.awt.event.*;
import java.applet.*;
import java.awt.*; 
import java.util.Vector; 
import java.awt.Color;
import java.awt.Point;

public class MultibleLine extends Applet{
		class Coord
	{
		point start,end;
		

		
	}
	public int x1,x2,y1,y2;
	private Vector<Coord> vec = new Vector<Coord>();
	//Point a;
	//Point b;
    //int hline;
	//int nline = 3;

	
	public void init(){
		
		this.addMouseListener(new Click());
		this.addMouseMotionListener (new Drag());
	}
	public void paint(Graphics g){
		Color myRed = new Color(255, 0, 0);
		g.drawLine(x1,y1,x2,y2);
		g.setColor(myRed);
		for(Coord p : vec){
		g.drawLine(p.x1, p.y1, p.x2, p.y2);}	
}

	class Click implements MouseListener{
			public void mousePressed (MouseEvent e){
				x1 = e.getX();
				y1 = e.getY();	
				repaint();
			}
			public void mouseClicked (MouseEvent e){}

			public void mouseReleased  (MouseEvent e){
			Coord points = new Coord();
						points.x1 = x1;
						points.y1 = y1;
						points.x2 = x2;
						points.y2 = y2;
						vec.add(points);
						repaint();
            
			}
			public void mouseEntered (MouseEvent e){}
			public void mouseExited (MouseEvent e){}
		}
		
		class Drag implements MouseMotionListener{
			public void mouseDragged (MouseEvent e){
				x2 = e.getX();
				y2 = e.getY();
				repaint();
				x2 = 0;
				y2 = 0;
			}
			public void mouseMoved (MouseEvent e){}
		}
		

			
}	
