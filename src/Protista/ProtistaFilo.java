package Protista;

public class ProtistaFilo extends ProtistaSuperfilo {
	private String filo;

	public ProtistaFilo(String nomeSerVivo, String reino, String protozoa, String superFilo, String filo) {
		super(nomeSerVivo, reino, protozoa, superFilo);
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
		return "ProtistaFilo [filo=" + filo + "]";
	}

}
