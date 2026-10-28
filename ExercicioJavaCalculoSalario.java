import java.util.Scanner;

public class ExercicioJavaCalculoSalario{
     public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        double salarioHora;
        double horaMes;

        System.out.println("Quanto voce ganha por hora? ");
        salarioHora = scn.nextDouble();

        System.out.println("Digite seu número de horas trabalhadas no mes: ");
        horaMes = scn.nextDouble();

        double calculoSalarioTotal = salarioHora * horaMes;

        double calculoSalarioArredondado = Math.round(calculoSalarioTotal);

        System.out.println("Seu salário total no mes é: " + calculoSalarioArredondado);

     }
}