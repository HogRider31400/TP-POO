package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import cartes.Carte;

public class Sabot implements Iterator<Carte> {
	private int nombreOperationsReference = 0;
	private int nombreOperations = 0;
	private Carte[] cartes;
	int nbCartes;
	int indiceIterateur;
	public Sabot(int nbCartes) {
		cartes = new Carte[nbCartes];
		this.nbCartes = 0;
	}
	
	public boolean estVide() {
		if(nbCartes == 0) return true;
		return false;
	}
	
	public void ajouterCarte(Carte carte) throws Exception {
		if(nbCartes+1 == cartes.length) {
			throw new Exception("limite dépassée");
		}
		cartes[nbCartes] = carte;
		nbCartes++;
	}
	
	private int getNb(Carte carte) {
		switch (carte.toString()) {
		case "FeuRouge": {
			return 5;
		}
		case "Accident": return 3;
		case "PanneEssence": return 3;
		case "Crevaison": return 3;
		case "FeuVert": return 14;
		case "Essence": return 6;
		case "Reparations": return 6;
		case "RoueSecours": return 6;
		case "DebutLimite": return 4;
		case "FinLimite": return 6;
		case "Borne25": return 10;
		case "Borne50": return 10;
		case "Borne75": return 10;
		case "Borne100": return 12;
		case "Borne200": return 4;
		default:
			return 1;
		}
	}
	
	public void ajouterFamille(Carte carte) throws Exception {
		int nbAjouter = getNb(carte);
		for(int i = 0; i < nbAjouter;i++) {
			ajouterCarte(carte);
		}
	}
	
	public void ajouterFamilleCarte(Carte[] cartesAjouter) throws Exception {
		for(Carte carte : cartesAjouter) {
			ajouterFamille(carte);
		}
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (indiceIterateur < nbCartes);
	}

	@Override
	public Carte next() {
		verificationConcurrence();
		if(hasNext()) {
			Carte carte = cartes[indiceIterateur];
			indiceIterateur++;
			return carte;
		}
		throw new IllegalStateException("Po de carte");
	}
	
	@Override
	public void remove() {
		verificationConcurrence();
		if(nbCartes < 1) {
			throw new IllegalStateException("ya zebi");
		}
		for(int i = 0; i < nbCartes-1;i++) {
			cartes[i] = cartes[i+1];
		}
		indiceIterateur--;
		nbCartes--;
		nombreOperations++; nombreOperationsReference++; 
	}
	private void verificationConcurrence(){
		if (nombreOperations != nombreOperationsReference)
		 throw new ConcurrentModificationException();
	}
	
	public Carte piocher() {
		Carte carte = next();
		remove();
		return carte;
	}
}
