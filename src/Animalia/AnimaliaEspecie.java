package Animalia;

public class AnimaliaEspecie extends AnimaliaGenero {
	private String especie;

	public AnimaliaEspecie(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia,
			String genero, String especie) {
		super(nomeSerVivo, reino, filo, classe, ordem, familia, genero);
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "AnimaliaEspecie [especie=" + especie + "]";
	}

}
