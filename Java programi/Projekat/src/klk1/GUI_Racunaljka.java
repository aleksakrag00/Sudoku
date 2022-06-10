package klk1;

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

public class GUI_Racunaljka extends JFrame
{
	JLabel lblNaslov = new JLabel("Racunaljka");
	
	JLabel lblVrednostA = new JLabel("Vrednost a");
	JTextArea unosA = new JTextArea();
	JLabel lblVrednostB = new JLabel("Vrednost b");
	JTextArea unosB = new JTextArea();
	
	JLabel lblOperacije = new JLabel("Operacije");
	
	JButton dugmePlus = new JButton("+");
	JButton dugmeMinus = new JButton("-");
	JButton dugmePuta = new JButton("*");
	JButton dugmePodeljeno = new JButton("/");
	
	JLabel lblRezultat = new JLabel("Rezultat: ");
	JTextArea zapravoRezultat = new JTextArea();
	
	JButton dugmeNova = new JButton("Nova");
	JButton dugmeIzlaz = new JButton("Izlaz");
	
	JPanel pnlNaslov = new JPanel(new FlowLayout());
	JPanel pnlUnos = new JPanel(new GridLayout(2, 2));
	JPanel pnlOpcije = new JPanel(new GridLayout(5, 1));
	JPanel pnlKraj = new JPanel(new FlowLayout());
	
	
	
	public GUI_Racunaljka() 
	{
		setBounds(500,200,500,500);
		
		pnlNaslov.add(lblNaslov);
		pnlNaslov.setBackground(Color.green);
		getContentPane().add(pnlNaslov, BorderLayout.NORTH);
		
		pnlUnos.add(lblVrednostA);
		pnlUnos.add(unosA);
		pnlUnos.add(lblVrednostB);
		pnlUnos.add(unosB);
		getContentPane().add(pnlUnos, BorderLayout.CENTER);
		
		pnlOpcije.add(lblOperacije);
		pnlOpcije.add(dugmePlus);
		pnlOpcije.add(dugmeMinus);
		pnlOpcije.add(dugmePuta);
		pnlOpcije.add(dugmePodeljeno);
		getContentPane().add(pnlOpcije, BorderLayout.EAST);
		
		zapravoRezultat.setPreferredSize(new Dimension(50,20));
		pnlKraj.add(lblRezultat);
		pnlKraj.add(zapravoRezultat);
		pnlKraj.add(dugmeNova);
		pnlKraj.add(dugmeIzlaz);
		getContentPane().add(pnlKraj, BorderLayout.SOUTH);
		
		dugmePlus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(unosA.getText());
				double b = Double.parseDouble(unosB.getText());
				zapravoRezultat.setText(Racunaljka.saberi(a, b) + "");
			}
		});
		
		dugmeMinus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(unosA.getText());
				double b = Double.parseDouble(unosB.getText());
				zapravoRezultat.setText(Racunaljka.oduzmi(a, b) + "");
			}
		});
		
		dugmePuta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(unosA.getText());
				double b = Double.parseDouble(unosB.getText());
				zapravoRezultat.setText(Racunaljka.pomnozi(a, b) + "");
			}
		});
		
		dugmePodeljeno.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(unosA.getText());
				double b = Double.parseDouble(unosB.getText());
				zapravoRezultat.setText(Racunaljka.podeli(a, b) + "");
			}
		});
		
		dugmeIzlaz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
				
			}
		});
		
		dugmeNova.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				unosA.setText("");
				unosB.setText("");
				zapravoRezultat.setText("");
			}
		});
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
