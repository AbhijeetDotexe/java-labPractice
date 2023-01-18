import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventHandlingFrame extends Frame implements MouseListener {

	int x = 0, y = 0;
	String strEvent = "";

	MouseEventHandlingFrame(String title) {
		super(title);
		addWindowListener(new MyWindowAdapter(this));
		addMouseListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		strEvent = "MouseClicked";
		x = e.getX();
		y = getY();
		repaint();
	}

	public void mousePressed(MouseEvent e) {
		strEvent = "MousePressed";
		x = e.getX();
		y = getY();
		repaint();

	}

	public void mouseReleased(MouseEvent e) {
		strEvent = "MouseReleased";
		x = e.getX();
		y = getY();
		repaint();

	}

	public void mouseEntered(MouseEvent e) {
		strEvent = "MouseEntered";
		x = e.getX();
		y = getY();
		repaint();

	}

	public void mouseExited(MouseEvent e) {
		strEvent = "MouseExited";
		x = e.getX();
		y = getY();
		repaint();

	}

	public void paint(Graphics g) {
		g.drawString(strEvent + " at " + x + "," + y, 50, 50);
	}

	public static void main(String[] args) {
		MouseEventHandlingFrame window = new MouseEventHandlingFrame("Mouse Event");
	}

}

class MyWindowAdapter extends WindowAdapter {

	MouseEventHandlingFrame window = null;

	MyWindowAdapter(MouseEventHandlingFrame window) {
		this.window = window;
	}

	public void windowClosing(WindowEvent we) {
		window.setVisible(false);
	}
}
