package pratica_avaliada_02;

import java.util.Scanner;

public class Exe02 {

    // Matriz fixa: cada linha é um aluno, cada coluna é um dado
    // [i][0] = Nome | [i][1] = Idade | [i][2] = Nota
    static String[][] alunos = new String[10][3]; // capacidade máxima de 10 alunos
    static int total = 0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Calcular média geral");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    calcularMedia();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // -----------------------------------------------------------
    // Lê os dados de um aluno via teclado e adiciona na matriz
    // -----------------------------------------------------------
    static void adicionarAluno() {
        if (total >= alunos.length) {
            System.out.println("Cadastro cheio! Não é possível adicionar mais alunos.");
            return;
        }

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do aluno: ");
        String idade = scanner.nextLine();

        System.out.print("Nota final do aluno: ");
        String nota = scanner.nextLine();

        alunos[total][0] = nome;
        alunos[total][1] = idade;
        alunos[total][2] = nota;
        total++;

        System.out.println("Aluno cadastrado com sucesso!");
    }

    // -----------------------------------------------------------
    // Lista todos os alunos cadastrados
    // -----------------------------------------------------------
    static void listarAlunos() {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("=== CADASTRO DE ALUNOS ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Nome: " + alunos[i][0]
                             + " | Idade: " + alunos[i][1]
                             + " | Nota: " + alunos[i][2]);
        }
    }

    // -----------------------------------------------------------
    // Calcula e exibe a média geral das notas
    // -----------------------------------------------------------
    static void calcularMedia() {
        if (total == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        double soma = 0;
        for (int i = 0; i < total; i++) {
            soma += Double.parseDouble(alunos[i][2]);
        }
        System.out.printf("Média geral: %.2f%n", soma / total);
    }
}
