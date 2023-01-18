/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;

/** *
 * @author mca
 */
//1. AWT Example by Inheritance
public class AWT_1BasicExample extends Frame{

    AWT_1BasicExample() {
        Button b = new Button("click me");
        b.setBounds(30, 100, 80, 30);// setting button position  
        add(b);//adding button into frame  
        setSize(300, 300);//frame window size 300 width and 300 height  
        setLayout(null);//no layout manager  
        setVisible(true);//now frame will be visible, by default not visible  
    }
	
    public static void main(String args[]) {
        AWT_1BasicExample obj1 = new AWT_1BasicExample();
        AWTBasicAssociationExample obj2 = new AWTBasicAssociationExample();
    }
}

//1. AWT Example by Association
class AWTBasicAssociationExample {

    AWTBasicAssociationExample() {
        Frame f = new Frame();
        Button b = new Button("click me");
        b.setBounds(30, 50, 80, 30);
        f.add(b);
        f.setSize(300, 300);
		f.setTitle("Basic Frame Window");
        f.setLayout(null);
        f.setVisible(true);
    }
}
