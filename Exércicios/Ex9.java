//Implemente um sistema de menu onde o usuário escolhe converter o valor digitado de graus Celsius para Fahrenheit ou o valor digitado de graus Fahrenheit para Celsius, apresentando o valor digitado e o valor calculado acompanhados de suas respectivas unidades (°C ou °F).

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Escolha a opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em °C: ");
                double celsius = sc.nextDouble();
                double f = celsius * 9 / 5 + 32;
                System.out.printf("%.2f°C = %.2f°F\n", celsius, f);
                break;

            case 2:
                System.out.print("Digite a temperatura em °F: ");
                double fahrenheit = sc.nextDouble();
                double c = (fahrenheit - 32) * 5 / 9;
                System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, c);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}