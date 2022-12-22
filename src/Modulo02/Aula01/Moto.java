package Modulo02.Aula01;

public class Moto {

    String cilindrada;
    int capacidadeDoTanque;
    int anoDeFabricaao;
    String cor;
    String marca;
    String nome;
    double preco;
    boolean automatica;
    boolean doisLugares;
    String modelo;
    int velocidadeMaxima;
    int velocidadeAtual;
    boolean farolLigado;

    public void ligar() {
        System.out.println("Moto ligada!");
        farolLigado(true);
    }

    public void acelerar(int aumentoDeVelocidade) {

        if (velocidadeAtual + aumentoDeVelocidade > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
            System.out.println("Velocidade acima do limite da moto - " + velocidadeAtual + " km/h");
        } else {
            velocidadeAtual += aumentoDeVelocidade;
            System.out.println("Acelerando a " + velocidadeAtual + " km/h.");
        }
    }

    public void desacelerar(int desaceleracao) {
        if (velocidadeAtual - desaceleracao < 0) {
            velocidadeAtual = 0;
            System.out.println("A moto parou.");
        } else {
            velocidadeAtual -= desaceleracao;
            System.out.println("Desacelerando para " + velocidadeAtual + " km/h.");
        }
    }

    public void parar() {
        velocidadeAtual = 0;
        System.out.println("A moto está parada.");
        farolLigado(false);
    }

    public void farolLigado(boolean ligarFarol) {
        String farolLigado = ligarFarol == true ? "Ligado" : "Desligado";
        System.out.println("Farol: " + farolLigado);
    }
}
