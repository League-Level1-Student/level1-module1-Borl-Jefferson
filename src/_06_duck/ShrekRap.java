package _06_duck;

import javax.swing.JOptionPane;

public class ShrekRap {
	int peopleInSwamp;
    int howManyMilesWalked;
    ShrekRap(int peopleInSwamp, int howManyMilesWalked) {
        this.peopleInSwamp = peopleInSwamp;
        this.howManyMilesWalked = howManyMilesWalked;
 }

    public void throe() {
   JOptionPane.showMessageDialog(null, "Shrek picks up a rock at throws it at a tree, what did you expect to happen?"); 
    }
public void eat() {
	JOptionPane.showMessageDialog(null, "You see Shrek put his finger in his nose and you wonder why.");
}
}