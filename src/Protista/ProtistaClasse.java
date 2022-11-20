package Protista;

public class ProtistaClasse extends ProtistaFilo {
	private String classe;

	public ProtistaClasse(String nomeSerVivo, String reino, String protozoa, String superFilo, String filo,
			String classe) {
		super(nomeSerVivo, reino, protozoa, superFilo, filo);
		this.classe = classe;
	}

	public ProtistaClasse(){
		super();
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "ProtistaClasse [classe=" + classe + "]";
	}

}
