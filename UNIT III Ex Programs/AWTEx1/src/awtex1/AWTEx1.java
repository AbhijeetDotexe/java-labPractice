/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awtex1;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Admin
 */
public class AWTEx1 extends Frame implements MouseListener, MouseMotionListener 
{

    /**
     * @param args the command line arguments
     */
    String m=" ";
    int x=0, y=0;
    public AWTEx1(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
        }
    public void mouseClicked(MouseEvent me){
    m=m+"-- click received";
    repaint();}
    public void mouseEntered(MouseEvent me){
    x=100;
    y=100;
    m="Mouse Entered.";
    repaint();}
     public void mouseExited(MouseEvent me){
    x=100;
    y=100;
    m="Mouse Exited.";
    repaint();}
     public void mousePressed(MouseEvent me){
    x=me.getX();
    y=me.getY();
    m="Button Down.";
    repaint();}
     public void mouseReleased(MouseEvent me){
    x=me.getX();
    y=me.getY();
    m="Button Released.";
    repaint();}
     public void mouseDragged(MouseEvent me){
    x=me.getX();
    y=me.getY();
    m="*"+"mouse at"+x+","+y;
    repaint();}
     public void mouseMoved(MouseEvent me){
    m="Moving mouse at"+me.getX()+","+me.getY();
    repaint();}
     public void paint(Graphics g){
     g.drawString(m, x, y);}
     
    public static void main(String[] args) 
     { AWTEx1 ap=new AWTEx1();
       ap.setSize(new Dimension(400,400));
ap.setTitle("Mouse Events Handler");
ap.setVisible(true);
    }
    
}
class MyWindowAdapter extends WindowAdapter{
    @Override
public void windowClosing(WindowEvent we){System.exit(0);}
}