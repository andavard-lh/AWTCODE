import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MouseDragDraw extends Applet implements MouseListener, MouseMotionListener
{
  int prev_x=0,prev_y=0;
	int cur_x,cur_y;
	public void init()
	{
		setSize(500,500);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
    public void paint(Graphics g)
    {
    	g.setXORMode(new Color(200,200,100));
    	g.drawLine(prev_x, prev_y, cur_x, cur_y);

    }
    public void mouseDragged(MouseEvent me)
	{
    	cur_x=me.getX();
		cur_y=me.getY();
		repaint();
		
	}
	
	public void mouseMoved(MouseEvent me)
	{
		
	}
	
    

	public void mouseEntered(MouseEvent me)
	{
		
		
	}
	
	public void mouseExited(MouseEvent me)
	{
		
		
	}
	
	public void mousePressed (MouseEvent me)
	{
	
		prev_x=me.getX();
		prev_y=me.getY();
		
	}
	
	public void mouseClicked(MouseEvent me)
	{
		
			prev_x=me.getX();
			prev_y=me.getY();
		
		
	}
	
	public void mouseReleased(MouseEvent me)
	{
		cur_x=me.getX();
		cur_y=me.getY();
		repaint();
		
	}
	
}
