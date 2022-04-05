package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
	public static void main(String[] args) {
		
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
String height = JOptionPane.showInputDialog("enter your heighr in inches");	
int heighty = Integer.parseInt(height);
	

		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
		if(heighty >= 48) {
			System.out.println("you may ride the double skull alone.");	
		}

		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
		if(heighty > 42 && heighty < 48) {
			System.out.println("you may ride the double skull with a parent or gaurdian.");
		}
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
		if(heighty <= 42) {
			System.out.println("you may not ride the double skull, smally.");
		}
	
}
}
