import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProblemS8_1Main {
    public static void main(String[] args) {
        
        int jogosPorSemana = 0;

        ArrayList<ProblemS8_1Time> equipes = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {


            while (jogosPorSemana < 3) {

                System.out.println("---PARA ENCERRAR DIGITE VALORES NEGATIVOS---");
                System.out.println("    ---OU VALORES ACIMA DE 40 GRAUS---\n");
                System.out.println("Digite a temperatura da semana: ");

                double temperaturaDaSemana = input.nextDouble();

                if (temperaturaDaSemana < 0 || temperaturaDaSemana > 40) { break; }

                if (temperaturaDaSemana <= 0) { jogosPorSemana++; } 

                else {
                    jogosPorSemana = 0;

                    if (temperaturaDaSemana >= 20) {
                        String equipeA = ProblemS8_1Time.gerarEquipeAleatoria();
                        String equipeB = ProblemS8_1Time.gerarEquipeAleatoria();

                        while (equipeA.equals(equipeB)) {
                            equipeB = ProblemS8_1Time.gerarEquipeAleatoria();
                        }

                        ProblemS8_1Jogo jogoDeFutebol = new ProblemS8_1Jogo(equipeA, equipeB, temperaturaDaSemana);
                        equipes.add(jogoDeFutebol.getEquipe1());
                        equipes.add(jogoDeFutebol.getEquipe2());
                    }

                }

            }

        } catch(IllegalArgumentException e){
            String excecao = "Valores digitados inválidos, a temporada está encerrada. ";
            JOptionPane.showMessageDialog(null, excecao);
        }


        ArrayList<ProblemS8_1Jogo> temporadaAtual = ProblemS8_1Jogo.getTemporada();
        equipes.sort(ProblemS8_1Time.ComparadorNomeDasEquipes);

        for (ProblemS8_1Jogo partida : temporadaAtual) {
            partida.imprimirEstatisticas();
        }

        System.out.println("Estatísticas Gerais das Equipes:");
        ProblemS8_1Time equipeAtual = null;

        for (ProblemS8_1Time equipe : equipes) {
            if (equipeAtual == null || !equipe.getNomeTime().equals(equipeAtual.getNomeTime())) {

                if (equipeAtual != null) {
                    equipeAtual.imprimirEstatisticas();
                }
                equipeAtual = equipe;
            } 
            else {
                equipeAtual.atualizarEstatisticas(equipe.getGolsMarcados(), equipe.getGolsSofridos());
            }
        }
        
        if (equipeAtual != null) {
            equipeAtual.imprimirEstatisticas();
        }

        double temperaturaMaisQuente = 0.0;
        double temperaturaTotal = 0.0;

        for (ProblemS8_1Jogo partida : temporadaAtual) {
            temperaturaTotal += partida.getTemperatura();
            if (partida.getTemperatura() > temperaturaMaisQuente) {
                temperaturaMaisQuente = partida.getTemperatura();
            }
        }

        double temperaturaMedia = temperaturaTotal / temporadaAtual.size();

        System.out.printf("Temperatura mais quente: %.1f\n", temperaturaMaisQuente);
        System.out.printf("Temperatura média: %.1f\n", temperaturaMedia);

    }


}
