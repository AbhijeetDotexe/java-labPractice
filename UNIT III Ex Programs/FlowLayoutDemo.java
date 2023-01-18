import java.awt.*;
import java.awt.event.*;
public class FlowLayoutDemo extends Frame{ // constructor
	public FlowLayoutDemo(String title)
	{    /* It would create the Frame by calling
   	  * the constructor of Frame class. */
   	 super(title);    
   	 
   	 //Setting up Flow Layout
    	setLayout(new FlowLayout());
   	 
    	//Creating a button and adding it to the frame
    	Button b1 = new Button("Button:1");
    	add(b1);
   	 
    	/* Adding other components to the Frame
     	*/
    	Button b2 = new Button("Button:2");
    	add(b2);
   	 
    	Button b3 = new Button("Button:3");
    	add(b3);
   	 
    	Button b4 = new Button("Button:4");
    	add(b4);
   	 
    	Button b5 = new Button("Button:5");
    	add(b5);
   	 
    	Button b6 = new Button("Button:6");
    	add(b6);
   	 
    	Button b7 = new Button("Button:7");
    	add(b7);
   	 
    	Button b8 = new Button("Button:8");
    	add(b8);}
	public static void main(String[] args)
	{   FlowLayoutDemo screen = 
   		 new FlowLayoutDemo("Flow Layout - Demo");
    	screen.setSize(400,150);
    	screen.setVisible(true);
		screen.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });
	}}
