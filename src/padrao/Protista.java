package padrao;

import padrao.SeresVivos;

public class Protista extends SeresVivos {
	private String reino;

	public Protista(String nomeSerVivo, String reino) {
		super(nomeSerVivo);
		this.reino = reino;
	}

	public Protista(){
		super();
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	@Override
	public String toString() {
		return "Protista [reino=" + reino + "]";
	}

}
