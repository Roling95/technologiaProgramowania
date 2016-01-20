package test;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI2 {
	
    private JFrame frame;
    private JPanel panel;
    public GUI2(){
        frame = new JFrame("Capitalize Client");
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
       // panel.setPreferredSize(new Dimension(100,100));
        JTextArea textArea = new JTextArea(8, 60);
        textArea.append("Test");
        panel.add(textArea);
        JTextArea textArea2 = new JTextArea(8, 60);
        textArea2.append("Test2");
        panel.add(textArea2);
        JTextArea textArea3 = new JTextArea(8, 60);
        textArea3.append("Test3");
        panel.add(textArea3);
        frame.add(panel);
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI2 gui = new GUI2();
        gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.frame.pack();
        gui.frame.setVisible(true);
	}

}
