package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListGUI {
	   private JFrame frame;
	   private JScrollPane pane;
	   
	   public ListGUI(){
		   frame = new JFrame();
	   }
	   
	   public static void main(String[] args){
		   ListGUI list = new ListGUI();
		   list.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   list.frame.pack();
		   list.frame.setVisible(true);
	   }
	   public void createFrame(){
		   frame = new JFrame("Java SWING Examples");
		   frame.setSize(400,400);
		   //frame.add(f);
	   }

}
