import java.awt.*;
import java.awt.event.*;
class EventHandling extends Frame implements ActionListener
{TextField tf;
EventHandling()
{tf=new TextField();
tf.setBounds(60,50,170,20);
Button b=new Button("Show");
b.setBounds(90,140,75,40);
b.addActionListener(this);
add(b);
add(tf);
addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
setSize(250,250);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{tf.setText("Hellow GUI");
}
public static void main(String[] a)
{new EventHandling();
}
}