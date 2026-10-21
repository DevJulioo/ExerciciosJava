import javax.swing.JOptionPane;

public class ExercicioJavaHelloWord {
    public static void main(String [] args){

        /* Imprimir na tela dessa maneira direta */
        System.out.println("Hello Word!");

        /* Impressão de dados porém digitado pelo usuário pelo terminal = Entrada de dados */
        JOptionPane.showInputDialog(null, "Digite Hello Word");
    }
}
