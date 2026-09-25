//Import da biblioteca Scanner
import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double soma = 0;
    double temperatura = 0;
    
    while(temperatura != -100){
        System.out.print("Digite a temperatura atual (ou - 100 para sair)");
        temperatura = teclado.nextDouble();

        if(temperatura != -100){
            soma += temperatura; 
        }
       
    }

    System.out.print("A soam das temperaturas e de: "+ soma);

    teclado.close();
    }
}
