import java.util.Scanner;

class ProblemS5_2TrafficLightChecker{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um código de cor: ");
        int corEscolhida = teclado.nextInt();

        teclado.close();

        String Cor;

        if (corEscolhida == 1) {
            Cor = "VERDE";
            System.out.println("A próxima cor do semafóro é: " + Cor);
        } else if (corEscolhida == 2) {
            Cor = "AMARELO";
            System.out.println("A próxima cor do semafóro é: " + Cor);
        } else if (corEscolhida == 3) {
            Cor = "VERMELHO";
            System.out.println("A próxima cor do semafóro é: " + Cor);
        } else {
            Cor = "COR INVÁLIDA";
            System.out.println(Cor);
        }

    }
}