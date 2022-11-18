package Monera;

import Monera.MoneraOrdem;

public class MoneraFamilia extends MoneraOrdem {
	private String familia;

	public MoneraFamilia(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia) {
		super(nomeSerVivo, reino, filo, classe, ordem);
		this.familia = familia;
	}

	public MoneraFamilia (){
		super();
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "MoneraFamilia [familia=" + familia + "]";
	}

}
