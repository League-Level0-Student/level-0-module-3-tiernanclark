package elseif;

import org.jointheleague.graphical.robot.Robot;

public class ValentineRobotDrawingAHeart {
public static void main(String[] args) {
	

	Robot rocky = new Robot();
rocky.setPenColor(244,66,98);	
rocky.penDown();
rocky.setSpeed(2000);
rocky.setAngle(30);
rocky.move(100);
for (int i = 0; i < 180; i++) {
rocky.turn(-360/360);	
rocky.move(2);}
rocky.setAngle(0);
for (int j = 0; j < 180; j++) {
rocky.turn(-360/360);
rocky.move(2);}
rocky.setAngle(-45);


	
}
 
	
}


