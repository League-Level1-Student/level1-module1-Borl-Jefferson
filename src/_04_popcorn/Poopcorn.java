package _04_popcorn;

import javax.swing.JOptionPane;

public class Poopcorn {
public static void main(String[] args) {
	Microwave a = new Microwave();
	
//-----------------------------------------------------------------------

	String f = JOptionPane.showInputDialog("what is you're favorite flavor of popcorn?");
	Popcorn b = new Popcorn(f);
	String t = JOptionPane.showInputDialog("how many minutes does it take to cook");
	int num = Integer.parseInt(t);
	a.setTime(num);
	a.putInMicrowave(b);
	b.applyHeat();
}
}
