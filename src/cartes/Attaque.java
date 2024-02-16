package cartes;


public class Attaque extends Bataille {

	public Attaque(int n, Type type) {
		super(n, type);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		if(type == Type.FEU) {
			return "FeuRouge";
		}
		if(type == Type.ESSENCE) {
			return "PanneEssence";
		}
		if(type == Type.CREVAISON) {
			return "Crevaison";
		}
		if(type == Type.ACCIDENT) {
			return "Accident";
		}
		return "";
	}

}
