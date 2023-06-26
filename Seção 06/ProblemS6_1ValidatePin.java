import java.util.Scanner;

public class ProblemS6_1ValidatePin {
    public static void main(String[] args) {
        int pin = 1515;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o PIN: ");
        int userPin = teclado.nextInt();

        while (userPin != pin) {
            System.out.println("PIN incorreto. Tente novamente.");
            System.out.print("Insira o PIN: ");
            userPin = teclado.nextInt();
        }

        teclado.close();
        System.out.println("PIN correto. Acesso concedido.");
    }
}