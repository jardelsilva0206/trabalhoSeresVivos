package Plantae;

public class PlantaeFilo extends Plantae {
    private String Filo;

    public PlantaeFilo() {
        super();
    }

    public PlantaeFilo(String nomeSerVivo, String reino, String filo) {
        super(nomeSerVivo, reino);
        this.Filo = filo;
    }

    public String getFilo() {
        return Filo;
    }

    public void setFilo(String filo) {
        this.Filo = filo;
    }

    @Override
    public String toString() {
        return "PlantaeFilo [filo=" + Filo + "]";
    }

}