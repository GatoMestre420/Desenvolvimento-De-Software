
public class Programa {

    public static void main(String[] args) {
        // Ponto inicial do programa
        exibirMenuInicial();

    }

    public static void exibirMenuInicial() {
        // Mostrar o menu inicial

        // Vetores com Dados de 5 alunos
        String[] matriculas = new String[5];
        String[] nomes = new String[5];
        double[] notas1 = new double[5];
        double[] notas2 = new double[5];

        // Matriz com Dados de 5 aluno
        String[][] dadosAlunos = new String[4][5];

        // Structs ou classes/objetos
        Aluno a1 = new Aluno();
        a1.matricula = "A";
        a1.nome = "nome1";
        a1.nota1 = 5;
        a1.nota2 = 7;

        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

    }

}
