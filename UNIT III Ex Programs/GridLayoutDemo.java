import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;
   private Label msglabel;

   public GridLayoutDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      GridLayoutDemo  awtLayoutDemo = new GridLayoutDemo();  
      awtLayoutDemo.showGridLayoutDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      msglabel = new Label();
      msglabel.setAlignment(Label.CENTER);
      msglabel.setText("Layout MAnager Examples.");

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showGridLayoutDemo(){
      headerLabel.setText("Layout in action: GridLayout");      

      Panel panel = new Panel();
      panel.setBackground(Color.darkGray);
      panel.setSize(300,300);
      GridLayout layout = new GridLayout(0,3);
      layout.setHgap(10);
      layout.setVgap(10);
      
      panel.setLayout(layout);        
      panel.add(new Button("Button 1"));
      panel.add(new Button("Button 2")); 
      panel.add(new Button("Button 3")); 
      panel.add(new Button("Button 4")); 
      panel.add(new Button("Button 5")); 
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
}
