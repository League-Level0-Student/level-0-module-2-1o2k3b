package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class thename {
public static void main(String[] args) {
String age = JOptionPane.showInputDialog("what is your age, childe.");
int agey = Integer.parseInt(age);
if(agey < 19) {
	System.out.println("no votes for you because you to young so nobody cares about you, noob.");
}
if(agey > 18) {
	JOptionPane.showInputDialog("you may vote easily, so what is your favorite elective for the senate?");
}
}
}
