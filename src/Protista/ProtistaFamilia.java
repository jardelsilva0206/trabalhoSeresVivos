package Protista;

public class ProtistaFamilia extends ProtistaOrdem {
	private String familia;

	public ProtistaFamilia(String nomeSerVivo, String reino, String protozoa, String superFilo, String filo,
			String classe, String ordem, String familia) {
		super(nomeSerVivo, reino, protozoa, superFilo, filo, classe, ordem);
		this.familia = familia;
	}

	public ProtistaFamilia(){
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
		return "ProtistaFamilia [familia=" + familia + "]";
	}

}
