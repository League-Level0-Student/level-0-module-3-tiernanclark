
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot rocky= new Robot();
		//3. ask the user what color they would like the robot to draw

String color = JOptionPane.showInputDialog("please enter the color you would like");
		//4. use an if/else statement to set the pen color that the user requested
if(color.equals ("white")) {
rocky.setPenColor(Color.WHITE);
}

if(color.equals("blue")) {
rocky.setPenColor(Color.BLUE);
}

if(color.equals("green")) {
rocky.setPenColor(Color.GREEN);
}

if(color.equals("orange")) {
rocky.setPenColor(Color.ORANGE);
}

if(color.equals("yellow")) {
rocky.setPenColor(Color.YELLOW);
}

if(color.equals("pink")) {
rocky.setPenColor(Color.PINK);
}

if(color.equals("red")) {
rocky.setPenColor(Color.RED);
}

        //5. if the user doesn't enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
rocky.penDown();
rocky.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
for(int i=0; i<4;i++) {
rocky.move(100);
rocky.turn(360/4);
	}
}
}
