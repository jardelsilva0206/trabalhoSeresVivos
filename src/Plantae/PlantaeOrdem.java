package Plantae;


public class PlantaeOrdem extends PlantaeClasse {
    private String ordem;

    public PlantaeOrdem(){
        super();
    }

    public PlantaeOrdem(String nomeSerVivo, String reino, String filo, String classe, String ordem){
        super(nomeSerVivo, reino, filo, classe);
        this.ordem = ordem;
    }

    public String getOrdem(){
        return ordem;
    }

    public void setOrdem(String ordem){
        this.ordem = ordem;
    }

    @Override
    public String toString(){
        return "PlantaeOrdem [ordem=" + ordem + "]";
    }

}
