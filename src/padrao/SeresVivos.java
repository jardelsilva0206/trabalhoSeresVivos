package padrao;

import java.util.ArrayList;

import Animalia.AnimaliaEspecie;
import Protista.ProtistaGenero;

public class SeresVivos {
	private String nomeSerVivo;
	public ArrayList<AnimaliaEspecie> listaAnimalia = new ArrayList();
	public ArrayList<ProtistaGenero> listaProtista = new ArrayList();

	public SeresVivos(String nomeSerVivo) {
		super();
		this.nomeSerVivo = nomeSerVivo;
	}

	public String getNomeSerVivo() {
		return nomeSerVivo;
	}

	public void setNomeSerVivo(String nomeSerVivo) {
		this.nomeSerVivo = nomeSerVivo;
	}

	@Override
	public String toString() {
		return "SeresVivos [nomeSerVivo=" + nomeSerVivo + "]";
	}

}
