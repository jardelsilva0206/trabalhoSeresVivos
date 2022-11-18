package Monera;

import Monera.MoneraFamilia;

public class MoneraGenero extends MoneraFamilia {
	private String genero;

	public MoneraGenero(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia,
						String genero) {
		super(nomeSerVivo, reino, filo, classe, ordem, familia);
		this.genero = genero;
	}

	public MoneraGenero(){
		super();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "MoneraGenero [genero=" + genero + "]";
	}


}
