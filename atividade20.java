//Import da biblioteca
import java.util.Scanner;

public class atividade20 {

    //Do While + variavel bool (Se o cliente ja pagou) + deve se repetir enqunato o pagamento nao for confirmado + print da mensagem A CADA EMISSAO 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;

         do { //Menu de opc para a cobraça
             
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println(" 1 - Emitir boleto de Cobrança ");
            System.out.println(" 2 - Confirmar Pagamento ");
            System.out.println(" 0 - Sair");
            System.out.print("Escolha: ");
            opc = teclado.nextInt();

            switch (opc) { //Switch de opcoes 
                case 1:
                    System.out.print(" --- Boleto de cobrança ---");
                    break;

                case 2:
                        System.out.print("Gostaria de Confirmar pagamento?");
                        System.out.print("Digite 1 para SIM ou 2 para NÃO: ");

                        double pago = teclado.nextDouble();

                            if(pago == 1){
                                System.out.print("Pagamento Confirmado com Sucesso!!");
                            }else if(pago == 2){
                                System.out.print("Pagamento nao efetuado, por favor voltar ao inicio");
                            }else{
                                System.out.print("Opçao invalida, digite um numero valido!");
                            }                           
                    break;
                default: 
                System.out.print("Opçao invalida saindo do programa");
                    break;
            }
        
    } while (opc != 0);

    }
     

}
