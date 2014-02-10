package test;

public class Main 
{
	public static void main(String[] args)
	{
		/**new Lampe();**/
		Lampe maLampe = new Lampe(150);
		
		
		if (maLampe.estAllumee)
			maLampe.eteindre();
		else
			maLampe.allumer();
	}
}
