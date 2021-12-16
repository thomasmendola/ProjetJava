package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleDoWhile {

	/*
	 * DO-WHILE : 
	 * Permet de repeter des instructions tant qu'une condition n'est pas verifi�e. 
	 * Comme la condition est test�e � la fin, on est s�re de passer dans le bloc d'instruction au moins une fois
	 */
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		int age = 0;
		
		do {
			System.out.println("Entrer votre age : ");
			age = clavier.nextInt();
		} while(age <= 0);
		
		System.out.println("Vous avez " + age + " ans");
		
		
		/*
		 * Conclusion : 
		 * Contrairement � la boucle for, on ne connait pas le nombre de fois que ce bloc d'instruction va se repeter
		 * Si vous connaissez le nombre d'it�ration de preferable utilis� la boucle FOR, dans le cas contraire
		 * utilis� les boucles WHILE ou DO-WHILE
		 */
	}

}
