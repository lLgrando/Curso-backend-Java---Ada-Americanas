package Modulo02;

public class Moto {

    private String marca;
    private String modelo;
    private int cilindrada;
    private int anoDeFabricaao;
    private int velocidadeMaxima;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getAnoDeFabricaao() {
        return anoDeFabricaao;
    }

    public void setAnoDeFabricaao(int anoDeFabricaao) {
        this.anoDeFabricaao = anoDeFabricaao;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
