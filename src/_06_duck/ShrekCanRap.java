package _06_duck;

import javax.swing.JOptionPane;

public class ShrekCanRap {
public static void main(String[] args) {
	ShrekRap Donkey = new ShrekRap(21,10);
	String qna = JOptionPane.showInputDialog("What do you want the all mighty Shrek to do?");
	if (qna .equals ("eat")) {
		Donkey.eat();
	}
	else {
		Donkey.throe();
	}
	//----------------------------------------------
	Eeoo uck = new Eeoo("Human Flesh", 0);
	String ans = JOptionPane.showInputDialog("What do you want the even more mightier duck to do?");
	if (ans .equals("quack")) {
		uck.quack();
	}
	else {
		uck.waddle();
	}
}
}
