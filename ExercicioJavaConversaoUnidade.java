import java.util.Scanner;

public class ExercicioJavaConversaoUnidade{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        double temperaturaF;

        System.out.println("Digite a temperatura em graus Fahrenheit ");
        temperaturaF = scn.nextDouble();

        double conversaoCelsius = (temperaturaF - 32) * 5 / 9;

        System.out.println("A conversao de Fahrenheit para Celsius é: " + conversaoCelsius);
    }
}