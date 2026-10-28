import java.util.Scanner;

public class ExercicioJavaAreaCirculo{
    public static void main(String [] args){

        // Classe que possibilita a entrada de dados 

        Scanner scn = new Scanner(System.in);

        // Armazenamento dos valores nas variáveis

        double raio;
        double pi = 3.14;

        // Entrada de dados via teclado

        System.out.println("Digite o Raio do circulo: ");
        raio = scn.nextInt();

        // Variável que armazena o cálculo da área do circulo

        double CalculoAreaCirculo = pi * raio * raio;

        // Imprimindo no tela o resultado do cálculo da variável da área do circulo

        System.out.println("A área do circulo é: " + CalculoAreaCirculo);
        
    }
}