import java.util.Scanner;

public class ExercicioJavaMediaNotas{

     public static void main(String [] args){

        // Classe Scanner para entrada de dados via teclado
        Scanner scn = new Scanner(System.in);

        // Entrada de dados 

        System.out.println("Digite a primeira nota: ");
        float nota1 = scn.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = scn.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = scn.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float nota4 = scn.nextFloat();

        // Cálculo da média das notas 

        // Somatória das notas 
        float somaNotas = nota1 + nota2 + nota3 + nota4;

        // Divisão das notas para o cálculo da média 
        float mediaNotas = somaNotas / 4;

        System.out.println("Sua média bimestral é: " + mediaNotas);

     }
}