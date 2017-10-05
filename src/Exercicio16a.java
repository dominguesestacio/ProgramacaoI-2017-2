
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class Exercicio16a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numConta;
        double saldo, debito, credito, saldoAtual;
            System.out.print("Insira o numero da conta: ");
        numConta = input.nextInt();
            System.out.print("Insira o saldo da  conta: ");
        saldo = input.nextDouble();
            System.out.print("Insira o valor a ser debitado: ");
        debito = input.nextDouble();
            System.out.print("Insira o valor a ser creditado: ");
        credito = input.nextDouble();
        saldoAtual = (saldo - debito) + credito;
            System.out.printf("Conta Número : %s \n", numConta);
            System.out.printf("\nSaldo Atual = %s \n", saldoAtual);
        if (saldoAtual >= 0) {
            System.out.printf("Saldo  Positivo");
        } else {
            System.out.printf("Saldo Negativo");
        }
    }
}