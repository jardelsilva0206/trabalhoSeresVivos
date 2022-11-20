package Protista;

public class ProtistaSuperfilo extends ProtistaProtozoa {
	private String superFilo;

	public ProtistaSuperfilo(String nomeSerVivo, String reino, String protozoa, String superFilo) {
		super(nomeSerVivo, reino, protozoa);
		this.superFilo = superFilo;
	}

	public ProtistaSuperfilo(){
		super();
	}

	public String getSuperFilo() {
		return superFilo;
	}

	public void setSuperFilo(String superFilo) {
		this.superFilo = superFilo;
	}

}
