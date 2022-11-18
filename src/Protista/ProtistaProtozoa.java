package Protista;

public class ProtistaProtozoa extends Protista {
	private String protozoa;

	public ProtistaProtozoa(String nomeSerVivo, String reino, String protozoa) {
		super(nomeSerVivo, reino);
		this.protozoa = protozoa;
	}

	public String getProtozoa() {
		return protozoa;
	}

	public void setProtozoa(String protozoa) {
		this.protozoa = protozoa;
	}

	@Override
	public String toString() {
		return "ProtistaProtozoa [protozoa=" + protozoa + "]";
	}

}
