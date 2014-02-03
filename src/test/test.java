package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour, comment allez vous ? Bonne séance de codage ;) ");
		System.err.println("Bonjour, comment allez vous ? Bonne séance de codage ;) ");

		
		if ( args.length > 0) 
			System.out.println(args[0]);
		else
			System.out.println("pas d'arguments");
		}
}