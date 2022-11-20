package Fungi;

import padrao.Fungi;

public class FungiFilo extends Fungi {

	private String filo;

	public FungiFilo() {
		super();
	}

	public FungiFilo(String nomeSerVivo, String reino, String filo) {
		super(nomeSerVivo, reino);
		this.filo = filo;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	@Override
	public String toString() {
		return "FungiFilo [filo=" + filo + "]";
	}

}
