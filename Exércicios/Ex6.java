//Receba a idade de um nadador e classifique-o como: Infantil (5-10), Juvenil (11-17) ou Sênior (18+).

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = sc.nextInt();

        if (idade >= 5 && idade <= 10) {
            System.out.printf("Infantil\n");
        } else if (idade >= 11 && idade <= 17) {
            System.out.printf("Juvenil\n");
        } else if (idade >= 18) {
            System.out.printf("Sênior\n");
        } else {
            System.out.printf("Idade inválida!\n");
        }

        sc.close();
    }
}