package Plus_Moins;

import java.util.Scanner;

public class Main {
	private final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		final int MAX = 1000;
		final int MIN = 1;
		int nombreAleatoire = (int)(Math.random()*(MAX-MIN))+1;
		int choix;
		
		
		
			
		do
		{
			System.out.println("Devinez le nombre ");
			choix = sc.nextInt();
			if(choix>nombreAleatoire)
			{
				System.out.println("Votre nombre est trop grand");
			}
			else if (choix<nombreAleatoire) {
				System.out.println("Votre nombre est trop petit");
				
			}
			else
			{
				System.out.println("Vous avez trouvé le bon nombre");
			}
		}
		while(choix!=nombreAleatoire);
		
		
		
	}
		

}
