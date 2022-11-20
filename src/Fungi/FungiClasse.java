package Fungi;

public class FungiClasse extends FungiFilo {

	private String classe;

	public FungiClasse() {
		super();
	}

	public FungiClasse(String nomeSerVivo, String reino, String filo, String classe) {
		super(nomeSerVivo, reino, filo);
		this.classe = classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "FungiClasse [classe=" + classe + "]";
	}

}
