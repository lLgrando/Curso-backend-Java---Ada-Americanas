package Modulo02.Aula01;

public class Carro {

    String motor;
    int numeroDeRodas;
    int anoDeFabricaao;
    String cor;
    String marca;
    String modelo;
    String estiloDeCombustivel;
    double preco;
    int velocidadeMaxima;
    int velocidadeAtual;

    public void obterVelocidadeMaxima() {
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
    }

    public void ligar() {
        System.out.println("Carro ligado!");
    }

    public void acelerar(int aumentoDeVelocidade) {
        if (velocidadeAtual > velocidadeMaxima) {
            System.out.println("Velocidade acima do limite do carro.");
        } else {
            velocidadeAtual = aumentoDeVelocidade;
            System.out.println(velocidadeAtual + " km/h.");
        }
    }

    public void desacelerar(int desaceleracao) {
        if (velocidadeAtual - desaceleracao < 0) {
            velocidadeAtual = 0;
            System.out.println("O carro parou.");
        } else {
            velocidadeAtual = velocidadeAtual - desaceleracao;
            System.out.println("O carro está a " + velocidadeAtual + " km/h.");
        }
    }

    public void parar() {
        velocidadeAtual = 0;
        System.out.println("O carro está parado.");
    }
}
