import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura do número da conta (inteiro)
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        // Limpar o buffer do scanner antes de ler strings
        scanner.nextLine();

        // Solicitação e leitura do número da agência (string)
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        // Solicitação e leitura do nome do cliente (string)
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        // Solicitação e leitura do saldo (decimal)
        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final concatenando strings
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque");

        System.out.println(mensagem);

        // Fechar scanner
        scanner.close();
    }
}
