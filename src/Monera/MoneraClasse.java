package Monera;

import Monera.MoneraFilo;

public class MoneraClasse extends MoneraFilo {
	private String classe;

	public MoneraClasse(String nomeSerVivo, String reino, String filo, String classe) {
		super(nomeSerVivo, reino, filo);
		this.classe = classe;
	}

	public MoneraClasse(){
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
		return "MoneraClasse [classe=" + classe + "]";
	}

}
