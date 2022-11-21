package Plantae;

public class PlantaeGenero extends PlantaeFamilia {
    private String genero;

    public PlantaeGenero() {
        super();
    }

    public PlantaeGenero(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia,
            String genero) {
        super(nomeSerVivo, reino, filo, classe, ordem, familia);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero){
        this.genero =genero;
    }

    @Override
    public String toString() {
        return "PlantaeGenero [genero=" + genero + "]";
    }

}