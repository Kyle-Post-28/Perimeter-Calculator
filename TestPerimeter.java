/*
Filename: TestPerimeter.java
Author: Kyle Post
Date: February 3, 2017
Purpose: This application will test
the Perimeter Panel GUI class created.
*/
import javax.swing.*;

public class TestPerimeter extends JFrame{
	public TestPerimeter(){
		super("Find a Rectangle's Perimeter or Area");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperations(JFrame.EXIT_ON_CLOSE);
		add(new PerimeterPanel());
	}
	public static void main (String[] args){
		TestPerimeter periAreaTest = new TestPerimeter();
		periAreaTest.setVisible(true);
	}
}