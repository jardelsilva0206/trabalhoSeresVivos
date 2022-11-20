package Plantae;

import padrao.SeresVivos;

public class Plantae extends SeresVivos {
    private String reino;

    public Plantae() {
        super();
    }

    public Plantae(String nomeSerVivo, String reino) {
        super(nomeSerVivo);
        this.reino = "Plantae";

    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    @Override
    public String toString() {
        return "Plantae [reino=" + reino + "]";
    }

}
