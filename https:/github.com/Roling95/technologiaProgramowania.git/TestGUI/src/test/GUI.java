package test;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {
	
    private JFrame frame;
    private JTextField dataField;
    private JTextArea messageArea;

    public GUI(){
        frame = new JFrame("Capitalize Client");
        dataField = new JTextField(40);
        messageArea = new JTextArea(8, 60);
        messageArea.setEditable(false);
        frame.getContentPane().add(dataField, "North");
        frame.getContentPane().add(new JScrollPane(messageArea), "Center");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI gui = new GUI();
        gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.frame.pack();
        gui.frame.setVisible(true);
	}

}
