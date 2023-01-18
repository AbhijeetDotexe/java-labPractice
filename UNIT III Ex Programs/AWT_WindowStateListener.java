/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mca
 */

// Java Program to handle window events 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class AWT_WindowStateListener extends JFrame implements WindowStateListener { 
    AWT_WindowStateListener() 
    { 
        super("main frame"); 
        setSize(500, 500); 
  
        // create a sub frame 
        JFrame f = new JFrame("sub"); 
  
        // add window state listener 
        f.addWindowStateListener(this); 
  
        // set size of window 
        f.setSize(200, 200); 
  
        show(); 
        f.show(); 
    } 
  
    // if state of window is changed 
    public void windowStateChanged(WindowEvent e) 
    { 
        JOptionPane.showMessageDialog(this, "window state changed"); 
    } 
    // main class 
    public static void main(String args[]) 
    { 
        AWT_WindowStateListener l = new AWT_WindowStateListener(); 
    } 
} 
