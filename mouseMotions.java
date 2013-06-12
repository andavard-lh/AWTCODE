import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class mouseMotions  extends Applet implements MouseListener, MouseMotionListener {
  
	int x=0,y=0;
	String msg="";
	public void init()
	{
		addMouseMotionListener(this);
		addMouseListener(this);
	}

	public void mousePressed(MouseEvent mc)
	{
		x=mc.getX();
		y=mc.getY();
		msg="you cliked here";
		repaint();
	}

	public void mouseEntered(MouseEvent mc)
	{
		x=0;
		y=10;
		msg="You entered the screen";
		repaint();
	}
	
	public void mouseClicked(MouseEvent mc)
	{
		x=mc.getX();
		y=mc.getY();
		msg="You cliked the mouse here";
		repaint();
	}
	
	public void mouseDragged(MouseEvent mc)
	{
		/*x=mc.getX();
		y=mc.getY();
		msg="You cliked the mouse here";
		repaint();*/
		showStatus("moving mouse at " + mc.getX() + ", "+mc.getY());
	}
	
	public void mouseReleased(MouseEvent mc)
	{
		x=mc.getX();
		y=mc.getY();
		msg="You released the mouse  here";
		repaint();
	}
	
	public void mouseMoved(MouseEvent mc)
	{
		/*x=mc.getX();
		y=mc.getY();
		msg="You moved the mouse here";
		repaint();*/
		
		showStatus("moving mouse at " + mc.getX() + ", "+mc.getY());
	}
	
	public void mouseExited(MouseEvent mc)
	{
		x=0;
		y=10;
		msg="You exited the window";
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
	
}
