//Receba Receba um número e informe se ele é "Positivo", "Negativo" ou "Zero" usando if-else if-else.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.printf("Positivo\n");
        } else if (numero < 0) {
            System.out.printf("Negativo\n");
        } else {
            System.out.printf("Zero\n");
        }

        sc.close();
    }
}