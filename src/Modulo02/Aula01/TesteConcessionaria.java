package Modulo02.Aula01;

public class TesteConcessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();

        carro1.motor = "100CV";
        carro1.numeroDeRodas = 5;
        carro1.anoDeFabricaao = 2022;
        carro1.cor = "Prata";
        carro1.marca = "Mercedes";
        carro1.modelo = "XYZ";
        carro1.estiloDeCombustivel = "Combustivel";
        carro1.preco = 300_000;
        carro1.velocidadeMaxima = 200;

        carro1.obterVelocidadeMaxima();
        carro1.ligar();
        carro1.acelerar(210);
        carro1.desacelerar(20);
        carro1.parar();

        System.out.println("");
        //MOTO

        moto1.cilindrada = "321 cc";
        moto1.anoDeFabricaao = 2022;
        moto1.capacidadeDoTanque = 14;
        moto1.cor = "Azul";
        moto1.marca = "Yamaha";
        moto1.nome = "R3 ABS";
        moto1.preco = 32.390;
        moto1.automatica = true;
        moto1.doisLugares = true;
        moto1.modelo = "Super Sport";
        moto1.velocidadeMaxima = 200;
        moto1.velocidadeAtual = 0;

        moto1.ligar();
        moto1.acelerar(200);
        moto1.desacelerar(100);
        moto1.parar();
    }
}
