import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double reais = sc.nextDouble();

        double dolar = reais / 5.0;

        System.out.printf("Valor em dólares: %.2f\n", dolar);

        sc.close();
    }
}