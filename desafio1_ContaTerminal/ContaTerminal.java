package desafio1_ContaTerminal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Exibir mensagens para o usuário
        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Por favor, informe os dados da sua conta.");
        Scanner scanner = new Scanner(System.in);
        // Ler os dados da conta
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Saldo: R$ ");
        double saldo = scanner.nextDouble();
        // Criar uma instância da classe Conta
        Conta conta = new Conta();
        // Atribuir os dados lidos à conta
        conta.agencia = agencia;
        conta.numeroConta = numeroConta;    
        conta.nomeCliente = nomeCliente;
        conta.saldo = saldo;
        // Exibir os dados da conta
        System.out.println("\nDados da Conta:");
        conta.exibirDados();
    
    }
}

class Conta {
    String agencia = "1234";
    int numeroConta = 56789;
    String nomeCliente = "João da Silva";
    double saldo = 1500.75;

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
    public void exibirDados() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Cliente: " + nomeCliente);
        exibirSaldo();
    }
}
