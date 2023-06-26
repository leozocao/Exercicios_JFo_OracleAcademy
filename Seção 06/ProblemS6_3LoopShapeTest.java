import java.util.Scanner;

public class ProblemS6_3LoopShapeTest {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        int largura = teclado.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int altura = teclado.nextInt();
        createRectangle(largura, altura);

        System.out.print("Digite o tamanho da base do triângulo isóceles: ");
        int base = teclado.nextInt();
        createTriangle(base);
        teclado.close();
    }

    private static void createTriangle(int base) {
        if (base <= 1) {
            System.out.println("A base deve ser maior que 1");
            return;
        } else {
            for (int i = 0; i <= base; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

    private static void createRectangle(int largura, int altura) {
        if (largura <= 1 || altura <= 1) {
            System.out.println("A largura e a altura devem ser maiores que 1");
            return;
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < largura; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

}
