import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class XO_GUI extends JFrame
{
	Dugmad[][] duggg = new Dugmad[3][3];
	
	public XO_GUI() 
	{
		setBounds(100,100,400,400);
		setVisible(true);
		
		/*ArrayList<Dugmad> dugmici = new ArrayList<>();
		int a = 0;*/
		/*JButton dgme = new JButton("Kurc");
		getContentPane().add(dgme, BorderLayout.CENTER);*/
		
		JPanel panelNaPotezu = new JPanel(new FlowLayout());
		JPanel panelTabla = new JPanel(new GridLayout(3,3));
		JPanel panelDugme = new JPanel(new FlowLayout());
		XOlogika igra = new XOlogika();
		
		JLabel naP = new JLabel("Na potezu je: " + igra.koIgra());
		naP.setPreferredSize(new Dimension(140, 50));
		panelNaPotezu.add(naP);
		
		JButton restart = new JButton("Restart");
		restart.setPreferredSize(new Dimension(150,100));
		restart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				igra.inic();
				osveziGrafiku();
				
				
			}
		});
		panelDugme.add(restart);
		
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Dugmad dugmici = new Dugmad(i, j);
				panelTabla.add(dugmici);
				dugmici.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						System.out.println(dugmici.getI() + ", " + dugmici.getJ());
						dugmici.setText(igra.koIgra());
						igra.napraviPotez(dugmici.getI(), dugmici.getJ());
						naP.setText("Na potezu je: " + igra.koIgra());
						
						if(igra.dajStanje() == STANJE.NERESENO || igra.dajStanje() == STANJE.POBEDIO_O || igra.dajStanje() == STANJE.POBEDIO_X)
							{
							int odgovor = JOptionPane.showConfirmDialog(null, "", "Kraj igre", JOptionPane.YES_NO_OPTION);
							System.out.println(odgovor);
							}
					}
				});
				duggg[i][j] = dugmici;
				}
		}
		
		getContentPane().add(panelNaPotezu, BorderLayout.NORTH);
		getContentPane().add(panelTabla, BorderLayout.CENTER);
		getContentPane().add(panelDugme, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	public void osveziGrafiku()
	{
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				duggg[i][j].setText("");
			}
		}
	}
	
}
