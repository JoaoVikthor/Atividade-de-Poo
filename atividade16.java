
import java.util.Scanner; //import do Scanner

public class atividade16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o valor de sua renda do mes: ");
        double renda = teclado.nextDouble();

        if(renda >= 2500){
            System.out.println("Financiamento Aprovado!");
        }else{
            System.out.println("Financiamento Negado");
        }
        teclado.close();
    }
}
