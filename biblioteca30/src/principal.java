import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
    private static List<livro> livros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros Disponíveis");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarLivro(scanner);
                    break;
                case 2:
                    listarLivrosDisponiveis();
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void cadastrarLivro(Scanner scanner) {
        System.out.println("\n--- Cadastro de Livro ---");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        livro novoLivro = new livro(titulo, autor, genero, true);
        livros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void listarLivrosDisponiveis() {
        System.out.println("\n--- Livros Disponíveis ---");
        for (livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }
}