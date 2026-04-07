//Receba uma letra e informe se é uma Vogal ou Consoante (Dica: use switch com múltiplos cases).

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("Vogal\n");
                break;
            default:
                System.out.printf("Consoante\n");
        }

        sc.close();
    }
}