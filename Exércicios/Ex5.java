//Crie uma calculadora de operações básicas (+, -, *, /) que recebe dois números e o símbolo da operação e entrega o resultado correspondente.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("Resultado: %.2f\n", num1 + num2);
                break;
            case '-':
                System.out.printf("Resultado: %.2f\n", num1 - num2);
                break;
            case '*':
                System.out.printf("Resultado: %.2f\n", num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Resultado: %.2f\n", num1 / num2);
                } else {
                    System.out.printf("Erro: divisão por zero!\n");
                }
                break;
            default:
                System.out.printf("Operação inválida!\n");
        }

        sc.close();
    }
}