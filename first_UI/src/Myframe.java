import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Myframe extends JFrame implements ActionListener{
	Container cont;
	JLabel text;
	JTextField textfield;
	JButton button;
	
	Myframe(){
		text = new JLabel("FileName:");
		textfield = new JTextField(20);
		button = new JButton("OK");
		cont = getContentPane();
		cont.setLayout(new GridLayout(2,2));
		cont.add(text);
		cont.add(textfield);
		cont.add(button);
		
		button.addActionListener(this);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE );
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe m = new Myframe();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser filech = new JFileChooser();
		filech.showDialog(this, null);
		textfield.setText(filech.getSelectedFile().toString());
	}

}
