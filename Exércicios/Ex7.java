//Receba o peso e a altura, calcule o IMC e exiba a classificação completa da OMS (6 categorias).
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.printf("Abaixo do peso\n");
        } else if (imc < 25) {
            System.out.printf("Peso normal\n");
        } else if (imc < 30) {
            System.out.printf("Sobrepeso\n");
        } else if (imc < 35) {
            System.out.printf("Obesidade grau I\n");
        } else if (imc < 40) {
            System.out.printf("Obesidade grau II\n");
        } else {
            System.out.printf("Obesidade grau III\n");
        }

        sc.close();
    }
}