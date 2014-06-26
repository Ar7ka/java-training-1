package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Frame extends JFrame{
    private Dimension screenSize;
    
    private JPanel panel,sender;
    private JButton button;
    private JScrollPane scroll;
    private JTextArea viewer;
    private JTextField input;
    
    public Frame(){
	screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	this.setAutoRequestFocus(true);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	//this.setLocationRelativeTo();
	this.setMaximumSize(screenSize);
	this.setMinimumSize(new Dimension(480,320));
	this.setName("Simple Chat Program");
	this.setPreferredSize(new Dimension(480,320));
	this.setResizable(false);
	this.setTitle("Simple Chat Program");
	
	panel = new JPanel();
	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	
	scroll = new JScrollPane();
	
	viewer = new JTextArea();
	viewer.setEditable(false);
	
	scroll.getViewport().add(viewer);
	
	panel.add(scroll);
	
	sender = new JPanel();
	sender.setLayout(new BoxLayout(sender,BoxLayout.X_AXIS));
	
	input = new JTextField();
	input.setMaximumSize(new Dimension(480,32));
	sender.add(input);
	
	
	button = new JButton("SEND");
	sender.add(button);
	
	panel.add(sender);
	
	
	this.add(panel);
	//this.setLayout(new BoxLayout());
	//this.pack();
	this.setVisible(true);
	
	viewer.setText("Welcome to Simple Chat Program");
    }
}
