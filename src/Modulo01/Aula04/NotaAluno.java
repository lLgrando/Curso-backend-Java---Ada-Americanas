package Aula04;
public class NotaAluno {
    public static void main(String[] args) {
        int aluno = 70;

        System.out.println("Sua nota final é: " + notaFinal(aluno));
    }

    static char notaFinal(int nota) {
        if (nota >= 90) {
            return 'A';
        } else if (nota >= 80) {
            return 'B';
        } else if (nota >= 70) {
            return 'C';
        } else if (nota >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
