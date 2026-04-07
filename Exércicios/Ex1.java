//Receba um número de 1 a 12 e exiba o mês correspondente usando switch

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12: ");
        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.printf("Janeiro\n");
        } else if (numero == 2) {
            System.out.printf("Fevereiro\n");
        } else if (numero == 3) {
            System.out.printf("Março\n");
        } else if (numero == 4) {
            System.out.printf("Abril\n");
        } else if (numero == 5) {
            System.out.printf("Maio\n");
        } else if (numero == 6) {
            System.out.printf("Junho\n");
        } else if (numero == 7) {
            System.out.printf("Julho\n");
        } else if (numero == 8) {
            System.out.printf("Agosto\n");
        } else if (numero == 9) {
            System.out.printf("Setembro\n");
        } else if (numero == 10) {
            System.out.printf("Outubro\n");
        } else if (numero == 11) {
            System.out.printf("Novembro\n");
        } else if (numero == 12) {
            System.out.printf("Dezembro\n");
        } else {
            System.out.printf("Número inválido!\n");
        }

        sc.close();
    }
}


