import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lendo as 3 notas
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        // Calculando a média
        double media = (n1 + n2 + n3) / 3;

        // Exibindo com 2 casas decimais
        System.out.printf("Média: %.2f\n", media);

        sc.close();
    }
}