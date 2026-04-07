//Receba três números inteiros quaisquer e exiba-os em ordem decrescente de valor.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int maior, meio, menor;

        // Descobrindo o maior
        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 >= num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.printf("Ordem decrescente: %d, %d, %d\n", maior, meio, menor);

        sc.close();
    }
}