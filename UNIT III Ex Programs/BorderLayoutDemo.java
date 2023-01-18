// Java program to illustrate the BorderLayout 
import java.awt.*; 
import java.awt.event.*; 


// class extends JFrame 
class BoderLayoutDemo extends Frame { 

	BoderLayoutDemo() 
	{ 
		
		// Creating Object of Jpanel class 
		Panel pa = new Panel(); 

		// set the layout 
		pa.setLayout(new BorderLayout()); 

		// add a new JButton with name "wel" and it is 
		// lie top of the container 
		pa.add(new Button("WelCome"), BorderLayout.NORTH); 

		// add a new JButton with name "come" and it is 
		// lie buttom of the container 
		pa.add(new Button("BorderLayout"), BorderLayout.SOUTH); 

		// add a new JButton with name "Layout" and it is 
		// lie left of the container 
		pa.add(new Button("Layout"), BorderLayout.EAST); 

		// add a new JButton with name "Border" and it is 
		// lie right of the container 
		pa.add(new Button("Border"), BorderLayout.WEST); 

		// add a new JButton with name "hello everybody" and it is 
		// lie center of the container 
		pa.add(new Button("Border Example"), BorderLayout.CENTER); 

		// add the pa object which refer to the Jpanel 
		add(pa); 

		// Function to close the operation of JFrame. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// Function to set size of JFrame. 
		setSize(300, 300); 

		// Function to set visible status of JFrame. 
		setVisible(true); 
	} 
} 

class MainFrame { 

	// Driver code 
	public static void main(String[] args) 
	{ 
		
		// calling the constructor 
		new BoderLayoutDemo(); 
	} 
} 
