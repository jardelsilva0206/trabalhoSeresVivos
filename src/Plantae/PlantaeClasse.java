package Plantae;

public class PlantaeClasse extends PlantaeFilo {
    private String classe;

    public PlantaeClasse() {
        super();
    }

    public PlantaeClasse(String nomeSerVivo, String reino, String filo, String classe) {
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
        return "PlantaeClasse [classe=" + classe + "]";
    }

}
