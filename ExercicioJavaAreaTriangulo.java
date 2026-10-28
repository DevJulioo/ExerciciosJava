import java.util.*;

public class ExercicioJavaAreaTriangulo{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um número para a Base do Triangulo: ");
        int baseTriangulo = scn.nextInt();

        System.out.println("Digite um número para a Altura do Triangulo: ");
        int alturaTriangulo = scn.nextInt();

        int formulaAreaTriangulo = baseTriangulo * alturaTriangulo / 2;

        System.out.println("A área do triangulo é: " + formulaAreaTriangulo);
    }
}