package padrao;

public class SeresVivos {
	private String nomeSerVivo;

	public SeresVivos(){}

	public SeresVivos(String nomeSerVivo) {
		super();
		this.nomeSerVivo = nomeSerVivo;
	}

	public String getNomeSerVivo() {
		return nomeSerVivo;
	}

	public void setNomeSerVivo(String nomeSerVivo) {
		this.nomeSerVivo = nomeSerVivo;
	}

	@Override
	public String toString() {
		return "SeresVivos [nomeSerVivo=" + nomeSerVivo + "]";
	}

}
