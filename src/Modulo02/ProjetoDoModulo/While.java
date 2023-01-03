package Modulo02.ProjetoDoModulo;

import java.util.Scanner;

public class While {
    public static void main(String[] args) throws InterruptedException {

        UsaCompras usaCompras = new UsaCompras();      
        
        Scanner scanner = new Scanner(System.in);

        boolean whileValidador = true;

        while (whileValidador) {

            apagarConsole();

            System.out.println("0 - Sair | 1 - Inserir produto | 2 - Ver produtos | 3 - Deletar produtos");

            int menu = scanner.nextInt();

            switch (menu) {
                case 0:
                    whileValidador = false;
                    break;

                case 1:
                    apagarConsole();
                    System.out.println("Digite o produto");
                    String produtoInserir = scanner.next();
                    usaCompras.inserirProduto(produtoInserir);
                    break;

                case 2:
                    apagarConsole();
                    System.out.println("Lista de produtos: \n");
                    usaCompras.verProdutos();

                    System.out.println("\n\nDigite 'q' para voltar.");
                    String sair = scanner.next();
                    if(sair == "q") continue;

                    break;

                case 3:
                    apagarConsole();
                    System.out.println("Digite o produto que deseja remover:");
                    String produtoDeletar = scanner.next();
                    apagarConsole();
                    usaCompras.deletarProduto(produtoDeletar);

                default:
                    break;
            }
        }
        scanner.close();
    }

    public static void apagarConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
