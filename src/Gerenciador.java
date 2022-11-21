import Animalia.AnimaliaEspecie;
import Fungi.FungiEspecie;
import Monera.MoneraEspecie;
import Protista.ProtistaEspecie;
import Protista.ProtistaGenero;
import Plantae.PlantaeEspecie;
import padrao.SeresVivos;


import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciador {

    private Scanner sc = new Scanner(System.in);

    private ArrayList<AnimaliaEspecie> listaAnimalia = new ArrayList<>();
    private ArrayList<ProtistaEspecie> listaProtista = new ArrayList<>();
    private ArrayList<MoneraEspecie> listaMonera = new ArrayList<>();
    private ArrayList<PlantaeEspecie> listaPlantae = new ArrayList<>();
    private ArrayList<FungiEspecie> listaFungi = new ArrayList<>();

    public Gerenciador(){}

    public void cadastrarEspecie(){
        menuEspecies();
        int opc = sc.nextInt();
        if (opc == 1){
            AnimaliaEspecie animaliaEspecie = new AnimaliaEspecie();
            animaliaEspecie.cadastrar();
            listaAnimalia.add(animaliaEspecie);
        } else if (opc == 2){
            FungiEspecie fungiEspecie = new FungiEspecie();
            fungiEspecie.cadastrar();
            listaFungi.add(fungiEspecie);
        } else if (opc == 3){
            MoneraEspecie moneraEspecie = new MoneraEspecie();
            moneraEspecie.cadastrar();
            listaMonera.add(moneraEspecie);

        } else if (opc == 4){
            PlantaeEspecie plantaeEspecie = new PlantaeEspecie();
            plantaeEspecie.cadastrar();
            listaPlantae.add(plantaeEspecie);
        } else if (opc == 5){
            FungiEspecie fungiEspecie = new FungiEspecie();
            fungiEspecie.cadastrar();
            listaFungi.add(fungiEspecie);
        } else {
            System.out.println("Verifique a opção informada!");
        }

    }

    public void listarTudo(){
        System.out.println("Lista de espécies do reino Animalia:");
        listaAnimalia.forEach(System.out::println);
        System.out.println("Lista de espécies do reino Fungi:");
        listaFungi.forEach(System.out::println);
        System.out.println("Lista de espécies do reino Monera:");
        listaMonera.forEach(System.out::println);
        System.out.println("Lista de espécies do reino Plantae:");
        listaPlantae.forEach(System.out::println);        
        System.out.println("Lista de espécies do reino Protista:");
        listaProtista.forEach(System.out::println);
    }
    
    public void listarEspecie(){
        System.out.println("Qual especies você deseja listar?");
        menuEspecies();
        int opc = sc.nextInt();
        if (opc == 1) listaAnimalia.forEach(System.out::println);
        else if (opc == 2) listaFungi.forEach(System.out::println);
        else if (opc == 3) listaMonera.forEach(System.out::println);
        else if (opc == 4) listaPlantae.forEach(System.out::println);
        else if (opc == 5) listaProtista.forEach(System.out::println);
        else System.out.println("Opção inválida!!");
    }

    public void menuEspecies(){
        System.out.println("------------------------------------------------");
        System.out.println("1- Animalia");
        System.out.println("2- Fungi");
        System.out.println("3- Monera");
        System.out.println("4- Plantae");
        System.out.println("5- Protista");
        System.out.println("------------------------------------------------");
        System.out.print("Qual será sua opção: ");
    }

    public void menuPrincipal(){
        System.out.println("----------------------MENU----------------------");
        System.out.println("1- Cadastrar uma especie");
        System.out.println("2- Remover uma especie");
        System.out.println("3- Editar uma especie");
        System.out.println("4- Listar uma especie");
        System.out.println("5- Listar todas as especies");
        System.out.println("6- Sair");
        System.out.println("------------------------------------------------");
        System.out.print("Qual será sua opção: ");
    }

    public void addMonera(MoneraEspecie monera){
        this.listaMonera.add(monera);
    }
    public void addAnimalia(AnimaliaEspecie animalia){
        this.listaAnimalia.add(animalia);
    }
    public void addFungi(FungiEspecie fungi){
        this.listaFungi.add(fungi);
    }
    public void addPlantae(PlantaeEspecie plantae){
        this.listaPlantae.add(plantae);
    }
    public void addProtista(ProtistaEspecie protista){
        this.listaProtista.add(protista);
    }

    public void removerEspecie() {
        menuEspecies();
        int opc = sc.nextInt();

        System.out.println("Informe o nome da espécie:");
        sc.nextLine();
        String nomeEspecie = sc.nextLine();

        if (opc == 1){
            listaAnimalia.removeIf(a -> nomeEspecie.equalsIgnoreCase(a.getEspecie()));
            System.out.println("Foi");
        } else if (opc == 2){
            listaFungi.removeIf(f -> nomeEspecie.equalsIgnoreCase(f.getEspecie()));
        } else if (opc == 3){
            listaMonera.removeIf(m -> nomeEspecie.equalsIgnoreCase(m.getEspecie()));
        } else if (opc == 4){
            listaPlantae.removeIf(p -> nomeEspecie.equalsIgnoreCase(p.getEspecie()));
        } else if (opc == 5){
            listaProtista.removeIf(p -> nomeEspecie.equalsIgnoreCase(p.getEspecie()));
        } else {
            System.out.println("Verifique a opção informada!");
        }

    }

    public void atualizarEspecie() {
        menuEspecies();
        int opc = sc.nextInt();
        System.out.println("Informe o nome da espécie:");
        String nomeEspecie = sc.next();

        if (opc == 1){
            for (AnimaliaEspecie a: listaAnimalia){
                if (nomeEspecie.equalsIgnoreCase(a.getEspecie())){
                    a.atualizar();
                    return;
                }
            }
            System.out.println("Não encontramos uma espécie com este nome!");
        } else if (opc == 2){
            for (FungiEspecie f: listaFungi){
                if (nomeEspecie.equalsIgnoreCase(f.getEspecie())){
                    f.atualizar();
                    return;
                }
            }
            System.out.println("Não encontramos uma espécie com este nome!");
        } else if (opc == 3){
            for (MoneraEspecie m: listaMonera){
                if (nomeEspecie.equalsIgnoreCase(m.getEspecie())){
                    m.atualizar();
                    return;
                }
            }
            System.out.println("Não encontramos uma espécie com este nome!");

        } else if (opc == 4){
            for (PlantaeEspecie p: listaPlantae){
                if (nomeEspecie.equalsIgnoreCase(p.getEspecie())){
                    p.atualizar();
                    return;
                }
            }
            System.out.println("Não encontramos uma espécie com este nome!");
        } else if (opc == 5){
            for (ProtistaEspecie p: listaProtista){
                if (nomeEspecie.equalsIgnoreCase(p.getEspecie())){
                    p.atualizar();
                    return;
                }
            }
            System.out.println("Não encontramos uma espécie com este nome!");
        } else {
            System.out.println("Verifique a opção informada!");
        }
    }
}
