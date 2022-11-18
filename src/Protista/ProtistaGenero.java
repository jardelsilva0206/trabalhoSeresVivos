package Protista;

public class ProtistaGenero extends ProtistaFamilia {
	private String genero;

	public ProtistaGenero(String nomeSerVivo, String reino, String protozoa, String superFilo, String filo,
			String classe, String ordem, String familia, String genero) {
		super(nomeSerVivo, reino, protozoa, superFilo, filo, classe, ordem, familia);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "ProtistaGenero [genero=" + genero + "]";
	}

}
