import java.util.Scanner;

public class SimuladorATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 500.0; // Saldo inicial
        int opcao = 0;

        System.out.println("=== BANCO JAVA SE - ATM ===");
        System.out.println("Bem-vindo, Carlaile!");

        // O loop continua enquanto a opção for diferente de 4 (Sair)
        while (opcao != 4) {
            System.out.println("\n---------------------------");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Quanto deseja depositar? R$ ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Erro: Valor de depósito deve ser positivo.");
                    }
                    break;

                case 3:
                    System.out.print("Quanto deseja sacar? R$ ");
                    double saque = sc.nextDouble();
                    // Validação de segurança: Não saca se o valor for maior que o saldo
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado. Retire seu dinheiro.");
                    } else if (saque > saldo) {
                        System.out.println("Erro: Saldo insuficiente.");
                    } else {
                        System.out.println("Erro: Valor de saque inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o Banco Java. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}