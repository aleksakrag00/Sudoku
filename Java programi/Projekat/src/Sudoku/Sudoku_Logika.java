package Sudoku;

public class Sudoku_Logika 
{
	public int[][] polje = new int[3][3];
	public int trenutniPotez;
	public STANJE_IGRE stanje;
	public int brojOdigranihPoteza;
	
	public Sudoku_Logika()
	{
		inic();
	}
	
	public void inic()
	{
		trenutniPotez = 1;
		stanje = STANJE_IGRE.U_TOKU;
		brojOdigranihPoteza = 0;
		
		for (int i = 0; i < polje.length; i++) {
			for (int j = 0; j < polje.length; j++) {
				polje[i][j] = 0;
			}
		}
	}
	
	/*public STANJE_IGRE proveriStanje()
	{
		for (int i = 0; i < polje.length; i++) {
			int
			for (int j = 0; j < polje.length; j++) {
				
			}
		}
	}*/
	
	public STANJE_IGRE napraviPotez(int i, int j)
	{
		if(polje[i][j] == 0)
		{
			for (int i2 = 0; i2 < polje.length; i2++) {
				if((polje[i2][j] != 0 && trenutniPotez == polje[i2][j]) || (polje[i][i2] != 0 && trenutniPotez == polje[i][i2]))
				{
					stanje = STANJE_IGRE.GRESKA;
					return STANJE_IGRE.GRESKA;
				}
			}
			polje[i][j] = trenutniPotez;
			if(trenutniPotez < 3)
				trenutniPotez += 1;
			else
				trenutniPotez = 1;
			brojOdigranihPoteza += 1;
			if(brojOdigranihPoteza == 9)
			{
				stanje = STANJE_IGRE.POBEDA;
				return STANJE_IGRE.U_TOKU;
			}
			else
			{
				stanje = STANJE_IGRE.U_TOKU;
				return STANJE_IGRE.U_TOKU;
			}
		}
		else
		{
			stanje = STANJE_IGRE.U_TOKU;
			return STANJE_IGRE.U_TOKU;
		}
	}
	
	public int getPotez()
	{
		return trenutniPotez;
	}
}
