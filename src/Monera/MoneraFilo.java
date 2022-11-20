package Monera;

import padrao.Monera;

public class MoneraFilo extends Monera {
	private String filo;

	public MoneraFilo(String nomeSerVivo, String reino, String filo) {
		super(nomeSerVivo, reino);
		this.filo = filo;
	}

	public MoneraFilo(){
		super();
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	@Override
	public String toString() {
		return "MoneraFilo [filo=" + filo + "]";
	}

}
