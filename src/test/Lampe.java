package test;

public class Lampe 
{
	private static final int PUISSANCE_DEFAULT = 100;
	//entier definnissant la puissance de la lampe
	public int puissance;
	//bolleen donnat l'état de la lampe
	public boolean estAllumee;
	
	/**
	 * initialisation de la lampe: puissance a 100 (et eteinte).
	 */
	public Lampe()
	{
		this(PUISSANCE_DEFAULT);
	}
	/**
	 * Affecte la puissance p à la lampe (la lampe s'eteint).
	 * @param p puissance de la lampe
	 */
	public Lampe(int p)
	{
		this.puissance = p;
		this.estAllumee = false;
	}
	
	/**
	 * Retourne l'etat alumée ou non de la lampe.
	 */
	public void allumer()
	{
		this.estAllumee = true;
	}
	
	/**
	 * Eteint la lampe
	 */
	public void eteindre()
	{
		this.estAllumee = false;
	}
	
	/**
	 * Retourne la puissance actuelle parametrée.
	 * @return
	 */
	public int getpuissance()
	{
		return this.puissance;
	}
	/** Retourne l'etat de la lampe. */
	public boolean estAllumee()
	{
		return estAllumee;
	}
	
}
