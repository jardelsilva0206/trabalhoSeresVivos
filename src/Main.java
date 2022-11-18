import Animalia.Animalia;
import Animalia.AnimaliaEspecie;
import Monera.MoneraEspecie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador();
        boolean flag = true;

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
                default -> System.out.println("Opcção incorreta!");
            }
        }






        sc.close();

    }

    public static void menu(){
        System.out.println("----------------------MENU----------------------");
        System.out.println("1- Animalia");
        System.out.println("2- Fungi");
        System.out.println("3- Monera");
        System.out.println("4- Plantae");
        System.out.println("5- Protista");
        System.out.println("6- Sair");
        System.out.println("------------------------------------------------");
        System.out.print("Qual será sua opção: ");
    }
}