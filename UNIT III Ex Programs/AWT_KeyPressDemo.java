/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mca
 */
import java.awt.*;
import java.awt.event.*;
 
// An AWT GUI program inherits from the top-level container java.awt.Frame
public class AWT_KeyPressDemo extends Frame implements KeyListener {
      // This class acts as KeyEvent Listener
 
   private TextField tfInput;  // Single-line TextField to receive tfInput key
   private TextArea taDisplay; // Multi-line TextArea to taDisplay result
 
   // Constructor to setup the GUI components and event handlers
   public AWT_KeyPressDemo() {
      setLayout(new FlowLayout()); // "super" frame sets to FlowLayout
      add(new Label("Enter Text: "));
      tfInput = new TextField(20);
      add(tfInput);
      taDisplay = new TextArea(5, 40); // 5 rows, 40 columns
      add(taDisplay);
      tfInput.addKeyListener(this);
         // tfInput TextField (source) fires KeyEvent.
         // tfInput adds "this" object as a KeyEvent listener.
      setTitle("KeyEvent Demo"); // "super" Frame sets title
      setSize(400, 200);         // "super" Frame sets initial size
      setVisible(true);          // "super" Frame shows
   }
   // The entry main() method
   public static void main(String[] args) {
      AWT_KeyPressDemo key=new AWT_KeyPressDemo();  // Let the constructor do the job
	  key.addWindowListener(new MyWindowListener());
   }
 
   /** KeyEvent handlers */
   // Called back when a key has been typed (pressed and released)
   @Override
   public void keyTyped(KeyEvent evt) {
      taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
   }
 
   // Not Used, but need to provide an empty body for compilation
   @Override public void keyPressed(KeyEvent evt) { }
   @Override public void keyReleased(KeyEvent evt) { }
}
class MyWindowListener extends WindowAdapter {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
}}