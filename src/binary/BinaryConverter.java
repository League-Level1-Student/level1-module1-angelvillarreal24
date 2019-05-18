package binary;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	JTextField text;
	
	public BinaryConverter() {
		
	}
	public void createUI() {
	
	frame = new JFrame();
	panel = new JPanel();
	label = new JLabel();
	button = new JButton();
	text = new JTextField(20);
					
		
	frame.add(panel);
	panel.add(label);
	panel.add(text);
	panel.add(button);
	
	button.setText("Convert");
	frame.setTitle("Binary to ASCII");
	frame.pack();
	frame.setVisible(true);
	
	button.addActionListener(this);
}
	public static void main(String[] args) {
		BinaryConverter a = new BinaryConverter();
		a.createUI();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String legoMyEgo = text.getText();
		String numbers = convert(legoMyEgo);
		label.setText(numbers);
		frame.pack();
		
		// TODO Auto-generated method stub		
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
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
}
