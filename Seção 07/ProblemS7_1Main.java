public class ProblemS7_1Main {
        public static void main(String[] args) {
            ProblemS7_1Cartao cartao1 = new ProblemS7_1Cartao(1);
            ProblemS7_1Cartao cartao2 = new ProblemS7_1Cartao(2);
            ProblemS7_1Jogos jogo = new ProblemS7_1Jogos(5);
            ProblemS7_1Terminal terminal = new ProblemS7_1Terminal();
            
            terminal.converterDinheiroEmCredito(cartao1, 10);
            terminal.converterDinheiroEmCredito(cartao2, 20);
            
            jogo.jogar(cartao1);
            jogo.jogar(cartao2);
            
            terminal.transferirCreditos(cartao1, cartao2, 5);
            
            terminal.verificarSaldos(cartao1);
            terminal.verificarSaldos(cartao2);
            
            terminal.trocarTicketsPorPremio(cartao2, 15);
            
            jogo.jogar(cartao1);
            terminal.trocarTicketsPorPremio(cartao1, 15);
        }
}
