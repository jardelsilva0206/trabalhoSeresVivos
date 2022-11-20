package Protista;

import java.util.Scanner;

public class ProtistaEspecie extends ProtistaGenero{

    private String especie;

    private Scanner sc = new Scanner(System.in);

    public ProtistaEspecie(String nomeSerVivo, String reino, String protozoa, String superFilo, String filo, String classe, String ordem, String familia, String genero, String especie) {
        super(nomeSerVivo, reino, protozoa, superFilo, filo, classe, ordem, familia, genero);
        this.especie = especie;
    }

    public ProtistaEspecie(){
        super();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void cadastrar(){
        System.out.println("Filo:");
        setFilo(sc.next());
        System.out.println("Classe:");
        setClasse(sc.next());
        System.out.println("Ordem:");
        setOrdem(sc.next());
        System.out.println("Familia:");
        setFamilia(sc.next());
        System.out.println("Genero:");
        setGenero(sc.next());
        System.out.println("Especie:");
        this.especie = sc.next();
    }

    public void atualizar(){
        System.out.println("Filo:");
        setFilo(sc.next());
        System.out.println("Classe:");
        setClasse(sc.next());
        System.out.println("Ordem:");
        setOrdem(sc.next());
        System.out.println("Familia:");
        setFamilia(sc.next());
        System.out.println("Genero:");
        setGenero(sc.next());
        System.out.println("Especie:");
        this.especie = sc.next();
    }
}
