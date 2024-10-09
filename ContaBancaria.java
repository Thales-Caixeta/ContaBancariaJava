import java.util.Scanner;

import java.util.Random;

class ContaBancaria {

private String nome;

private String cpf;

private double saldo;

public ContaBancaria(String nome, String cpf) {

this.nome = nome;

this.cpf = cpf;

this.saldo = gerarSaldoInicial();

}

private double gerarSaldoInicial() {

Random random = new Random();

return 100 + (100000000 - 0) * random.nextDouble();

}

public String getNome() {

return nome;

}

public String getCpf() {

return cpf;

}

public double getSaldo() {

return saldo;

}

public void depositar(double valor) {

if (valor > 0) {

saldo += valor;

} else {

System.out.println("Valor de depósito inválido!");

}

}

public void sacar(double valor) {

if (valor > 0 && saldo >= valor) {

saldo -= valor;

} else {

System.out.println("Saldo insuficiente ou valor de saque inválido!");

}

}

}

public class Main {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Digite o nome do titular da conta:");

String nome = scanner.nextLine();

System.out.println("Digite o CPF do titular da conta:");

String cpf = scanner.nextLine();

ContaBancaria conta = new ContaBancaria(nome, cpf);

System.out.printf("Saldo inicial: R$ %.2f\n", conta.getSaldo());

System.out.println("Digite o valor a ser depositado:");

double valorDeposito = scanner.nextDouble();

conta.depositar(valorDeposito);

System.out.printf("Saldo após depósito: R$ %.2f\n", conta.getSaldo());

System.out.println("Digite o valor a ser sacado:");

double valorSaque = scanner.nextDouble();

conta.sacar(valorSaque);

System.out.printf("Saldo após saque: R$ %.2f\n", conta.getSaldo());

scanner.close();

}

}
