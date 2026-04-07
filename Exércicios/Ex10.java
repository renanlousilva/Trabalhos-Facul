//Leia as coordenadas (x, y) de um ponto e informe em qual quadrante (I, II, III ou IV) ele se encontra (ou se está sobre o eixo x ou sobre o eixo y).

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a coordenada X: ");
        double x = sc.nextDouble();

        System.out.print("Digite a coordenada Y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("O ponto está na origem");
        } else if (x == 0) {
            System.out.println("O ponto está sobre o eixo Y");
        } else if (y == 0) {
            System.out.println("O ponto está sobre o eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("O ponto está no Quadrante I");
        } else if (x < 0 && y > 0) {
            System.out.println("O ponto está no Quadrante II");
        } else if (x < 0 && y < 0) {
            System.out.println("O ponto está no Quadrante III");
        } else { // x > 0 && y < 0
            System.out.println("O ponto está no Quadrante IV");
        }

        sc.close();
    }
}