package Plantae;

public class PlantaeFilo extends Plantae {
    private String Filo;

    public PlantaeFilo() {
        super();
    }

    public PlantaeFilo(String nomeSerVivo, String reino, String filo) {
        super(nomeSerVivo, reino);
        this.filo = filo;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    @Override
    public String toString() {
        return "PlantaeFilo [filo=" + filo + "]";
    }

}