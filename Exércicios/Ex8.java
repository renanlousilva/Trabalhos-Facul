//Receba o ano de nascimento de uma pessoa e informe se ela nasceu no século XX, XXI ou outro).

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();

        if (ano >= 1901 && ano <= 2000) {
            System.out.printf("Você nasceu no século XX\n");
        } else if (ano >= 2001 && ano <= 2100) {
            System.out.printf("Você nasceu no século XXI\n");
        } else {
            System.out.printf("Você nasceu em outro século\n");
        }

        sc.close();
    }
}