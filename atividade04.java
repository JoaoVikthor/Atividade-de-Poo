import java.util.Scanner;

public class atividade04 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);

        //System out para informar o usuario
        System.out.println("Digite o valor pago: ");
        double pago = leitor.nextDouble();
        
        System.out.println("Digite o valor do produto: ");
        double produto = leitor.nextDouble();

        double troco = pago - produto;

        System.out.println("O valor do seu troco e: " +troco);
        
        leitor.close();
    }
}
