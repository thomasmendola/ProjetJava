package fr.dawan.conditions;

import java.util.Scanner;

public class InstructionSwitch {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int jours = 7;
		
		//Founir les donn�es d'entr�e
		System.out.println("Saisir le numero du jour: ");
		jours = clavier.nextInt();
		
		/*
		 * Premi�re exemple utilisation du bloc ELSE-IF
		 */
//		if(jours == 1) {
//			System.out.println("Lundi");
//		} else if(jours == 2) {
//			System.out.println("Mardi");
//		}
//		else if(jours == 3) {
//			System.out.println("Mercredi");
//		}
//		else if(jours == 4) {
//			System.out.println("Jeudi");
//		}
//		else if(jours == 5) {
//			System.out.println("vendredi");
//		}
//		else if(jours == 6) {
//			System.out.println("Samedi");
//		} 
//		else if(jours == 7) {
//			System.out.println("Samedi");
//		} 
//		else {
//			System.out.println("Entr�e invalide : Veuillez saisir le num�ro de jours entre 1 et 7.");
//		}
		
		/*
		 * 2�me exemple : Instruction Switch
		 * Switch : variante du if/else/if-else
		 * Pour une question de rapidit� et de performance, le switch est pr�fer� aux blocs if/else-if/else
		 * 
		 * L'instruction switch est beaucoup plus que l'instruction if/else-if/else
		 * 
		 * Avec l'instruction : 
		 * Au lieu d'�valuer chaque condition s�quentiellement, il suffit de rechercher une fois l'expression 
		 * et de passer directement � la condition vraie
		 * 
		 * L'expression est evalu�e une fois dans le switch
		 * Le break permet de sortir du switch quand une des cas est verifi�e
		 * 
		 * Le switch on peut l'utiliser lorsqu'on a des conditions "� la carte"
		 * 
		 */	

//		switch (jours) {
//		case 1:
//			System.out.println("Lundi");
//			break;
//		case 2:
//			System.out.println("Mardi");
//			break;
//		case 3:
//			System.out.println("Mercredi");
//			break;
//		case 4:
//			System.out.println("Jeudi");
//			break;
//		case 5:
//			System.out.println("Vendredi");
//			break;
//		case 6:
//			System.out.println("Samedi");
//			break;
//		case 7:
//			System.out.println("Dimanche");
//			break;
//		default:
//			System.out.println("Entr�e invalide : Veuillez saisir le num�ro de jours entre 1 et 7.");
//			break;
//		}
		
		switch(jours) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Semaine de travail");
			break;
		case 6:
		case 7:
			System.out.println("Week end");
			break;
			default:
				System.out.println("Entr�e invalide! Veuillez saisir le num�ro de jours entre 1 et 7.");		
		}
		
	}

}
