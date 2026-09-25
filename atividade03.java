import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o consumo em kwh: ");
        int consumo = leitor.nextInt();

        System.out.println("Insira o valor em kwh: ");
        double valor = leitor.nextDouble();

        double total = consumo * valor;

        System.out.print("A sua conta de energia eletrica tem o volor total: " + total);

        leitor.close();
    }
}
