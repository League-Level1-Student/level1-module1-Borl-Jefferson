package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Bolt {
public static void main(String[] args) {
	
		int fin = 0;
String chs = JOptionPane.showInputDialog("What do you want the code to be?");
if (chs .equals ("random")) {
	Random ran = new Random();
	 fin = ran.nextInt(1000000-1+1) + 1;
}
else {
	 fin = Integer.parseInt(chs);
}

String chek = JOptionPane.showInputDialog("Do you want to see the code?");
if (chek .equals ("yes")) {
System.out.println(fin);
}
Vualt v = new Vualt(fin);
v.tryCode(1);
Jbon jj = new Jbon();
System.out.println(jj.findCode(v));
}
}
