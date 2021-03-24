import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;


public class NewsApplet extends Applet implements Runnable
 {
	Thread th;
	int x = 0;
	public void init(){
		th = new Thread(this);
		th.start();
	}
	public void paint(Graphics g) {
		x++;
		if(x > getWidth())
			x = -150;
		String title = "JAVA Programming";
		g.drawString(title, x,200);
		//g.drawRect(0, 180, getWidth(), 25);
		//g.setColor(Color.blue);
		//g.fillRect(0, 180, getWidth(), 25);
				
	}
	public void run() {
while(true) {
repaint();
try {
Thread.sleep(5);} catch(InterruptedException ie)
{ie.printStackTrace();}
}

}

}
	
		