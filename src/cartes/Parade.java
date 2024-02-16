package cartes;

public class Parade extends Bataille {

	public Parade(int n, Type type) {
		super(n, type);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		if(type == Type.FEU) {
			return "FeuVert";
		}
		if(type == Type.ESSENCE) {
			return "Essence";
		}
		if(type == Type.CREVAISON) {
			return "RoueSecours";
		}
		if(type == Type.ACCIDENT) {
			return "Reparations";
		}
		return "";
	}
	
}
