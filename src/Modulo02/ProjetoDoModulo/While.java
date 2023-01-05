package Modulo02.ProjetoDoModulo;

import java.util.Scanner;

public class While {
    static Scanner scanner = new Scanner(System.in);
    static UsaCompras usaCompras = new UsaCompras();
    static boolean whileValidador = true;
    public static void main(String[] args) throws InterruptedException {
        execucao(args);
    }

    private static void execucao(String[] args) throws InterruptedException {
        while (whileValidador) {
            UsaCompras.apagarConsole();
            int menu;

            System.out.println("0 - Sair | 1 - Inserir produto | 2 - Ver produtos | 3 - Deletar produtos");

            try {
                menu = Integer.valueOf(scanner.next()).intValue();
            } catch (Exception e) {
                menu = -1;
                execucao(args);
            }

            switch (menu) {
                case 0:
                    whileValidador = false;
                    break;

                case 1: //inserir produto
                    UsaCompras.apagarConsole();
                    usaCompras.inserirProduto();
                    break;

                case 2: //ver produtos cadastrados
                    UsaCompras.apagarConsole();
                    usaCompras.verProdutos();
                    break;

                case 3: // apagar produtos cadastrados
                    UsaCompras.apagarConsole();
                    usaCompras.deletarProduto();

                default:
                    break;
            }
        }
    }
}
