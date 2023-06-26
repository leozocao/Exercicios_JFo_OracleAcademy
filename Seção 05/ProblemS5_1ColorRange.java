import java.util.Scanner;

public class ProblemS5_1ColorRange {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite um código de cor: ");
    double corDigitada = teclado.nextDouble();
    teclado.close();

    String cor;

    if (corDigitada >= 380 && corDigitada < 450) {
        cor = "Violeta";
    } else if (corDigitada >= 450 && corDigitada < 495) {
        cor = "Azul";
    } else if (corDigitada >= 495 && corDigitada < 570) {
        cor = "Verde";
    } else if (corDigitada >= 570 && corDigitada < 590) {
        cor = "Amarelo";
    } else if (corDigitada >= 590 && corDigitada < 620) {
        cor = "Laranja";
    } else if (corDigitada >= 620 && corDigitada < 750) {
        cor = "Vermelho";
    } else {
        cor = "A cor digitada não faz parte do expectro visível.";
    }

    System.out.println("A cor é " + cor);
}

}