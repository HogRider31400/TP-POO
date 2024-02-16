package cartes;

public class Botte extends Probleme {

	public Botte(int n, Type type) {
		super(n, type);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		if(type == Type.FEU) {
			return "VehiculePrioritaire";
		}
		if(type == Type.CREVAISON) {
			return "Increvable";
		}
		if(type == Type.ESSENCE) {
			return "CiterneEssence";
		}
		if(type == Type.ACCIDENT) {
			return "AsDuVolant";
		}
		return "";
	}

}
