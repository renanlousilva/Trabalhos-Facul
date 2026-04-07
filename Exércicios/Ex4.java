//Receba o preço de um produto e exiba "Barato" (até 50), "Médio" (até 100) ou "Caro" (acima de 100).

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        if (preco <= 50) {
            System.out.printf("Barato\n");
        } else if (preco <= 100) {
            System.out.printf("Médio\n");
        } else {
            System.out.printf("Caro\n");
        }

        sc.close();
    }
}