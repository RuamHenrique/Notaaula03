
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obter a data atual manualmente
        System.out.println("Digite o dia atual:");
        int diaAtual = scanner.nextInt();
        System.out.println("Digite o mês atual:");
        int mesAtual = scanner.nextInt();
        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer

        // Criando um Gerente
        Gerente gerente = new Gerente();
        System.out.println("Digite o nome do Gerente:");
        gerente.setNome(scanner.nextLine());

        System.out.println("Digite o dia de nascimento do Gerente:");
        int diaNascimentoGerente = scanner.nextInt();
        System.out.println("Digite o mês de nascimento do Gerente:");
        int mesNascimentoGerente = scanner.nextInt();
        System.out.println("Digite o ano de nascimento do Gerente:");
        int anoNascimentoGerente = scanner.nextInt();

        gerente.setNascimento(diaNascimentoGerente, mesNascimentoGerente, anoNascimentoGerente);

        System.out.println("Digite o salário do Gerente:");
        gerente.setSalario(scanner.nextDouble());
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o projeto do Gerente:");
        gerente.setProjeto(scanner.nextLine());

        gerente.informarSalario();
        System.out.println("Idade: " + gerente.calcularIdade(diaAtual, mesAtual, anoAtual) + " anos");
        gerente.informarProjeto();

        // Criando um Programador
        Programador programador = new Programador();
        System.out.println("\nDigite o nome do Programador:");
        programador.setNome(scanner.nextLine());

        System.out.println("Digite o dia de nascimento do Programador:");
        int diaNascimentoProgramador = scanner.nextInt();
        System.out.println("Digite o mês de nascimento do Programador:");
        int mesNascimentoProgramador = scanner.nextInt();
        System.out.println("Digite o ano de nascimento do Programador:");
        int anoNascimentoProgramador = scanner.nextInt();

        programador.setNascimento(diaNascimentoProgramador, mesNascimentoProgramador, anoNascimentoProgramador);

        System.out.println("Digite o salário do Programador:");
        programador.setSalario(scanner.nextDouble());
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite a linguagem do Programador:");
        programador.setLinguagem(scanner.nextLine());

        programador.informarSalario();
        System.out.println("Idade: " + programador.calcularIdade(diaAtual, mesAtual, anoAtual) + " anos");
        programador.informarLinguagem();

        scanner.close();
    }
}