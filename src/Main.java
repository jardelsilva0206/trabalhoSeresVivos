import Animalia.Animalia;
import Animalia.AnimaliaEspecie;
import Monera.MoneraEspecie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador();
        boolean flag = true;

        MoneraEspecie m = new MoneraEspecie("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        gerenciador.addMonera(m);
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