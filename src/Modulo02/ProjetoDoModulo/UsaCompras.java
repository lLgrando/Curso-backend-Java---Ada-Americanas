package Modulo02.ProjetoDoModulo;

public class UsaCompras {

    private Compras compras = new Compras();

    public void inserirProduto(String produto) {
        compras.produtos.add(produto);
    }

    public void verProdutos() {
        for (String p1 : compras.produtos) {
            System.out.println(p1);
        }
    }

    public void deletarProduto(String produto) throws InterruptedException {
        if(compras.produtos.contains(produto)){
            compras.produtos.remove(produto);
            System.out.println("Produto removido!");
            Thread.sleep(2000);
        } else {
            System.out.println("Produto não encontrado.");
            Thread.sleep(2000);
        }
    }
}
