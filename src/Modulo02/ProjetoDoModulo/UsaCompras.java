package Modulo02.ProjetoDoModulo;

import java.util.Scanner;

public class UsaCompras {

    private Compras compras = new Compras();
    private static Scanner scanner = new Scanner(System.in);

    public void inserirProduto() throws InterruptedException {
        String nomeDoProduto;
        Integer quantidadeDoProdutoInt;
        Double precoDoProdutoDouble;

        try {
            System.out.println("Digite o nome produto");
            nomeDoProduto = scanner.next();

            System.out.println("Digite a quantidade do produto");
            quantidadeDoProdutoInt = Integer.valueOf(scanner.next()).intValue();

            System.out.println("Digite o preço do produto (R$)");
            precoDoProdutoDouble = Double.valueOf(scanner.next()).doubleValue();

        } catch (Exception e) {
            apagarConsole();
            System.out.println("Quantidade e Preço deve ser numeral. Insira novamente...");
            Thread.sleep(1000);
            apagarConsole();
            inserirProduto();
            return;
        }

        compras.produtos.add(nomeDoProduto);
        compras.quantidade.add(quantidadeDoProdutoInt);
        compras.precos.add(precoDoProdutoDouble);
    }

    public void verProdutos() {
        for (int i = 0; i < compras.produtos.size(); i++) {
            System.out.print(compras.produtos.get(i) + "\t\t");
            System.out.print(compras.quantidade.get(i) + " und.\t\t");
            System.out.printf("R$ %.2f \t\t", compras.precos.get(i));
            System.out.printf("R$ %.2f", precoTotal(i));
            System.out.println();
        }
        System.out.println("\n\nDigite 'q + Enter' para voltar.");
        scanner.next();
    }

    private double precoTotal(int i){
        double precoTotal = compras.quantidade.get(i) * compras.precos.get(i);
        return precoTotal;
    }

    private int indiceDoProduto(String produto) {
        if (compras.produtos.contains(produto)){
            return compras.produtos.indexOf(produto);
        } else {
            return -1;
        }
    }

    public void deletarProduto() throws InterruptedException {
        System.out.println("Digite o produto que deseja remover:");
        int index = indiceDoProduto(scanner.next());

        if (index != -1) {
            compras.produtos.remove(index);
            compras.quantidade.remove(index);
            compras.precos.remove(index);
            System.out.println("Produto removido!");
            Thread.sleep(1000);
        } else {
            System.out.println("Produto não encontrado.");
            Thread.sleep(1000);
        }
    }

    public static void apagarConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
