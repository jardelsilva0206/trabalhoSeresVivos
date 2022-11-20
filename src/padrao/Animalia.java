package padrao;

import padrao.SeresVivos;

public class Animalia extends SeresVivos {
	private String reino;

	public Animalia(){
		super();
	}

	public Animalia(String nomeSerVivo, String reino) {
		super(nomeSerVivo);
		this.reino = "Animalia";
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	@Override
	public String toString() {
		return "Animalia [reino=" + reino + "]";
	}

}
