package Fungi;

import padrao.SeresVivos;

public class Fungi extends SeresVivos {

	private String reino;

	public Fungi() {
		super();
	}

	public Fungi(String nomeSerVivo, String reino) {
		super(nomeSerVivo);
		this.reino = "Fungi";
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	@Override
	public String toString() {
		return "Fungi [reino=" + reino + "]";
	}

}
