package Plantae;
import java.util.Scanner;

public class PlantaeEspecie extends PlantaeGenero{
    private String especie;
    private Scanner sc = new Scanner (System.in);

    public PlantaeEspecie(){
        super();
    };

    public PlantaeEspecie(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia, String genero, String especie){
        super(nomeSerVivo,reino,filo,classe,ordem,familia,genero);
        this.especie=especie;
    }

    public void cadastrar(){
        System.out.println("Filo");
        setFilo(sc.next());
        System.out.println("Classe");
        setClasse(sc.next());
        System.out.println("Ordem");
        setOrdem(sc.next());
        System.out.println("Familia");
        setFamilia(sc.next());
        System.out.println("Gênero");
        setGenero(sc.next());
        System.out.println("Espécie");
        this.especie = sc.next();

    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public void atualizar(){
        System.out.println("Filo");
        setFilo(sc.next());
        System.out.println("Classe");
        setClasse(sc.next());
        System.out.println("Ordem");
        setOrdem(sc.next());
        System.out.println("Familia");
        setFamilia(sc.next());
        System.out.println("Gênero");
        setGenero(sc.next());
        System.out.println("Espécie");
        this.especie = sc.next();

    }

    @Override
    public String toString() {
        return String.format("Reino: %s, Filo: %s, Classe: %s, Ordem: %s," +
                        " Família: %s, Gênero: %s, Espécie: %s", getReino(), getFilo(),
                getClasse(), getOrdem(), getFamilia(), getGenero(), especie);
    }

}
