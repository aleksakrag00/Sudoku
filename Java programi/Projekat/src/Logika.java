
public class Logika 
{
	
	public static double Rastojanje(double a1, double b1, double c1, double a2, double b2, double c2)
	{
		double a = (a2-a1)*(a2-a1);
		double b = (b2-b1)*(b2-b1);
		double c = (c2-c1)*(c2-c1);
		
		return Math.sqrt(a+b+c);
	}
	
	public static boolean Razlicite(double a1, double b1, double c1, double a2, double b2, double c2)
	{
		if(Rastojanje(a1, b1, c1, a2, b2, c2) == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
