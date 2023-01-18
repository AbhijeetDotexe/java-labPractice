// load an Image into a standalone Java application panel (i.e. one that does not have a base URL	
import java.awt.*;
import java.awt.image.*;
public class ImageWindow extends Frame 
{Image im;
	public ImageWindow()
	{System.out.println("ImageWindow created");}
	public void createImage()
	{im = getToolkit().getImage("C:\\Java\\class Programs\\bear.jpg");}
	public void paint(Graphics g)
	{update(g);}
	public void update(Graphics g)
	{g.drawImage(im, 0, 0, this);}
	public boolean handleEvent(Event evt)
	{if (evt.id == Event.WINDOW_DESTROY) 
		{System.exit(0);}
		return super.handleEvent(evt);}
	public static void main(String args[]) 
	{ImageWindow window = new ImageWindow();
		window.createImage();
		window.setTitle("Java StandAlone Application");
		window.pack();
		window.resize(500,300);
		window.show();
	}
}

