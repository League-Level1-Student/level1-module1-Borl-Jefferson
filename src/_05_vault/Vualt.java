
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

boolean tryCode(int num) {
	for (int i=0;i<1000000;i++) {
		num = num + 1;
		
		if (num == scode) {
	System.out.println(num);
	return true;	
	}
	}
	return false;
	
}

	}

	
	

