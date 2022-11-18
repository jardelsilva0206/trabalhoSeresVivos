package Animalia;

public class AnimaliaFilo extends Animalia {
	private String filo;

	public AnimaliaFilo(String nomeSerVivo, String reino, String filo) {
		super(nomeSerVivo, reino);
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
		return "AnimaliaFilo [filo=" + filo + "]";
	}

}
