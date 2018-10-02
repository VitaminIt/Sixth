package newpackage;

public class Frog extends Amphibia {
	private String subType;
	public Frog(int weight, String type, String subType) {
		super(weight, type);
		this.subType=subType;
		// TODO Auto-generated constructor stub
		
	}
	public String getSubType() {
		return subType;
	}
	@Override
	public String toString() {
		return "Frog [subType=" + subType + ", getSubType()=" + getSubType() + "]";
	}

}
