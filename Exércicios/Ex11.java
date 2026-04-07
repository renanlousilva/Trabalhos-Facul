//Receba um valor em dinheiro e informe a menor quantidade de notas ($100, $50, $20, $10, $5, $2) ou moeda ($1) necessárias para compô-lo (ignore a existência de centavos).

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais (sem centavos): R$ ");
        int valor = sc.nextInt();

        int restante = valor;

        int notas100 = restante / 100;
        restante = restante % 100;

        int notas50 = restante / 50;
        restante = restante % 50;

        int notas20 = restante / 20;
        restante = restante % 20;

        int notas10 = restante / 10;
        restante = restante % 10;

        int notas5 = restante / 5;
        restante = restante % 5;

        int notas2 = restante / 2;
        restante = restante % 2;

        int moedas1 = restante; // o que sobrou vira moeda de 1

        System.out.println("Menor quantidade de notas e moedas:");
        System.out.printf("R$100: %d\n", notas100);
        System.out.printf("R$50: %d\n", notas50);
        System.out.printf("R$20: %d\n", notas20);
        System.out.printf("R$10: %d\n", notas10);
        System.out.printf("R$5: %d\n", notas5);
        System.out.printf("R$2: %d\n", notas2);
        System.out.printf("R$1: %d\n", moedas1);

        sc.close();
    }
}