import java.util.Scanner;

public class ProblemS6_2DisplayMultiples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();

        teclado.close();

        for (int i = 1; i <= 12; i++) {
            int resultado = num * i;
            System.out.println(num + "x" + i + " = " + resultado);
        }
    }
}