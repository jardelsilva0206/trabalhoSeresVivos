package Monera;

import padrao.SeresVivos;

public class Monera extends SeresVivos {

    private String reino;

    public Monera(String nomeSerVivo, String reino) {
        super(nomeSerVivo);
        this.reino = reino;
    }

    public Monera(){}

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    @Override
    public String toString() {
        return "Monera{" +
                "reino='" + reino + '\'' +
                '}';
    }
}
