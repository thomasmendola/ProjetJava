package fr.dawan.conditions.exercices;

import java.util.Scanner;

public class AnneeBissextile {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int annee;
		
		//Fournir les donn�es d'entr�e
		System.out.println("Saisir une ann�e : ");
		annee = clavier.nextInt();
		
		if(((annee % 4 == 0) && (annee % 100 != 0)) || (annee % 400 == 0)) {
			System.out.println(annee + " est une ann�e bissextile");
		} else {
			System.out.println("Ann�e simple");
		}

	}

}
