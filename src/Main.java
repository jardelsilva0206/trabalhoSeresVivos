import Animalia.AnimaliaEspecie;
import Fungi.FungiEspecie;
import Monera.MoneraEspecie;
import Plantae.PlantaeEspecie;
import Protista.ProtistaEspecie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador();
        boolean flag = true;

        //Dados teste
        AnimaliaEspecie a = new AnimaliaEspecie("Leão", "Animal", "Chordata", "Mammalia", "Carnívora", "Felide", "Panthera", "P. leo");
        AnimaliaEspecie a1 = new AnimaliaEspecie("a", "a", "a", "a", "a", "a", "a", "a");
        AnimaliaEspecie a2 = new AnimaliaEspecie("b", "b", "b", "b", "b", "b", "b", "b");
        FungiEspecie f = new FungiEspecie("Champignon", "Fungi", "Basidiomycota", "Homobasidiomycetes", "Agaricales", "Agaricaceae", "Agaricus", "A. bisporus", "Quitina", "Fungo");
        MoneraEspecie m = new MoneraEspecie("Streptococcus pyogenes", "Monera", "Firmicutes", "Bacilli", "Lactobacillales", "Streptococcaceae", "Streptococcus", "S. pyogenes", "Heterotróficos", "Multicelular");
        PlantaeEspecie pl = new PlantaeEspecie("Anthurium", "Plantae", "Vascular", "Liliopsida", "Alismatales", "Araceae", "Anthurium", "Anthurium digitatum");
        ProtistaEspecie pr = new ProtistaEspecie("Wakame", "Protista", "Heterokontophyta", "Fougère des mers", "Macroalga", "Phaeophyceae", "Laminariales", "Miyeok", "Undaria", "U. pinnatifida");
        gerenciador.addMonera(m);
        gerenciador.addAnimalia(a);
        gerenciador.addAnimalia(a1);
        gerenciador.addAnimalia(a2);
        gerenciador.addFungi(f);
        gerenciador.addPlantae(pl);
        gerenciador.addProtista(pr);

        while (flag){
            gerenciador.menuPrincipal();
            int opc = sc.nextInt();

            switch (opc) {
                case 1 -> gerenciador.cadastrarEspecie();
                case 2 -> gerenciador.removerEspecie();
                case 3 -> gerenciador.atualizarEspecie();
                case 4 -> gerenciador.listarEspecie();
                case 5 -> gerenciador.listarTudo();
                case 6 -> flag = false;
                default -> System.out.println("Opção incorreta!");
            }
        }

        System.out.println("Aplicação encerrada!");

        sc.close();

    }
}
