
import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra: ");
        double compra = leitor.nextDouble();

         compra -= compra * 0.10;

        System.out.println("O valor da sua compra com desconto e de: "+ compra);
    }
}
