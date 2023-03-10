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
public class AWT_MouseEventDemo extends Frame implements MouseListener {
   private TextField tfMouseX; // to display mouse-click-x
   private TextField tfMouseY; // to display mouse-click-y
   // Constructor - Setup the UI components and event handlers
   public AWT_MouseEventDemo() {
      setLayout(new FlowLayout()); // "super" frame sets its layout to FlowLayout
      // Label (anonymous)
      add(new Label("X-Click: ")); // "super" frame adds Label component
      // TextField
      tfMouseX = new TextField(10); // 10 columns
      tfMouseX.setEditable(false);  // read-only
      add(tfMouseX);                // "super" frame adds TextField component
      // Label (anonymous)
      add(new Label("Y-Click: ")); // "super" frame adds Label component
      // TextField
      tfMouseY = new TextField(10);
      tfMouseY.setEditable(false);  // read-only
      add(tfMouseY);                // "super" frame adds TextField component
      addMouseListener(this);
          // "super" frame (source) fires the MouseEvent.
          // "super" frame adds "this" object as a MouseEvent listener.
      setTitle("MouseEvent Demo"); // "super" Frame sets title
      setSize(350, 100);           // "super" Frame sets initial size
      setVisible(true);            // "super" Frame shows
   }
   public static void main(String[] args) {
      AWT_MouseEventDemo m=new AWT_MouseEventDemo();  // Let the constructor do the job
	  m.addWindowListener(new MyWindowListener());
   }
   /* MouseEvent handlers */
   // Called back upon mouse clicked
   @Override
   public void mouseClicked(MouseEvent evt) {
      tfMouseX.setText(evt.getX() + "");
      tfMouseY.setText(evt.getY() + "");}
   // Not used - need to provide an empty body to compile.
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
}
class MyWindowListener extends WindowAdapter {
      public void windowClosing(WindowEvent e) {
         System.exit(0);
}}