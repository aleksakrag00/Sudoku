import java.util.Iterator;



public class XOlogika 
{
	public int[][] tabla = new int[3][3];
	private int naPotezu;
	private int brojOdigranihPoteza;
	private STANJE trenutno;
	
	public XOlogika() {
		inic();
	}
	
	public void inic()
	{
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = 0;
			}
		}
		
		naPotezu = 1;
		brojOdigranihPoteza = 0;
		trenutno = STANJE.U_TOKU;
	}
	
	public STANJE proveriStanje()
	{
		
		int gld = 0;
		int spd = 0;
		
		for (int i = 0; i < 3; i++) {
			gld = gld + tabla[i][i];
			spd = spd + tabla[i][2-i];
			int red = 0;
			int kolona = 0;
			
			for (int j = 0; j < 3; j++) {
				red = red + tabla[i][j];
				kolona = kolona + tabla[j][i];
			}

			if(kolona == 3 || red == 3)
			{
				trenutno = STANJE.POBEDIO_X;
				return trenutno;
			}
			else if(kolona == -3 || red == -3)
			{
				trenutno = STANJE.POBEDIO_O;
				return trenutno;
			}
		}
		
		if(gld == 3 || spd == 3)
		{
			trenutno = STANJE.POBEDIO_X;
			return trenutno;
		}
		else if(gld == -3 || spd == -3)
		{
			trenutno = STANJE.POBEDIO_O;
			return trenutno;
		}
		else if(brojOdigranihPoteza == 9)
		{
			trenutno = STANJE.NERESENO;
			return trenutno;
		}
		
		trenutno = STANJE.U_TOKU;
		return trenutno;
	}
	
	public STANJE napraviPotez(int i, int j)
	{
		if(tabla[i][j] == 0)
		{
			tabla[i][j] = getNaPotezu();
			naPotezu *= -1;
			brojOdigranihPoteza += 1;
		}
		trenutno = proveriStanje();
		System.out.println(trenutno + "");
		if(trenutno != STANJE.U_TOKU)
		{
			System.out.println(trenutno + "");
			inic();
		}
		
		return trenutno;
	}
	
	public String koIgra()
	{
		if(naPotezu == 1)
			return "X";
		else
			return "O";
	}

	public int getNaPotezu() {
		return naPotezu;
	}

	public STANJE dajStanje()
	{
		return trenutno;
	}
}
