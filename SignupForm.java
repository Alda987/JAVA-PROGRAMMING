package javapackage;
import javax.swing.*;
import java.awt.*;
public class SignupForm {
	public static void main(String[] args) {
		JFrame mainFrame=new JFrame();
		mainFrame.setSize(600,300);
		mainFrame.setTitle("The Signup Form");
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(5,2,10,10));
		JLabel nameLabel=new JLabel("name");
		JTextField nameField = new JTextField();
		JLabel emailLabel= new JLabel("Emial");
	    JTextField emailField=new JTextField();	
	    JLabel genderLabel = new JLabel("Gender");
	    JRadioButton male = new JRadioButton("Male");
	    		 JRadioButton female=new  JRadioButton("Female");
	    		 ButtonGroup genButtonGroup= new ButtonGroup();
	genButtonGroup.add(male);
	 genButtonGroup.add(female);
	    JPanel genderPanel = new JPanel();
	    genderPanel.setLayout(new FlowLayout());
	    genderPanel.add(male);
	    genderPanel.add(female);
	    JLabel countryLabel = new JLabel("Country");
	   String[] countries ={"India","China","USA"};
	   JComboBox<String> countryBox = new JComboBox<>(countries);
			   JLabel addressLabel = new JLabel("Address");
	   JTextArea addressArea = new JTextArea(3,4);
	   JButton submitbtn = new JButton("Submit");
	   panel.add(nameLabel);panel.add(nameField);	
	   panel.add(emailLabel);panel.add(emailField);	
	   panel.add(genderLabel);panel.add(male);panel.add(female);
	   panel.add(countryLabel);	panel.add(countryBox);
	   panel.add(addressLabel);panel.add(addressArea);	
	   panel.add(submitbtn);
	   panel.add(new JLabel(""));
	   mainFrame.add(panel);
	   mainFrame.setLocationRelativeTo(null);
	   mainFrame.setVisible(true);
	   
	}
}