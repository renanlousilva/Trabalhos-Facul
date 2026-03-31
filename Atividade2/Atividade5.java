import java.util.Scanner;

public class Atividade5
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("É múltiplo de 3 e de 5 ao mesmo tempo");
        } else {
            System.out.println("Não é múltiplo de 3 e de 5 ao mesmo tempo");
        }

        scanner.close();
    }
}