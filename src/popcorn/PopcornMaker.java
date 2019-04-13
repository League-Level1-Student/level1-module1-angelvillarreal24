package popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	
	
	public static void main(String[] args) {
		String flavour=JOptionPane.showInputDialog("What do you want as a flavor?");
		String time =JOptionPane.showInputDialog("How much time?");
		int c = Integer.parseInt(time);
		Popcorn a = new Popcorn(flavour);
		Microwave b = new Microwave();
		b.putInMicrowave(a);
		b.setTime(c);
		b.startMicrowave();
		a.eat(); 
		
	}
}
