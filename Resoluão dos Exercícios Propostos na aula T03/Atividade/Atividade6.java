import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        sc.close();
    }
}