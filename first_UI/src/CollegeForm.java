import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class CollegeForm extends JFrame implements ActionListener,MouseListener{
	JPanel p;
	Container cont;
	JLabel textname;
	JLabel textcollege;
	JLabel textgender;
	JTextField name;
	JComboBox combobox;
	JRadioButton radio1;
	JRadioButton radio2;
	JButton button;
	ButtonGroup bg;
	String[] s=new String[]{"Select a option","Atharva","TSEC","Soamaya"};
	CollegeForm(){
		bg=new ButtonGroup();
		textname=new JLabel("Name");
		textcollege=new JLabel("College");
		textgender=new JLabel("Gender");
		name=new JTextField(20);
		combobox=new JComboBox(s);
		radio1 = new JRadioButton("Male");
		radio2 = new JRadioButton("Female");
		button = new JButton("Submit");
		bg.add(radio1);
		bg.add(radio2);
		p=new JPanel();
		p.add(radio1);
		p.add(radio2);
		cont = getContentPane();
		cont.setLayout(new GridLayout(5,2));
		cont.add(textname);
		cont.add(name);
		cont.add(textcollege);
		cont.add(combobox);
		cont.add(textgender);
		cont.add(p);
		cont.add(button);
		button.addActionListener(this);
		textname.addMouseListener(this);
		textcollege.addMouseListener(this);
		textgender.addMouseListener(this);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE );
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CollegeForm m = new CollegeForm();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String nam=name.getText().toString();
		String coll=combobox.getSelectedItem().toString();
		String gen;
		if(radio1.isSelected())
		{
			gen=radio1.getText().toString();
		}
		else{
			gen=radio2.getText().toString();
		}
		System.out.println(nam+" "+coll+" "+gen);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JColorChooser color = new JColorChooser();
		e.getComponent().setForeground(color.showDialog(this, "My Color Chooser", Color.cyan));
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
