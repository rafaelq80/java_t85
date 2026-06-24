package pratica_avaliada_02;

import java.util.Scanner;

public class Exe03 {

    static Scanner leia = new Scanner(System.in);

    // [i][0] = Nome | [i][1] = Quantidade
    static String[][] estoque = new String[10][2];
    static int total = 0;

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n***********************************************************");
            System.out.println("                    CONTROLE DE ESTOQUE                    ");
            System.out.println("***********************************************************");
            System.out.println("  1 - Adicionar produto");
            System.out.println("  2 - Atualizar quantidade");
            System.out.println("  3 - Listar produtos");
            System.out.println("  0 - Sair");
            System.out.println("***********************************************************");
            System.out.print("  Escolha uma opção: ");
            opcao = Integer.parseInt(leia.nextLine());

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarQuantidade();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        leia.close();
    }

    // -----------------------------------------------------------
    // Adiciona um novo produto na próxima posição livre da matriz
    // -----------------------------------------------------------
    static void adicionarProduto() {
        if (total >= estoque.length) {
            System.out.println("Estoque cheio! Não é possível adicionar mais produtos.");
            return;
        }

        System.out.print("\nNome do produto: ");
        String nome = leia.nextLine();

        System.out.print("Quantidade: ");
        String quantidade = leia.nextLine();

        estoque[total][0] = nome;
        estoque[total][1] = quantidade;
        total++;

        System.out.println("Produto adicionado com sucesso!");
    }

    // -----------------------------------------------------------
    // Atualiza a quantidade de um produto existente pelo nome
    // -----------------------------------------------------------
    static void atualizarQuantidade() {
        if (total == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.print("\nNome do produto a atualizar: ");
        String nome = leia.nextLine();

        System.out.print("Nova quantidade: ");
        String novaQuantidade = leia.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < total; i++) {
            if (estoque[i][0].equalsIgnoreCase(nome)) {
                estoque[i][1] = novaQuantidade;
                System.out.println("Produto \"" + nome + "\" atualizado para " + novaQuantidade + " unidades.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto \"" + nome + "\" não encontrado no estoque.");
        }
    }

    // -----------------------------------------------------------
    // Lista todos os produtos cadastrados em formato de tabela
    // -----------------------------------------------------------
    static void listarProdutos() {
        if (total == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n***********************************************************");
        System.out.println("                     LISTA DE PRODUTOS                     ");
        System.out.println("***********************************************************");
        System.out.printf("%-5s%-30s%-15s%n", "#", "Produto", "Quantidade");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < total; i++) {
            System.out.printf("%-5d%-30s%-15s%n",
                    (i + 1),
                    estoque[i][0],
                    estoque[i][1]);
        }

        System.out.println("***********************************************************");
        System.out.printf("  Total de produtos cadastrados: %d%n", total);
        System.out.println("***********************************************************");
    }
}