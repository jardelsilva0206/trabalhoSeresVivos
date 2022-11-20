package Fungi;

public class FungiFamilia extends FungiOrdem {

	private String familia;

	public FungiFamilia() {
		super();
	}

	public FungiFamilia(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia) {
		super(nomeSerVivo, reino, filo, classe, ordem);
		this.familia = familia;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "FungiFamilia [familia=" + familia + "]";
	}

}
