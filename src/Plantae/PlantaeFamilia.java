package Plantae;

public class PlantaeFamilia extends PlantaeOrdem {
    private String familia;

    public PlantaeFamilia(){
        super();
    }

    public PlantaeFamilia(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia){
        super(nomeSerVivo, reino, filo, classe, ordem);
        this.familia = familia;
    }
    
    public String getFamilia(){
        return familia;
    }

    public void setFamilia(String familia){
        this.familia = familia;
    }

    @Override
    public String toString(){
        return "PlantaeFamilia [familia=" + familia + "]";
    }

}
