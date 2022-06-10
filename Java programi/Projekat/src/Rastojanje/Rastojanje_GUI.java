package Rastojanje;

import java.awt.BorderLayout;
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

public class Rastojanje_GUI extends JFrame
{
	
	JLabel lblA1 = new JLabel("a1= ");
	JTextArea textA1 = new JTextArea();
	
	JLabel lblB1 = new JLabel("b1= ");
	JTextArea textB1 = new JTextArea();
	
	JLabel lblC1 = new JLabel("c1= ");
	JTextArea textC1 = new JTextArea();
	
	JLabel lblA2 = new JLabel("a2= ");
	JTextArea textA2 = new JTextArea();
	
	JLabel lblB2 = new JLabel("b2= ");
	JTextArea textB2 = new JTextArea();
	
	JLabel lblC2 = new JLabel("c2= ");
	JTextArea textC2 = new JTextArea();
	
	JPanel unos = new JPanel(new GridLayout(3,4));
	
	JButton izracunaj = new JButton("Izracunaj");
	
	JPanel dugmePanel = new JPanel(new FlowLayout());
	
	JLabel rastojanjeJe = new JLabel("Rastojanje je");
	
	JTextArea rastojanje = new JTextArea();
	
	JPanel izlaz = new JPanel(new FlowLayout());
	
	public Rastojanje_GUI() 
	{
		setBounds(500,200,500,500);
		setTitle("Rastojanje izmedju dve tacke");
		
		unos.add(lblA1);
		unos.add(textA1);
		
		unos.add(lblA2);
		unos.add(textA2);
		
		unos.add(lblB1);
		unos.add(textB1);
		
		unos.add(lblB2);
		unos.add(textB2);
		
		unos.add(lblC1);
		unos.add(textC1);
		
		unos.add(lblC2);
		unos.add(textC2);
		
		getContentPane().add(unos, BorderLayout.NORTH);
		
		dugmePanel.add(izracunaj);
		
		getContentPane().add(dugmePanel, BorderLayout.CENTER);
		
		rastojanje.setPreferredSize(new Dimension(100,20));
		izlaz.add(rastojanjeJe);
		izlaz.add(rastojanje);
		
		getContentPane().add(izlaz, BorderLayout.SOUTH);
		
		izracunaj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double a1 = Double.parseDouble(textA1.getText());
				double a2 = Double.parseDouble(textA2.getText());
				double b1 = Double.parseDouble(textB1.getText());
				double b2 = Double.parseDouble(textB2.getText());
				double c1 = Double.parseDouble(textC1.getText());
				double c2 = Double.parseDouble(textC2.getText());
				
				if(Rastojanje.razlicite(a1, b1, c1, a2, b2, c2))
				{
					rastojanje.setText(Rastojanje.rastojanje(a1, b1, c1, a2, b2, c2) + "");
				}
				else
				{
					rastojanje.setText("Uneli ste istu tacku");
				}
			}
		});
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
