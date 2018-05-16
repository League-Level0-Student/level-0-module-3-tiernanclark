//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog(null, " ................. Do you like bananas...............");
		// 2. if they say no,
		// tell them they are crazy
		// and end the quiz
		if (answer.equals("no")) {
			JOptionPane.showMessageDialog(null, " You are a CRAZY! BANANAS!");
		}
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
if (answer.equals("yes")) {
JOptionPane.showMessageDialog(null, " Music is much better with banana drumsticks, don't you think?");
}
		// 4. OPTIONAL: if they say something other than yes or no
		// show a pop up that says that you are bananas!â€�

	}
}