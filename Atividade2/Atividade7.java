import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("Os valores podem formar um triângulo");
        } else {
            System.out.println("Os valores NÃO podem formar um triângulo");
        }

        scanner.close();
    }
}