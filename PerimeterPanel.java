/*
Filename: PerimeterPanel.java
Author: Kyle Post
Date: February 3, 2017
Purpose: To create a panel that includes
buttons, input/output fields. This GUI will
calculate the area and perimeter of a Rectangle.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PerimeterPanel extends JPanel {
	//Create input/output components
	private JLabel width = new JLabel("Width", JLabel.CENTER);
	private JLabel length = new JLabel("Length", JLabel.CENTER);
	private JLabel total = new JLabel("Results", JLabel.CENTER);
	private JTextField widthTxt = new JTextField("");
	private JTextField lengthTxt = new JTextField("");
	private JTextField totalTxt = new JTextField("");
	//Create two buttons
	private JButton periBtn = new JButton("Perimeter");
	private JButton areaBtn = new JButton("Area");
	
	public PerimeterPanel(){
		setLayout(new BorderLayout());
		setBackground(Color.gray);
		//Create input/output panel
		JPanel inoutPanel = new JPanel();
		inoutPanel.setLayout(new GridLayout(2,3));
		totalTxt.setBackground(Color.lightGray);
		totalTxt.setEditable(false);
		inoutPanel.add(width);
		inoutPanel.add(length);
		inoutPanel.add(total);
		inoutPanel.add(widthTxt);
		inoutPanel.add(lengthTxt);
		inoutPanel.add(totalTxt);
		add(inoutPanel, BorderLayout.CENTER);
		
		//Create button panel
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		btnPanel.add(periBtn);
		btnPanel.add(areaBtn);
		//Create Action Listeners for both buttons
		periBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex) {
				double perimeter = (2 * getWidth()) + (2 * getLength());
				setTotal(String.valueOf(perimeter));
			}
		});
		areaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ex){
				double area = (getWidth() * getLength());
				setTotal(String.valueOf(area));
			}
		});
		add(btnPanel, BorderLayout.SOUTH);
	}
	//Getter for Inputs and Setter for Output
	double getWidth() { 
		return Double.parseDouble(widthTxt.getText());
		}
	double getLength() { 
		return Double.parseDouble(lengthTxt.getText());
		}
	void setTotal(String value){ 
		totalTxt.setText(value);
		}
}