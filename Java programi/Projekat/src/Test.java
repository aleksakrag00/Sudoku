import java.util.Scanner;

import Rastojanje.Rastojanje_GUI;
import Sudoku.GUI_Sudoku;
import Sudoku.Sudoku_Logika;
import klk1.GUI_Racunaljka;
import klk1.Racunaljka;

public class Test {

	public static void main(String[] args) {
		/*
		RastojanjeGUI g = new RastojanjeGUI();
		*/
		
		/*
		XOlogika xo = new XOlogika();
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		
		while(true)
		{
			for (int i = 0; i < 3; i++) {
				System.out.println(" --- --- --- ---");
				for (int j = 0; j < 3; j++) {
					System.out.print("| " + xo.tabla[i][j] + " | ");
				}
				System.out.println("");
			}
			a = scanner.nextInt();
			b = scanner.nextInt();
			xo.napraviPotez(a,b);
			}*/
		
		//XO_GUI xo = new XO_GUI();
		
		/*Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println(Racunaljka.saberi(a, b));
		
		System.out.println(Racunaljka.oduzmi(a, b));
		
		System.out.println(Racunaljka.pomnozi(a, b));
		
		System.out.println(Racunaljka.podeli(a, b));*/
		
		//new GUI_Racunaljka();
		
		//new Rastojanje_GUI();
		
		/*Scanner sc = new Scanner(System.in);
		int i;
		int j;
		
		Sudoku_Logika sudoku = new Sudoku_Logika();
		while(true) {
			i = sc.nextInt();
			j = sc.nextInt();
			sudoku.napraviPotez(i, j);
			
			for (int k = 0; k < 3; k++) {
				for (int k2 = 0; k2 < 3; k2++) {
					System.out.print(sudoku.polje[k][k2] + "  ");
				}
				System.out.println("");
			}
			System.out.println(sudoku.stanje);
			System.out.println(sudoku.trenutniPotez);
		}*/
		
		new GUI_Sudoku();
	}

}
