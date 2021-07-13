package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Monke implements ActionListener {
	JTextField in = new JTextField(20);
JLabel jell = new JLabel();
JPanel jepp = new JPanel();
public void run() {

	JFrame jeff = new JFrame();
jeff.setVisible(true);
	jeff.getContentPane().add(jepp);
	JButton jebb = new JButton("convert");
	jepp.add(in);
	jepp.add(jebb);
            jebb.addActionListener(this);

	
}
static String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String num = in.getText();
	String fin = convert(num);
	jell.setText(fin);
	jepp.add(jell);
}	

}