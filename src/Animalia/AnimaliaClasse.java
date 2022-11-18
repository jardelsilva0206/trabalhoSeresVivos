package Animalia;

public class AnimaliaClasse extends AnimaliaFilo {
	private String classe;


	public AnimaliaClasse(){
		super();
	}
	public AnimaliaClasse(String nomeSerVivo, String reino, String filo, String classe) {
		super(nomeSerVivo, reino, filo);
		this.classe = classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "AnimaliaClasse [classe=" + classe + "]";
	}

}
