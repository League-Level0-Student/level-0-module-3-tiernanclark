//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;


public class HighLowGame {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
int random = new Random().nextInt(50);
boolean won= false;
		// 2. Print out the random variable above
//
		// 11. do the following 10 times
for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String guess= JOptionPane.showInputDialog(null,"Guess the number I have in my head");
			// 4. convert the users answer to an int (Integer.parseInt(string))
int answer= Integer.parseInt(guess);
			// 5. if the guess is correct
				// 6 win
if (answer==random) {
JOptionPane.showMessageDialog(null, "YOU WIN! NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
won=true;
break;
}

			// 7. if the guess is high
				// 8. tell them it's too high
if (answer>random) {
JOptionPane.showMessageDialog(null, "TOO HIGH! HA!!!!!!! YOU WILL NEVER GUESS IT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
			// 9. if the guess is low
				// 10. tell them it's too low
if (answer<random) {
JOptionPane.showMessageDialog(null, "TOO LOW! HA HA!!!!!!!! You STILL will never guess the number!");
}
}
		// 12. tell them they lose
if (won==false) {
JOptionPane.showMessageDialog(null, "YOU LOSE!!!!!!!!!! HA HA HA HA HA HA HA HA HA HA HA HA HA HA HA HA HA HA HA (COUGH)!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! NOW GET OUT OF TOWN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

	
}

	}

}