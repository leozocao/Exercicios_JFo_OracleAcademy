public class ProblemS7_1Terminal {

    private ProblemS7_1Premio[] categorias;
    
    public ProblemS7_1Terminal() {
        categorias = new ProblemS7_1Premio[3];
        categorias[0] = new ProblemS7_1Premio("Prêmio 1", 10, 5);
        categorias[1] = new ProblemS7_1Premio("Prêmio 2", 20, 10);
        categorias[2] = new ProblemS7_1Premio("Prêmio 3", 30, 15);
    }
    
    public void converterDinheiroEmCredito(ProblemS7_1Cartao cartao, int dinheiro) {
        int creditos = dinheiro * 2;
        cartao.adicionarCredito(creditos);
    }
    
    public void verificarSaldos(ProblemS7_1Cartao cartao) {
        System.out.println("Número do cartão: " + cartao.getNumero());
        System.out.println("Saldo de crédito: " + cartao.getSaldoCredito());
        System.out.println("Saldo de tíquetes: " + cartao.getSaldoTicket());
    }
    
    public void transferirCreditos(ProblemS7_1Cartao origem, ProblemS7_1Cartao destino, int quantidade) {
        if (origem.getSaldoCredito() >= quantidade) {
            origem.reduzirCredito(quantidade);
            destino.adicionarCredito(quantidade);
            System.out.println("Transferência de créditos realizada com sucesso");
        } else {
            System.out.println("Créditos insuficientes para transferência");
        }
    }
    
    public void trocarTicketsPorPremio(ProblemS7_1Cartao cartao, int categoriaIndex) {
        ProblemS7_1Premio categoria = categorias[categoriaIndex];
        if (cartao.getSaldoTicket() >= categoria.getTicketsObrigatorios()) {
            if (categoria.getQuantidadeDisponivel() > 0) {
                cartao.reduzirTicket(categoria.getTicketsObrigatorios());
                categoria.reduzirQuantidadeDisponivel();
                System.out.println("Prêmio " + categoria.getNome() + " concedido");
                System.out.println("Número restante desse prêmio: " + categoria.getQuantidadeDisponivel());
            } else {
                System.out.println("Prêmio esgotado");
            }
        } else {
            System.out.println("Tíquetes insuficientes para trocar por esse prêmio");
        }
    }
}