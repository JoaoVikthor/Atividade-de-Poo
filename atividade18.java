 import java.util.Scanner; // import do Scanner do java
 public class atividade18 { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] dia = {"segunda","terça","quarta","quinta","sexta","sabado","domingo"};

        for(int i = 0; i < dia.length; i++) {
                System.out.println(" Lembrar de regar as plantas na: "+dia[i]);
        }
    }
}
