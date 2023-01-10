package Modulo02;

public class TesteConcessionaria {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();

        c1.setMarca("Fiat");
        System.out.println(c1.getMarca());

        m1.setCilindrada(30);
        System.out.println(m1.getCilindrada());
    }
}
