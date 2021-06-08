
package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;


public class Bon_Bon {
	public static void main(String[] args) {
		
	
	int fin = 0;
String chs = JOptionPane.showInputDialog("What do you want the code to be?");
if (chs .equals ("random")) {
	Random ran = new Random();
	 fin = ran.nextInt(1000000-1+1) + 1;
}
else{
	String sec = JOptionPane.showInputDialog("Choose a number.");
	 fin = Integer.parseInt(sec);
	
}
String chek = JOptionPane.showInputDialog("Do you want to see the code?");
if (chek .equals ("yes")) {
System.out.println(fin);
}
//vault(fin);
	}
	
}
