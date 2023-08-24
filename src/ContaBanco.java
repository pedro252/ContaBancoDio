import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean informacoesCorretas = false;

        while (!informacoesCorretas) {
            // Solicita o número da conta
            System.out.print("Digite o número da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            // Solicita a agência
            System.out.print("Digite sua agência: ");
            String agencia = scanner.nextLine();

            // Solicita o nome completo
            System.out.print("Seu nome completo: ");
            String nomeCliente = scanner.nextLine();

            double saldo = 237.48;


            // Exibe as informações
            if (numero != 1021) {
                System.out.println("Número da conta inválido.");
            } else if (!agencia.equals("067-8")) {
                System.out.println("Agência invalida.");
            } else if (!nomeCliente.equals("Mario Andrade")) {
                System.out.println("Nome esta incorreto.");
            } else {
                informacoesCorretas = true;
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é: "
                        + agencia
                        + ", conta " + numero
                        + ", e seu saldo é: " + saldo
                        + ". O saldo já está disponível para saque.");
            }
        }

        // Fecha o Scanner após a leitura
        scanner.close();
    }
}
