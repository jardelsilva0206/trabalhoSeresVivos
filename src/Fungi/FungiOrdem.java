package Fungi;

public class FungiOrdem extends FungiClasse {

	private String ordem;

	public FungiOrdem() {
		super();
	}

	public FungiOrdem(String nomeSerVivo, String reino, String filo, String classe, String ordem) {
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
		return "FungiOrdem [ordem=" + ordem + "]";
	}

}
