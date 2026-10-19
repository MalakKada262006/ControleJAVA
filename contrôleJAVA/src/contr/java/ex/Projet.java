package contr.java.ex;

public class Projet {
	private String code;
	private String intitule;

	public Projet(String code, String intitule) {
		this.code = code;
		this.intitule = intitule;
	}

	@Override
	public String toString() {
		return "Client [Code: " + code + ", Intitule : " + intitule + "]";
	}
}
