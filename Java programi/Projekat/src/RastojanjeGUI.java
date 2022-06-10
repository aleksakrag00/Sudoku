import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RastojanjeGUI extends JFrame
{
	public RastojanjeGUI()
	{
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
		JPanel unos = new JPanel(new GridLayout(3,4));
		JPanel dugme = new JPanel(new FlowLayout());
		JPanel izlaz = new JPanel(new FlowLayout());
		
		JLabel labela1 = new JLabel("a1 = ");
		JLabel labela2 = new JLabel("a2 = ");
		JLabel labelb1 = new JLabel("b1 = ");
		JLabel labelb2 = new JLabel("b2 = ");
		JLabel labelc1 = new JLabel("c1 = ");
		JLabel labelc2 = new JLabel("c2 = ");
		
		JTextArea texta1 = new JTextArea();
		JTextArea texta2 = new JTextArea();
		JTextArea textb1 = new JTextArea();
		JTextArea textb2 = new JTextArea();
		JTextArea textc1 = new JTextArea();
		JTextArea textc2 = new JTextArea();
		
		unos.add(labela1);
		unos.add(texta1);
		unos.add(labela2);
		unos.add(texta2);
		unos.add(labelb1);
		unos.add(textb1);
		unos.add(labelb2);
		unos.add(textb2);
		unos.add(labelc1);
		unos.add(textc1);
		unos.add(labelc2);
		unos.add(textc2);
		
		getContentPane().add(unos, BorderLayout.NORTH);
		unos.setBackground(Color.yellow);
		
		JButton dugmence = new JButton("Izracunaj");
		dugme.add(dugmence);
		getContentPane().add(dugme, BorderLayout.CENTER);
		
		JLabel rastojanjeJe = new JLabel("Rastojanje je: ");
		JTextArea tzr = new JTextArea();
		tzr.setPreferredSize(new Dimension(50, 20));
		
		izlaz.add(rastojanjeJe);
		izlaz.add(tzr);
		getContentPane().add(izlaz, BorderLayout.SOUTH);
		
		dugmence.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double a1 = Double.parseDouble(texta1.getText());
				double b1 = Double.parseDouble(textb1.getText());
				double c1 = Double.parseDouble(textc1.getText());
				
				double a2 = Double.parseDouble(texta2.getText());
				double b2 = Double.parseDouble(textb2.getText());
				double c2 = Double.parseDouble(textc2.getText());
				
				double rastojanje = Logika.Rastojanje(a1,b1,c1,a2,b2,c2);
				tzr.setText(rastojanje + "");
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
}
