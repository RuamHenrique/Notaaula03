import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um Cachorro
        System.out.println("Digite o nome do Cachorro:");
        String nomeCachorro = scanner.nextLine();
        Cachorro cachorro = new Cachorro(nomeCachorro);

        System.out.println("Digite a raça do Cachorro:");
        cachorro.raca = scanner.nextLine(); // Definindo a raça do cachorro
        cachorro.caminha();
        cachorro.late();

        // Criando um Gato
        System.out.println("\nDigite o nome do Gato:");
        String nomeGato = scanner.nextLine();
        Gato gato = new Gato(nomeGato);

        System.out.println("Digite a raça do Gato:");
        gato.raca = scanner.nextLine(); // Definindo a raça do gato
        gato.caminha();
        gato.mia();

        scanner.close();
    }
}