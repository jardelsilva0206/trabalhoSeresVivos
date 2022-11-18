package Protista;

public class ProtistaOrdem extends ProtistaClasse {
	private String ordem;

	public ProtistaOrdem(String nomeSerVivo, String reino, String protozoa, String superFilo, String filo,
			String classe, String ordem) {
		super(nomeSerVivo, reino, protozoa, superFilo, filo, classe);
		this.ordem = ordem;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	@Override
	public String toString() {
		return "ProtistaOrdem [ordem=" + ordem + "]";
	}

}
