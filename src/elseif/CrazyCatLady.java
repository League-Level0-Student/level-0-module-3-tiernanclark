//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
String  s  = JOptionPane.showInputDialog(null, "How many cats do you have");
		// 2. Convert their answer into an dint
int cats = Integer.parseInt(s);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(cats>3&&cats<0) {
	
}
JOptionPane.showMessageDialog(null, "YOU ARE A CRAZY CAT LADY!!!!!! DO YOU KNOW HOW MUCH POOP YOU HAVE TO PICK UP??????????????!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		// 4. If they have 3 or less, call the method below to show them a cat video
if (cats<3&&cats>0) {
	

 playVideo("https://www.youtube.com/watch?v=iRXJXaLV0n4");
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
playVideo("https://www.youtube.com/watch?v=JuDTJ0iSk3U");
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}