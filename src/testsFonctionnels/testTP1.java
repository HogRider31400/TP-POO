package testsFonctionnels;

import cartes.Attaque;
import cartes.Botte;
import cartes.Carte;
import cartes.Parade;
import cartes.Probleme.Type;
import jeu.Sabot;

public class testTP1 {

	public testTP1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		Attaque a = new Attaque(1,Type.ACCIDENT);
		Parade a2 = new Parade(1,Type.ACCIDENT);
		Botte a3 = new Botte(1,Type.ACCIDENT);
		Sabot sab = new Sabot(110);
		sab.ajouterFamille(a);
		sab.ajouterFamille(a2);
		sab.ajouterFamille(a3);
		for(int i = 0; i < 4;i++) {
			System.out.println("youhou " + sab.next());
		}
		
	}

}
