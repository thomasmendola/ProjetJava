package fr.dawan.syntaxe_de_base.entree_sortie_standard;

public class FonctionPrintEtPrintln {

	public static void main(String[] args) {
		
		/*Afficher : 
		 * Polymorphisme 
		 * veut
		 * dire 
		 * plusieurs 
		 * formes	
		 */
		
		//Chaque System.out.println() affiche une ligne
		//Mauvaise fa�on : on copi� - coll�
//		System.out.println("Polymorphisme");
//		System.out.println("veut");
//		System.out.println("dire");
//		System.out.println("plusieurs");
//		System.out.println("formes");

		
		// \n est une retour � la ligne
		System.out.println("Polymorphisme\nveut\ndire\nplusieurs\nformes\n");
		
		//print : Pas de retour � la ligne apr�s l'affichage
		//println : Retour � la ligne apr�s affichage
		System.out.print("Polymorphisme veut dire plusieurs formes ");
		System.out.print("Heritage");
		
	}

}
