import java.util.*;

public class ExercicioCalculoVolumeEsfera {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        double raioEsfera;

        System.out.println("Digite um valor para o Raio da esfera: ");
        raioEsfera = scn.nextDouble();

        double raioCubo = raioEsfera * raioEsfera * raioEsfera;
        double divMul = (4.0 / 3.0) * 3.14;

        double formulaVolume = raioCubo * divMul;

        double arredondarFormula = Math.round(formulaVolume);

        System.out.println("O volume da esfera é: " + arredondarFormula);

    }
}