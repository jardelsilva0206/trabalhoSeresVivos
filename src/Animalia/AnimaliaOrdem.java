package Animalia;

public class AnimaliaOrdem extends AnimaliaClasse {
	private String ordem;

	public AnimaliaOrdem(){
		super();
	}

	public AnimaliaOrdem(String nomeSerVivo, String reino, String filo, String classe, String ordem) {
		super(nomeSerVivo, reino, filo, classe);
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
		return "AnimaliaOrdem [ordem=" + ordem + "]";
	}

}
