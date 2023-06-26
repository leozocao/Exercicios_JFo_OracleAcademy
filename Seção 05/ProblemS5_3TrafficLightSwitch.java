import java.util.Scanner;

public class ProblemS5_3TrafficLightSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um código de cor: ");
        int corEscolhida = teclado.nextInt();
        teclado.close();

        String Cor;

        switch (corEscolhida) {
            case 1:
            Cor = "VERDE";
            System.out.println("O próximo sinal de trânsito é " + Cor); break;

            case 2:
            Cor = "AMARELO";
            System.out.println("O próximo sinal de trânsito é " + Cor); break;

            case 3:
            Cor = "VERMELHO";
            System.out.println("O próximo sinal de trânsito é " + Cor); break;
            
            default:
            Cor = "COR INVÁLIDA";
            System.out.println(Cor); break;
        }   

    }

}