package Sudoku;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI_Sudoku extends JFrame
{
	Sudoku_Logika igra = new Sudoku_Logika();
	JLabel lblStatus = new JLabel("Upisi: " + igra.getPotez());
	
	DugmadSudoku[][] dugme = new DugmadSudoku[3][3];
	
	JButton novaIgra = new JButton("NOVA");
	
	JPanel gornji = new JPanel(new FlowLayout());
	JPanel srednji = new JPanel(new GridLayout(3,3));
	JPanel donji = new JPanel(new FlowLayout());
	
	public void osvezi()
	{
		igra.inic();
		for (int i = 0; i < dugme.length; i++) {
			for (int j = 0; j < dugme.length; j++) {
				dugme[i][j].setText("");
			}
		}
	}
	
	public GUI_Sudoku()
	{
		setBounds(500,100,500,500);
		
		gornji.add(lblStatus);
		getContentPane().add(gornji, BorderLayout.NORTH);
		
		novaIgra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				osvezi();
				
			}
		});
		donji.add(novaIgra);
		getContentPane().add(donji, BorderLayout.SOUTH);
		
		for (int i = 0; i < dugme.length; i++) {
			for (int j = 0; j < dugme.length; j++) {
				DugmadSudoku dugmic = new DugmadSudoku(i, j);
				dugmic.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						igra.napraviPotez(dugmic.getI(), dugmic.getJ());
						if(igra.trenutniPotez == 1)
							dugmic.setText("3");
						else
							dugmic.setText("" + (igra.trenutniPotez-1));
						
						String poruka;
						if(igra.stanje == STANJE_IGRE.GRESKA)
						{
							int odgovorA = JOptionPane.showConfirmDialog(null, "Greska..." + "Da li zelite novu partiju?", "Kraj", JOptionPane.YES_NO_OPTION);
							if(odgovorA == JOptionPane.YES_OPTION)
								osvezi();
							else
								System.exit(EXIT_ON_CLOSE);
						}
						if(igra.stanje == STANJE_IGRE.POBEDA)
						{
							osvezi();
							int odgovorB = JOptionPane.showConfirmDialog(null, "Pobeda! Da li zelite novu partiju?", "Kraj", JOptionPane.YES_NO_OPTION);
							if(odgovorB == JOptionPane.YES_OPTION)
								osvezi();
							else
								System.exit(EXIT_ON_CLOSE);
						}
					}
				});
				srednji.add(dugmic);
				dugme[i][j] = dugmic;
			}
		}
		getContentPane().add(srednji, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
