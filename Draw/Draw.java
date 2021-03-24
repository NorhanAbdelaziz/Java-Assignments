import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Draw extends Applet
{
	public void paint(Graphics g)
	{
		//g.drawString("Hello Java", 50, 100);
		
		// large ellipse
		g.setColor(Color.yellow);
		g.fillOval(300,50, 200, 50);
		g.setColor(Color.black);
		g.drawOval(300,50, 200, 50);
		
		// two lines
		g.drawLine(300, 75, 200, 250);
		g.drawLine(500, 75, 600, 250);
		
		// arc
		g.drawArc(200, 200, 400, 100, 180, 180);
		
		// middle ellipse
		g.setColor(Color.yellow);
		g.fillOval(375,150, 50, 100);
		g.setColor(Color.black);
		g.drawOval(375,150, 50, 100);
		
		// two small ellipses
		g.setColor(Color.yellow);
		g.fillOval(475,175, 25, 50);
		g.setColor(Color.black);
		g.drawOval(475,175, 25, 50);
		g.setColor(Color.yellow);
		g.fillOval(300,175, 25, 50);
		g.setColor(Color.black);
		g.drawOval(300,175, 25, 50);
		
		// two lines
		g.drawLine(350, 302, 300, 410);
		g.drawLine(450, 302, 500, 410);
		
		// rect
		g.setColor(Color.white);
		g.fillRect(250, 410, 300, 30);
		g.setColor(Color.black);
		g.drawRect(250, 410, 300, 30);

	}
}