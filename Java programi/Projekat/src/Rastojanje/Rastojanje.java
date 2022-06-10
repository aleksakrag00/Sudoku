package Rastojanje;

public class Rastojanje 
{
	public static double rastojanje(double a1, double b1, double c1, double a2, double b2, double c2)
	{
		return Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1)*(c2-c1)*(c2-c1));
	}
	
	public static boolean razlicite(double a1, double b1, double c1, double a2, double b2, double c2)
	{
		if(rastojanje(a1, b1, c1, a2, b2, c2) == 0)
			return false;
		else
			return true;
	}
}
