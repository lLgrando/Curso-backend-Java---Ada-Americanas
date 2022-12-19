package Aula02;

public class Pessoa {
    static String nome;
    static int idade;
    static boolean ativo;

    public static void usaPessoa (String Nome, int Idade, boolean Ativo) {
        nome = Nome;
        idade = Idade;
        ativo = Ativo;
    
        System.out.println(nome + " tem " + idade + " anos" + " e é usuário " +
        (ativo == true ? "ativo" : "inativo") + " do sistema.");
    }
}