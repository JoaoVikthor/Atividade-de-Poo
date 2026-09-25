import java.util.Scanner;

public class atividade02 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Inisira o valor do propduto e sua quantidade ");
        System.out.println("Insira o preco do produto: ");
        double prec =  leitor.nextDouble();
        System.out.println("Informe a quantidade: ");
        int quant = leitor.nextInt();   
        System.out.println(" voce comprou: "+ quant + " custando: "+ prec);
        leitor.close();
    }
}
