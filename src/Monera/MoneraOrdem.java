package Monera;

import Monera.MoneraClasse;

public class MoneraOrdem extends MoneraClasse {
	private String ordem;

	public MoneraOrdem(String nomeSerVivo, String reino, String filo, String classe, String ordem) {
		super(nomeSerVivo, reino, filo, classe);
		this.ordem = ordem;
	}

	public MoneraOrdem(){
		super();
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		return "MoneraOrdem [ordem=" + ordem + "]";
	}

}
