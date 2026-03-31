import java.util.Scanner;

public class Atividade8
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        if (A <= B && A <= C) {
            if (B <= C) {
                System.out.println(A + " " + B + " " + C);
            } else {
                System.out.println(A + " " + C + " " + B);
            }
        } else if (B <= A && B <= C) {
            if (A <= C) {
                System.out.println(B + " " + A + " " + C);
            } else {
                System.out.println(B + " " + C + " " + A);
            }
        } else {
            if (A <= B) {
                System.out.println(C + " " + A + " " + B);
            } else {
                System.out.println(C + " " + B + " " + A);
            }
        }

        scanner.close();
    }
}