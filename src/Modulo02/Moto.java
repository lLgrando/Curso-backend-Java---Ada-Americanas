package Modulo02;

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

    @Override
    public String toString() {
        return "Moto [ \ncilindrada=" + cilindrada + ", \ncapacidadeDoTanque=" + capacidadeDoTanque
                + ", \nanoDeFabricaao="
                + anoDeFabricaao + ", \ncor=" + cor + ", \nmarca=" + marca + ", \nnome=" + nome + ", \npreco=" + preco
                + ", \nautomatica=" + automatica + ", \ndoisLugares=" + doisLugares + ", \nmodelo=" + modelo + "]";
    }

}
