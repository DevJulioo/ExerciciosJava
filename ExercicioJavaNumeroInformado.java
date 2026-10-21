import java.util.Scanner;

public class ExercicioJavaNumeroInformado{
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);

        // Número digitado pelo usuário
        System.out.println("Digite um número: ");
        byte num = scn.nextByte();

        // Mensagem de número informado
        System.out.println("O número informado foi: " + num);

    }
}