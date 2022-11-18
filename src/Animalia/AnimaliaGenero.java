package Animalia;

public class AnimaliaGenero extends AnimaliaFamilia {
	private String genero;

	public AnimaliaGenero(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia,
			String genero) {
		super(nomeSerVivo, reino, filo, classe, ordem, familia);
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
		return "AnimaliaGenero [genero=" + genero + "]";
	}

}
