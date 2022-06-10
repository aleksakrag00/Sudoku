package Sudoku;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DugmadSudoku extends JButton
{
	public int i;
	public int j;
	
	public DugmadSudoku(int i, int j) 
	{
		super();
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	
}
