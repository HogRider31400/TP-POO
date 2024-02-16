package cartes;

public abstract class Probleme extends Carte {
	public enum Type{
		FEU("feu"),ESSENCE("essence"),CREVAISON("crevaison"),ACCIDENT("accident");
		private String nom;
		private Type(String nom) {
			this.nom = nom;
		}
		public String getNom() {
			return nom;
		}
		public String toString() {
			return getNom();
		}
	}
	Type type;
	protected Probleme(int n, Type type) {
		super(n);
		this.type = type;
	}

}
