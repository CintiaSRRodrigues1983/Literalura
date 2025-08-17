package br.com.aluracursos.literalura;

import br.com.aluracursos.literalura.service.LivroService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

    private final LivroService livroService;

    public LiteraluraApplication(LivroService livroService) {
        this.livroService = livroService;
    }

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Buscar livro pelo título (consulta na API e salva no banco)");
            System.out.println("2 - Listar livros registrados");
            System.out.println("3 - Listar autores");
            System.out.println("4 - Listar autores vivos em determinado ano");
            System.out.println("5 - Listar livros em determinado idioma (PT, EN, ES, FR)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = scanner.nextLine();
            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcao = -1; // opção inválida
            }

            switch (opcao) {
                case 1:
                    livroService.buscarLivropeloTitulo(scanner);
                    break;
                case 2:
                    livroService.listarLivrosRegistrados();
                    break;
                case 3:
                    livroService.listarAutores();
                    break;
                case 4:
                    livroService.listarAutoresemDeterminadoAno(scanner);
                    break;
                case 5:
                    livroService.listarLivrosemDeterminadoIdioma(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
        System.exit(0); // Garante o encerramento completo da JVM/Spring Boot CLI
    }
}