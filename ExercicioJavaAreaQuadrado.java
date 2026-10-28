import java.util.Scanner;

public class ExercicioJavaAreaQuadrado {
    public static void main(String[] args) {
        
        double LadoQuadrado;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número de L = lado para o cálculo da área do quadrado: ");
        LadoQuadrado = scn.nextDouble();

        double calculoAreaQuadrado = LadoQuadrado * LadoQuadrado;

        System.out.println("A área do quadrado é: " + calculoAreaQuadrado);

        System.out.println("O dobro da área do quadrado é: " + calculoAreaQuadrado * 2);
    }
}
