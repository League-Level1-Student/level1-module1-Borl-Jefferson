
package _05_vault;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

import com.sun.jdi.connect.Connector.BooleanArgument;


public class Vualt {
int scode;
Vualt (int secret){
	this.scode = secret;
	}

public boolean tryCode(int num) {

		
		if (num == scode) {

	return true;	
	}
	
	return false;
	
}

	}

	
	

